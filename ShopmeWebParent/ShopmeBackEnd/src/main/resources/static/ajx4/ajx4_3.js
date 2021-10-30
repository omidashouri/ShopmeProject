function requestListener() {

    //this is xhr
    console.log('this is what the request look like', this);

    let data = JSON.parse(this.responseText);
    console.log('the response text is now converted to JSON',data);
    let user = data.results[0];
    console.log('user looks like ',user);

    //extract data we would like to use and display on our page
    let fname = user.name.first;
    let lname = user.name.last;
    let src = user.picture.large;

    //create our html elements
    let li = document.createElement('li');
    let img = document.createElement('img');
    let p = document.createElement('p');

    img.src = src;
    p.innerHTML = `${fname} ${lname}`;

    //append this items to out html
    document.getElementById('user').appendChild(li);
    li.appendChild(img);
    li.appendChild(p)

}

function requestError(){
    console.log('oops, i did it again');
}


function requestError() {
    console.log('this id Errrrrrrrrrrrrrror');
}


let url = "https://randomuser.me/api";
let method = "GET";

let xhr = new XMLHttpRequest();
console.log('this is what our request looks like initially', xhr);

xhr.open(method, url, true);

//when the user has been retrived from server
xhr.onload = requestListener;

//onerror execute when we have error
xhr.onerror = requestError;


xhr.send();