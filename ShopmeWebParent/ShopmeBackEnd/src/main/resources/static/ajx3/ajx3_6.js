const url = "https://randomuser.me/api";

test0();

function test0(){
    // or: function(rep){}
    fetch(url).then((rep)=>{
        if(!rep.ok){
            console.log("error");
        }else{
            console.log(rep);
        }
        // console.log(rep.json());

        // return response as text
        // return res.text();

        //return response as json
        return rep.json();
    }).then(data=>{

        // log the response which is json
        console.log(data);
    }).catch(error=>console.log("error"));
}