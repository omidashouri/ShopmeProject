let url = "https://jsonplaceholder.typicode.com/todos";
let method = "GET";

fetch(url)
    .then(data => data.json())
    .then(newData => console.log(newData));
