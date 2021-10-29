const url = 'ajx3_8_message.txt';
const div = document.createElement("div");
div.innerHTML = "click me";
document.body.append(div);
div.addEventListener('click',output);

function output(){
    fetch(url).then((rep)=>{
        return rep.text();
    }).then(data=>{
        console.log(data);

        div.innerHTML = `${data}`;
    }).catch(error=>console.log(error));
}