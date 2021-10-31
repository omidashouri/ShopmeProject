const urlServ = 'https://swapi.dev/api/planets';
//create element button & add event listener to it
const btn = document.createElement('button');
btn.textContent = "press me";
document.body.appendChild(btn);
btn.addEventListener('click', function () {
    fetchData(urlServ);
});

//create element div & name it output
const output = document.createElement("div");
document.body.appendChild(output);

//use this method to handle custom
function outputPlanets(data) {
    data.forEach(function (item) {
        console.log('output >>', item);
        //div which text is item name
        const div = document.createElement("div");
        div.textContent = item.name;
        //unordered list which text is movie name
        const ul = document.createElement("ul");
        for (let x = 0; x < item.films.length; x++) {
            let li = document.createElement("li");
            li.textContent = item.films[x];
            ul.appendChild(li);
        }
        //add unordered list to div
        div.appendChild(ul);
        //add div to the main div of page
        output.appendChild(div)
    })
}


function fetchData(url) {
    //fetch url and get response
    fetch(url).then(function (rep) {
        return rep.json()

    }).then(function (data) {
        //show the list count on created div(output)
        output.textContent = `${data.count} results found.`;
        //check if data.next has value
        if (data.next) {
            //create next button
            const btn2 = document.createElement('button');
            btn2.textContent = "next";
            output.appendChild(btn2);
            //when click next show other item on the list
            btn2.addEventListener('click', function () {
                fetchData(data.next);
            })
        }
        //copy an array to new array
        const planets = data.results.map(function (item) {
            console.log('item >> ', item);
            return {name: item.name, films: item.films};
        })
        //show the url data on the console
        // console.log('data >>' ,data);

        //call the outputPlanets function
        outputPlanets(planets);
    })
}


const arr1 = [3243, 3234, 423432, 5, 6, 7, 8, 2233];
//map: create array from another array
/*const arr2 = arr1.map(function(x){
    console.log(x);
    return x * 5;
});

//foreach: iterate through element in the array
arr1.forEach(function(element){
    console.log(element);
})
*/
