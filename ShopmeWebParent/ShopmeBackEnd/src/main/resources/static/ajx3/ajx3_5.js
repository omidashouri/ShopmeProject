(function () {
    const url = 'https://script.google.com/macros/s/AKfycbwa4QvH8bPPRNIPCvFJlYVtt9-RuDdqY91tlqDctTxAkpu-9VV8tPsjY2MNusVpSAr_/exec';

    const div = document.createElement('div');
    document.body.append(div);
    const payload = {
        message: 'omid ashouri',
        counter: 1000
    };
    sayHello();

    function sayHello() {
        const xhr = new XMLHttpRequest();
        xhr.open('POST', url);
        //first open then set header
        xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
        xhr.onreadystatechange = () => {
            if (xhr.readyState === 4 && xhr.status === 200) {
                console.log(xhr.responseText);
                const data = JSON.parse(xhr.responseText);
                console.log(data);
                console.log(data.message);
                div.textContent = data.message;
            }
        }

        //JSON.stringify: change payload object to string
        xhr.send(JSON.stringify(payload));
    }


})();