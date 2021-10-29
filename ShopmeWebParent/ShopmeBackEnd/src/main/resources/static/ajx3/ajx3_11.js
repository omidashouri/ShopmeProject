const div = document.createElement("div");
div.innerHTML = "click me";
document.body.append(div);
div.addEventListener('click',output);
const vals = document.querySelector('input');


const url = 'https://script.google.com/macros/s/AKfycbwa4QvH8bPPRNIPCvFJlYVtt9-RuDdqY91tlqDctTxAkpu-9VV8tPsjY2MNusVpSAr_/exec&callback=?';


function output(){
    let headers = new Headers();
    headers.append('Access-Control-Allow-Origin', 'http://localhost:8080');
    headers.append('GET', 'POST', 'OPTIONS');
    headers.append('Access-Control-Allow-Credentials', 'true');
    headers.append('Content-Type', 'application/x-www-form-urlencoded');
    // headers.append('Accept', 'application/json');
    // headers.append('Authorization', 'Basic ' + base64.encode(username + ":" + password));

    const payload = {
        message: vals.value,
        counter: 1000
    };

    fetch(url,{
        headers: headers,
            // mode: 'no-cors',
            // credentials: "include",
        method:'POST',
        body: JSON.stringify(payload)
    },
        )
        // .then((response)=>response.json())
        .then((response)=>response)
        .then((data)=>console.log(data))
        .catch(error=>console.log(error.message));

}

function updateDiv(val){
    div.innerHTML = `${val}`;
}