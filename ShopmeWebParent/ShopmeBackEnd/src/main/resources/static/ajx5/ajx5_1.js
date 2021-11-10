$(document).ready(function () {


    //https://stackoverflow.com/questions/40981040/using-a-fetch-inside-another-fetch-in-javascript
let url = "https://api.imi.ir/edu-imi-ws/api/users/login";
    let customPost = {
        username: 9057,
        password: 1,
        role: "anonymous"
    }

    let customHeader = {
        "Content-Type": "application/json",
        "Accept": "application/json",
        "Access-Control-Expose-Headers": "Authorization, Origin, Content-Type, Accept, X-Auth-Token",
        "access-control-allow-credentials": "true",
        "access-control-allow-origin": "http://localhost:8080"
    }
    let headers = new Headers();
    headers.append('Content-Type', 'application/json');
    headers.append('Accept', 'application/json');
    headers.append('Access-Control-Allow-Headers', '*');
    headers.append('Access-Control-Expose-Headers', '*');
    headers.append('Access-Control-Allow-Origin', 'http://localhost:8083/');


    let myauthorization;


    const resultPromise =
        fetch(url, {
            method: "POST",
            headers: headers,
            /*            headers: {
                            'Content-Type': 'application/json',
                            'Accept': 'application/json',
                            'Access-Control-Allow-Headers': '*',
                            'access-control-expose-headers': '*',
                            'Access-Control-Allow-Origin': ''
                        },*/
            host: 'https://api.imi.ir/',
            Origin: 'http://localhost:8083/',
            mode: 'cors',
            credentials: 'same-origin',
            referrerPolicy: 'no-referrer',
            body: JSON.stringify({username: 9057, password: 1, role: 'anonymous'})
        })
            .then(
                function (resp) {
                    console.log(resp.status);

                    resp.headers.forEach(function (val, key) {
                        console.log(key + ' -> ' + val);
                    });
                    myauthorization = resp.headers.get("Authorization")
                    console.log(resp.headers.get("Authorization"));
                    console.log('MyAuthorization' + myauthorization);


                    urlInner = 'https://api.imi.ir/edu-imi-ws/api/v1/users/nationalCode/0075175266';
                    return fetch(urlInner, {
                        method: "GET",
                        headers: {
                            'Authorization': myauthorization,
                            'Content-Type': 'application/json',
                            'Accept': 'application/json'
                        }
                    })
                        .then(responseI => responseI.json())
                        .then(responseBodyI => {
                            console.log('The response body of the inner/nested request:');
                            console.log(JSON.stringify(responseBodyI) + '\n\n');
                            return responseBodyI;
                        }).catch(err => {
                            console.error('Failed to fetch - ' + urlInner);
                            console.error(err);
                        });


                })




            /*.then(responseOne => responseOne.json())
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
            .catch(error => console.log('oops there is an error', urlOuter));


    resultPromise.then(jsonResult => {
        console.log('Result - the title is "' + JSON.stringify(jsonResult) + '".');
    });

});