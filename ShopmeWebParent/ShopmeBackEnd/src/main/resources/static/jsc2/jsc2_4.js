const btn = document.querySelector('.btn');
const h1 = document.querySelector('h1');
const output = document.querySelector('.output');
const inputVal = document.querySelector('.val');
// create object of urls
const urls = [
    {
        'url': 'json_2_4_books.json',
        'arr': 'books',
        'title': 'Books List'
    },
    {
        'url': 'json_2_4_friends.json',
        'arr': 'people',
        'title': 'Friends List'
    },
    {
        'url': 'json_2_4_bitcoin.json',
        'arr': 'data',
        'title': 'Bitcoin List'
    }
]
h1.innerHTML = '';
inputVal.value = 'test';
btn.textContent = 'click me';
btn.addEventListener('click', (event) => {
    // console.log(event);
    // console.log(event.path[3].location.href);
    const temp = urls[0];
    console.log(temp);
    myUrl(urls[2]);
})

urls.forEach(ele => {
    const btn1 = document.createElement('button');
    h1.append(btn1);
    btn1.textContent = ele.title;
    btn1.classList.add('btn');
    btn1.addEventListener('click', (e) => {
        myUrl(ele);
    })
})

function myUrl(myObject) {
    let url = myObject.url;
    fetch(url)
        .then(resp => resp.text())
        .then((data) => {
            // console.log(data);

            //if the file hase space and we want to remove them  use regular expression:
            //let val = data.replace(/\s/g,'');

            const json = JSON.parse(data);
            // console.log(json);

            console.log(url)
            output.innerHTML = url + '<br/>';

            //convert to json and get books as an array
            // console.log(json[myObject.arr]); //or: console.log(json.books);

            maker(json[myObject.arr]);

        })
        .catch(err => {
            console.log(err)
        });
}

function maker(arr) {
    // console.log(arr.length);

    arr.forEach(el => {
        console.log(el);

        const div = document.createElement('div');
        div.classList.add('box');
        output.append(div);

        //convert json to object which is array; and each line convert to array
        const entries = Object.entries(el);
        // console.log(entries);
        div.innerHTML = 'Properties :' + entries.length;

        for (const obj of entries) {
            // console.log(obj);
            div.innerHTML += `<br>${obj[0]} : ${obj[1]}`;
        }

    })
}