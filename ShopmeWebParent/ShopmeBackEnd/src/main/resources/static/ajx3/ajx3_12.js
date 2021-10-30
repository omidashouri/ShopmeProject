const div = document.createElement("div");
div.innerHTML = "click me";
document.body.append(div);
div.addEventListener('click', output);
const vals = document.querySelector('input');


const url = 'https://randomuser.me/api?results=';


function output() {
    console.log(vals.value);
    div.innerHTML = '';
    fetch(url + vals.value)
        .then((response) => response.json())
        .then((data) => data.results.forEach((person) => {
            // console.log(`${person.name.first}   ${person.name.last}` );
            updateDiv(`${person.name.first}   ${person.name.last}`);
        }));
    // .then((data) => console.log(data));

}

function updateDiv(val) {
    div.innerHTML += `${val} <br>`;
}