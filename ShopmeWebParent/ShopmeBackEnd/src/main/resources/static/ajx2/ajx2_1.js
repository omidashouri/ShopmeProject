// https://jsonplaceholder.typicode.com/

var httpRequest;
var postsUrl = "https://jsonplaceholder.typicode.com/posts";
var jsonResponse;


function makeAjaxRequest() {
    httpRequest = new XMLHttpRequest();
    var url = "https://jsonplaceholder.typicode.com/todos/1";


    httpRequest.open("GET", postsUrl);
    httpRequest.send();

    httpRequest.onreadystatechange = ajaxResponse;
}


//this function contains both the status and data
function ajaxResponse() {
    //we have response
    if (httpRequest.readyState == XMLHttpRequest.DONE) {

        //check the status : 200 , 400, 401, 201, 500 --> response code
        if (httpRequest.status == 200) {
            //success
            //get data
            alert("we have the data");

            //data is text
            console.log(httpRequest.responseText);

            //convert string to json
            jsonResponse = JSON.parse(httpRequest.responseText);
            console.log(jsonResponse);

            //insert posts into html
            insertPostsIntoHTML(jsonResponse);

        } else {
            //failure
            alert("This is a problem with the server.");
        }

    } else {
        console.log("ready state is not done yet!");
    }
};


function insertPostsIntoHTML(posts) { //posts is an array

    //make reference t div that has an id of posts
    var postsDiv = document.getElementById("posts");

    //loop over the posts
    posts.map((post, index) => { //this function gets called each time we have a post
        //do what ever you want with the post (add new line to the previous data)
        postsDiv.innerHTML = postsDiv.innerHTML +
            "<h2>" + post.title + "</h2>" +
            "<p>" + post.body + "</p>" +
            "<span>" + post.id + "</span>";
    });
}

makeAjaxRequest();

