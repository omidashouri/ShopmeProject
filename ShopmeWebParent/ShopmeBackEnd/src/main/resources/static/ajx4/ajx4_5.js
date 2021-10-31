let url = "https://jsonplaceholder.typicode.com/posts";

let customPost = {
    title: "Hello world",
    body: "This is my story ... blah blah",
    userID: 1
}

let customHeader = {
    "Content-Type": "application/json; charset=utf-8"
}

//let post
fetch(url, {
    method: "POST",
    headers: customHeader,
    body: JSON.stringify(customPost)
})
    .then(response => response.json())
    // .then(response => console.log(response));
    .then(onFulfilled => {
        console.log(onFulfilled); // Success!
    }, onRejected => {
        console.error(onRejected); // Error!
    });