$(document).ready(function () {
    $(".btn").click(function(e){

        // console.log($(this));
        if($(this).hasClass("btn-danger")){
            // $("#output").html("CLICKed #1");

            //attention the URL should be according to the main page in which this page is loading
            //for here the man page URL is http://localhost:8080/ShopmeAdmin/jq/3
            // and destination page URL is http://localhost:8080/ShopmeAdmin/jq/31
            $("#output").load("31");
        }

        // 2
        /*if($(this).hasClass("btn-warning")) {
            $.get("http://localhost:8080/ShopmeAdmin/jq/31", function (data) {
                console.log(data);
                $("#output").html(data);
            });
        }*/

        //click 2
        if($(this).hasClass("btn-warning")) {
            var newData = {
                name: $("#Name").val()
            };
            $.get("http://localhost:8080/ShopmeAdmin/jq/32", newData, function(data) {
                console.log(data);
                $("#output").html(data);
            });
        }

/*        // click 3
        if ($(this).hasClass("btn-primary")) {
            $.get('php.php', function (data) {
                console.log(data);
                $("#output").html(data);
            })
        }*/

        //click 4
        if( $(this).hasClass("one")){
            var url = "http://localhost:8080/ShopmeAdmin/jq/33?name=omidashouri";
            $.getJSON(url, function(data){
                console.log(data);
                $("#output").html("<p>FirstName: "+data.firstName+"</p>");
                console.log(data);
            })
        }

    });

});