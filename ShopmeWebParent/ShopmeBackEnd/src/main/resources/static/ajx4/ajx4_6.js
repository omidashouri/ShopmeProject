let url = "https://randomuser.me/api";


fetch(url)
    .then(responseOne => responseOne.json())
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
    })
    .catch(error => console.log('oops there is an erro', error));