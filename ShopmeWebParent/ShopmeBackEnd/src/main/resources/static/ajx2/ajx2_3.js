// https://jsonplaceholder.typicode.com/

var httpRequest;
var singlePostUrl = "https://jsonplaceholder.typicode.com/posts/";
var jsonResponse;


//make ajax Get request and send the request
function makeAjaxRequestSinglePost(postId) {
    httpRequest = new XMLHttpRequest();

    httpRequest.open("GET", singlePostUrl + postId);
    httpRequest.send();

    httpRequest.onreadystatechange = ajaxResponseForSinglePost;
}

//this function contains both the status and data
function ajaxResponseForSinglePost() {
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
            insertSinglePostIntoHTML(jsonResponse);

        } else {
            //failure
            alert("This is a problem with the server.");
        }

    } else {
        console.log("ready state is not done yet!");
    }
}

function insertSinglePostIntoHTML(post) { //posts is an array

    //make reference t div that has an id of posts
    var postsDiv = document.getElementById("posts");


    //first empty the postsDiv
    postsDiv.innerHTML = "";

    postsDiv.innerHTML =
        "<div style='border: 1px solid black; margin:auto; margin-bottom: 5px; width: 50%; padding: 5px;'>" +
        "<h2 style='color: red'> title: " + post.title + "</h2>" +
        "<p style='color: blue'> body: " + post.body + "</p>" +
        "<span style='color: black'> id: " + post.id + "</span>" +
        "</div>";
}

makeAjaxRequestSinglePost(1);

