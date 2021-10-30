function requestListener() {

    console.log('this is what the request look like', this);

    let data = JSON.parse(this.responseText);
    console.log(data);

}


function requestError() {
    console.log('this id Errrrrrrrrrrrrrror');
}


let url = "https://randomuser.me/api";
let method = "GET";

let xhr = new XMLHttpRequest();
console.log('...', xhr);

xhr.open(method, url, true);

xhr.onload = requestListener;

//onerror execute when we have error
xhr.onerror = requestError;


xhr.send();