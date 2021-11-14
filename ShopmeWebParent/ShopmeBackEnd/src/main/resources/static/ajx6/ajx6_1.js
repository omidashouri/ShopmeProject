$(document).ready(function () {

    const arr1 = ['one', 'string', 100, false, []];
    // console.log(arr1);

    // arr1.length=0;
    // console.log(arr1);

    const arr3 = [];
    arr1.forEach((ele, index) => {
        // console.log(index + ' _ '+ ele);
        arr3[index] = ele;
    })

    //-----------------------------------------------------------


    //this is javascript object:
    //for javascript property we do not need quote around properties but for JSON object we need.
    //if we want to have javascript object as valid json object, so we should use quote for properties.
    const person = {
        "firstName": "Omid",
        "lastName": "Ashouri",
        "x1": 1,
        "x2": false,
        "myCourses": {
            "name": "omidCourse",
            "length": 100
        },
        "interests": ["JavaScript", "HTML", "CSS"],
        "courses": [{
            "name": "JavaScript",
            "length": 15
        }, {
            "name": "HTML",
            "length": 10
        }, {
            "name": "CSS",
            "length": 20
        }]
    };

    //get property of object
    // console.log(person.firstName);

    //use bracket where we have space in out property name like "first name"
    const courses = person["courses"];
    courses.forEach((course, index) => {
        // console.log(course);
    })
    for (const prop in person) {
//console.log(prop);
    }
    const keys = Object.keys(person);
    keys.forEach((key) => {
//console.log(person[key]);
    })
    const vals = Object.values(person);
    vals.forEach((val) => {
//console.log(val);
    })
    const entries = Object.entries(person);
    for (const arr of entries) {
        // console.log(arr[0]);
        // console.log(arr[1]);
    }

//    get value of object inside object:
//     console.log(person["myCourses"]["length"]);
//     console.log(person["courses"][0]["length"]);


});