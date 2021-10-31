const urlServ = 'https://swapi.dev/api/planets';
//create element button & add event listener to it
const btn = document.createElement('button');
btn.textContent = "press me";
document.body.appendChild(btn);
btn.addEventListener('click', function () {
    //create a promise, use [] for holding all the data in array
    fetchAll(urlServ, [])
        .then(function (planets) {
            // console.log('fetchAll >>', planets);
            outputPlanets(planets);
        })
});


//because we use then for fetchAll, so need to return promise
//attention: 'then()' method work for promise, example is fetch() which is promise.
function fetchAll(urlServ, planets) {
    return new Promise(function (resolve, reject) {
        //fetch it self is promise
        return fetch(urlServ)
            //change data type to json
            .then(function (resp) {
                return resp.json()
            })
            //separate name and films from json and ...
            .then(function (data) {

                //merge new page of data to the old data
                planets = planets.concat(data.results);
                console.log('planets >> ', planets);

                //if data has next
                if (data.next) {

                    console.log('next urlServ data' + data.next);
                    //call our method again, recursive
                    fetchAll(data.next, planets).then(resolve);

                } else { //otherwise resolve (no more next)

                    let arr = planets.map(function (item) {
                        return {name: item.name, films: item.films};
                    })

                    //return back all the data
                    resolve(arr);
                }
            })
    });
}

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


/*var promise1 = new Promise(function(resolve, reject) {
  setTimeout(function() {
    resolve('foo');
  }, 300);
});

promise1.then(function(value) {
  console.log(value);
  // expected output: "foo"
});

console.log(promise1);
// expected output: [object Promise]*/
