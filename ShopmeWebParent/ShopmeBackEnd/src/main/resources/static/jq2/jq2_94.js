$(document).ready(function () {


    $('input').keyup(function () {

        var token = $('meta[name="csrf-token"]').attr('content');
        $.ajaxPrefilter(function (options, originalOptions, jqXHR) {
            jqXHR.setRequestHeader('X-CSRF-Token', token);
        });

        var newData = {
            name: $('input').val(),
            nm: ' omido !!!'
        };

        $.post('http://localhost:8080/ShopmeAdmin/jq2/rest/94', newData, function (data, status, xhr) {
            $('#text').html("Status: " + status + " ,xhr readyState: " + xhr.readyState + ", </br>" + data);
            console.log(xhr);
        });

    });

});