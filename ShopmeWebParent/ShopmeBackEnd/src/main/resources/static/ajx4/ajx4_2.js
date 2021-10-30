let getData = (url, callback) => {

    let xhr = new XMLHttpRequest();
    xhr.open('GET', url, true);

    xhr.responseType = 'json'; // define what is the response type

    //let use the onload() method. onload event only occurs when the request has successfully completed.
    xhr.onload = () => {
        let status = xhr.status;
        if (status == 200) {
            callback(null, xhr.response)
        } else {
            callback(status);
        }
    }

    xhr.send();
}

const url = 'http://time.jsontest.com';

getData(url, (error, data) => {
    if (error != null) {
        console.log('oops', error)
    } else {
        let txt = `at ${data.time}`;
        document.getElementsByTagName('h1')[0].append(txt);
    }
})