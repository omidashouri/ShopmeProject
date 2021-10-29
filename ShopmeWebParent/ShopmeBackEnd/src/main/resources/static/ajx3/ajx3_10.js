const div = document.createElement("div");
div.innerHTML = "click me";
document.body.append(div);
div.addEventListener('click',output);
const vals = document.querySelector('input');

const cityName = 'Tehran';
const key = '079d7d2a966051f468b6f8b9e97a0480';
const url = 'https://api.openweathermap.org/data/2.5/weather?q='+cityName+'&appid='+key;


function output(){

    fetch(url)
        .then(rep=>rep.json())
        .then(data =>{
            console.log(data)
            updateDiv(`${data.name} ${data.weather[0].description}`);
        });

}

function updateDiv(val){
    div.innerHTML = `${val}`;
}