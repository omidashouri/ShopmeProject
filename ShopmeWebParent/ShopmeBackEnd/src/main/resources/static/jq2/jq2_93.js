$(document).ready(function () {


    $('button').click(function () {
        $.get('http://localhost:8080/ShopmeAdmin/jq2/rest/93', function (data, status) {
            if (status === 'success') {
                $('#div1').html("<h2>" + data + "</h2>");
            }
        });
    });

});