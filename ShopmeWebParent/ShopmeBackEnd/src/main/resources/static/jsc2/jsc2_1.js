const url = 'https://www.discoveryvip.com/shared/test1.json';
const localUrl = 'people2_1.json';
const btn = document.querySelector('.btn');
const output = document.querySelector('.output');
const inputVal = document.querySelector('.val');
let attemptCounter = false;
inputVal.style.display = 'none';
btn.textContent = 'Load JSON data';

btn.addEventListener('click', (e) => {
    getData(localUrl);
});

function getData(urlPath) {
    fetch(urlPath)
        .then(rep => rep.json())
        .then((json) => {
            console.log(json);
            maker(json);
        }).catch(err => {
        //if there is error then fetch by url
        if (!attemptCounter) {
            getData(url);
        }
        attemptCounter = true;
        console.log(err);
    });
}

function maker(data) {
    output.innerHTML = '<h1>JSON Data</h1>';
    data.forEach((element, index) => {
        console.log(element);
        const bg = index % 2 == 0 ? '#ccc' : '#fff';
        const div = document.createElement('div');
        div.style.backgroundColor = bg;
        // output.innerHTML += `${JSON.stringify(element)}</br>`;
        div.innerHTML += `<div>${element.name.first} ${element.name.last}</div>`;
        div.innerHTML += `<div>${element.location.city} ${element.location.country}</div>`;
        div.innerHTML += `<div>${element.age}</div>`;

        output.append(div);
    })

}