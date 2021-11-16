// $(document).ready(function () {

const div = document.createElement("div");
div.innerHTML = "click me";
document.body.append(div);
div.addEventListener('click', output);
const vals = document.querySelector('input');

const urlMessage = 'ajx5_2_message.txt';
let userInfoJson;
let userTokenJson;
let apiResponseJson;

let headers = new Headers();
headers.append('Content-Type', 'application/json');
headers.append('Accept', 'application/json');
headers.append('Access-Control-Allow-Headers', '*');
headers.append('Access-Control-Expose-Headers', '*');
headers.append('Access-Control-Allow-Origin', 'http://localhost:8080/');


function getUserInfo(urlInfo) {
    console.log('getUserInfo');
    return fetch(urlInfo)
        .then((response) => response.json())
        .then(data => data)
        .catch(error => console.log(error));
}

function getUserToken(userInfoJson) {
    console.log('getUserToken');
    return fetch(userInfoJson.apiLoginUrl, {
        method: "POST",
        headers: headers,
        host: userInfoJson.host,
        Origin: userInfoJson.origin,
        mode: 'cors',
        credentials: 'same-origin',
        referrerPolicy: 'no-referrer',
        body: JSON.stringify({
            username: userInfoJson.username,
            password: userInfoJson.password,
            role: userInfoJson.role
        })
    }).then(response => response)
        .catch(error => console.log(error));
}

function getApiRequest(userInfoJson, userTokenJson) {
    console.log('getApiRequest');
    return fetch(userInfoJson.requestUrl1, {
        method: "GET",
        headers: {
            'Authorization': userTokenJson.headers.get("Authorization"),
            'Content-Type': 'application/json',
            'Accept': 'application/json'
        }
    }).then(response => response.json())
        .catch(error => console.log(error));
}


async function asyncCall() {
    console.log('asyncCall');

    userInfoJson = await getUserInfo(urlMessage);

    userTokenJson = await getUserToken(userInfoJson);

    apiResponseJson = await getApiRequest(userInfoJson, userTokenJson);

    div.innerHTML = '';
    apiResponseJson._embedded.users.forEach(user => {
        var myJSON = JSON.stringify(user);
        const myArray = myJSON.split(',');
        myArray
            .filter(us => !us.match('href'))
            .forEach(us => {
                updateDiv(us);
            });
    });

}


function output() {
    div.innerHTML = '';
    asyncCall();
}

function updateDiv(val) {
    div.innerHTML += `${val} <br>`;
}