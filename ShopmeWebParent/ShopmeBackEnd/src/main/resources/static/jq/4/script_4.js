$(document).ready(function () {

    var csrf_token = $('meta[name="csrf-token"]').attr('content');
    $.ajaxSetup({
        headers:
            { 'X-CSRF-TOKEN': $('meta[name="csrf-token"]').attr('content') }
    });

    $(".btn").click(function(e){

/*        var token = "SOME_TOKEN";
        $.ajaxPrefilter(function (options, originalOptions, jqXHR) {
            jqXHR.setRequestHeader('X-CSRF-Token', token);
        });*/


        //click 1
        //if it is not spring security remove csrf and params
        if ($(this).hasClass("btn-danger")) {

            $.post("http://localhost:8080/ShopmeAdmin/jq/41?name=omidashouri" ,function (data, reponse, xhr) {
                // xhr.setRequestHeader("X-CSRFToken", "5eeae26f-97f7-4d08-b4e8-121a694cf0cb");
                console.log(xhr);
            })
        }

        //click 2
        if ($(this).hasClass("btn-warning")) {
            var newData = {
                //parameter define here and is 'name'
                name: $("#Name").val()
            };
            $.post("http://localhost:8080/ShopmeAdmin/jq/41", newData, function (data, status, xhr) {
                console.log(xhr);
                $("#output").html(data);
            })
        }


        if ($(this).hasClass("btn-primary")) {
            var newData = {
                name: $("#Name").val()
            };
            $.ajax({
                url: "http://localhost:8080/ShopmeAdmin/jq/41",
                data: newData,
                method: "POST",
                success: function (data, status, xhr) {
                    console.log(xhr);
                    console.log("SUCCESS");
                },
                error: function (data, status, xhr) {
                    console.log(xhr);
                }

            })
        }

    });

});