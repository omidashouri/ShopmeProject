const btn = document.querySelector('.btn');
const h1 = document.querySelector('h1');
h1.style.width = '80%';
h1.style.margin = 'auto';
h1.style.textAlign = 'center';
h1.style.border = '5px solid #ddd';
const output = document.querySelector('.output');
const inputVal = document.querySelector('.val');
// https://cors-anywhere.herokuapp.com/
const url = 'https://randomuser.me/api/';
inputVal.value = '10';
inputVal.setAttribute('type', 'number');
btn.textContent = 'Click Me';
btn.addEventListener('click', (e) => {
    console.log('ready')
    //we are creating a request parameter
    let val = `?results=${inputVal.value}`;

    adder(url + val);
})

function adder(url) {
    // console.log(url)
    fetch(url)
        .then(rep => rep.json())
        .then(data => {
            // console.log(data)
            output.innerHTML = `<h3>Seed : ${data.info.seed}
            <br\>Results: ${data.info.results}</h3>`;
            maker(data.results);
            // makerArr(data.results);
        })
        .catch(e => console.log(e))
}

function maker(data) {
    // console.log(data)
    data.forEach(el => {
        console.log(el)
        const loc = el.location;
        const div = eleMaker('div', output, '');
        div.classList.add('box');

        const temp = `${el.name.title} ${el.name.first} ${el.name.last} 
                         <br/>${el.email} <br/>Age : ${el.dob.age}`;
        const temp1 = `<img src="${el.picture.large}">`;

        div.addEventListener('click', (e) => {
            h1.innerHTML = temp + '<div>' + temp1 + '</div>';
            //scroll to top of page
            window.scrollTo({top: 0})
        })


        const temp2 = `${loc.city} ${loc.country} ${loc.state}>`
        eleMaker('div', div, temp)
        eleMaker('div', div, temp1)
        eleMaker('div', div, temp2)

    })
}

function eleMaker(eleTag, parent, contents) {
    const elem = document.createElement(eleTag);
    parent.append(elem);
    elem.innerHTML = contents;
    return elem;
}


//for self study
let fullName = '';

function makerArr(data) {
    console.log(data);
    data.forEach(el => {
        console.log(Object.entries(el.name))
        for ([k, v] of Object.entries(el.name)) {
            fullName += ` ${v}`;
        }
        console.log(fullName)
        fullName = '';
    })
}