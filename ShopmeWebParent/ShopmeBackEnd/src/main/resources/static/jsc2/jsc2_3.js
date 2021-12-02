// const url = 'http://api.wikimapia.org/?key=example&function=place.getnearest&format=json';
const url = 'http://api.wikimapia.org/?key=example&function=place.getnearest&format=json';
const btn = document.querySelector('.btn');
const output = document.querySelector('.output');
const inputVal = document.querySelector('.val');
const inputVal2 = document.createElement('input');
inputVal2.setAttribute('type', 'text');
document.body.prepend(inputVal2);
const h1 = document.querySelector('h1');
document.body.prepend(h1);
inputVal.value = '48.858252';   //lat
inputVal2.value = '2.29451';    //lon
btn.textContent = 'Search Map Closest';
btn.addEventListener('click', (e) => {
    let lat = inputVal.value;
    let lon = inputVal2.value
    let tempUrl = `${url}&lat=${lat}&lon=${lon}`;
    console.log(tempUrl);
    fetch(tempUrl)
        .then((res) => res.json())
        .then((data) => {
            // console.log(data);
            output.innerHTML = JSON.stringify(data);
        })
        .catch((err) => {
            console.log(err);
        })
})