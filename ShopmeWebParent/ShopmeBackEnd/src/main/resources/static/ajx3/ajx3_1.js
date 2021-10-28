// console.log("working");
// https://randomuser.me/api

const xhr = new XMLHttpRequest();
const url = "https://randomuser.me/api";
// console.log(xhr);

xhr.onreadystatechange = function(){
  console.log(`state ${xhr.readyState}`);
  if(xhr.readyState === 4 && xhr.status === 200){
    // console.log(xhr.responseText);
    const json = JSON.parse(xhr.responseText);
    console.log(json.results);
    const person = json.results[0].name;
    const div = document.createElement('div');
    div.textContent = `${person.first}`;
    div.textContent += ` ${person.last}`;
    document.body.append(div);
  }
};
xhr.open('GET', url, true);
xhr.send();