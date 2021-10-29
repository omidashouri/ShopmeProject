const url = "https://randomuser.me/api";
const div = document.createElement("div");
div.innerHTML = "click me";
document.body.append(div);
div.addEventListener('click',output);

function output(){
    fetch(url).then((rep)=>{
        return rep.json();
    }).then(data=>{
        console.log(data);

        const person = data.results[0].name;
        console.log(person);
        div.innerHTML = `${person.first} ${person.last}`;
    }).catch(error=>console.log(error));
}