$(document).ready(function () {

    // https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS
    // https://sebtrif.xyz/blog/2019-10-03-client-side-ssl-in-node-js-with-fetch/
let url = "https://api.imi.ir/edu-imi-ws/api/users/login";
let customPost = {
    username: 9057,
    password: 1,
    role: "anonymous"
}

let customHeader = {
    "Content-Type": "application/json",
    "Accept":"application/json",
    "Access-Control-Expose-Headers":"Authorization, Origin, Content-Type, Accept, X-Auth-Token",
    "access-control-allow-credentials": "true",
    "access-control-allow-origin":"http://localhost:8080"
}
    let headers = new Headers();
    headers.append('Content-Type', 'application/json');
    headers.append('Accept', 'application/json');
    // headers.append('Host', 'api.imi.ir');
    headers.append('Access-Control-Allow-Origin', 'http://localhost:8080');
    headers.append('Access-Control-Allow-Headers', 'Origin, X-Requested-With, Content-Type, Accept, Authentication');
    headers.append('Access-Control-Allow-Methods', 'POST, OPTIONS, FETCH');


fetch(url, {
    method: "POST",
    headers: headers,
    // host:'api.imi.ir',
    // mode: 'no-cors',
    // credentials: 'same-origin,include',
    credentials: 'include',
    agent: httpsAgent,
    // body: JSON.stringify(customPost)
    body: JSON.stringify({username: 9057, password:1619993814,role: 'anonymous'})
})
    .then(
        function(resp) {
        console.log(resp.status);
        console.log(resp.statusCode);
        console.log(JSON.stringify(resp.headers));
       resp.headers.forEach(function(val, key) {
            console.log(key + ' -> ' + val);});
        console.log(resp.headers.get("authorization"));

    }).then(() => console.log("salammmmmmmmmm"))
    /*    .then(responseOne => responseOne.json())
        // .then(responseTwo => console.log(responseTwo))
        .then(function (responseTwo) {
            let user = responseTwo.results[0];
            console.log(user);

            // for each user display user on screen
            let li = document.createElement("li");
            let img = document.createElement("img");
            let p = document.createElement("p");

            //add a src attribute that we can see the picture
            img.src = user.picture.large;

            //    lets add person nam on the image
            p.innerHTML = `${user.name.first} ${user.name.last}`;

            // lets add all elements to the dom
            li.appendChild(img);
            li.appendChild(p);
            document.getElementById('user').appendChild(li);
        })*/
    .catch(error => console.log('oops there is an erro', error));

});