$(document).ready(function () {

    $('button').click(function() {
        // $('#div1').load('demo_92.txt');
        //xhr: abbreviation for xml http request
        $('#div1').load('demo_92.txt', function(responseTxt, statusTxt, xhr) {
            if(statusTxt === 'success') {
                console.log('File loaded successfully!');
            } else if(statusTxt === 'error') {
                console.log('Error ' + xhr.status + ' , ' + xhr.statusText);
            }
        });
    });

});