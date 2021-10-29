const url = 'ajx3_8_message.txt';
const div = document.createElement("div");
div.innerHTML = "click me";
document.body.append(div);
div.addEventListener('click',output);
const vals = document.querySelector('input');

function output(){
    const mes = vals.value;
    fetch(url).then((rep)=>{
        return rep.json();
    }).then(data=>{
        console.log(data);
        console.log(data.message);
        console.log(mes);

        updateDiv(data.message +' '+mes);
    }).catch(error=>console.log(error));
}

function updateDiv(val){
    div.innerHTML = `${val}`;
}