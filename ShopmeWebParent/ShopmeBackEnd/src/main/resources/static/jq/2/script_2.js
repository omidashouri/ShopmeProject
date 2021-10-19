$(document).ready(function() {
    //apply to the element which has id="output"
    $("#output").html("new content!");

    //apply all the elements which have class="one"
    $(".one").html("new content!");

    //apply all the paragraph "
    $("p").html("new content!");

    // write html then in response the 'content!' is at new line
    // $("p").html("new <BR> content!");

    // write text then in response the 'content!' is not at new line. result is 'new <BR> content!'
    // $("p").text("new <BR> content!");

    // with val we can manipulate value. like update, edit, or pic up value
    // $("p").text("new <BR> content!");

//    take the value of '#name' the put it as text for 'p'
    /*var a = $("#Name").val();
    $("p").text(a);*/

//    take all the text inside h2 tag and put it inside p
    /*   var b = $("h2").html();
         $("p").text(b);*/

    /*    $("li").each(function(){
            console.log($(this).html());
        });*/

    $("li:eq(3)").html("number 3");

    /*    $("li").each(function () {
            $(this).after("AFTER");
            $(this).append("APPEND");
            $(this).before("BEFORE");
            $(this).prepend("PREPEND");
        })*/

    /*    $("li").each(function (index, event) {
            console.log(index);
            console.log(event);
        });*/


    /*    $('li').click(function(event){
            console.log('clicked',$(this).text());
        });*/

    /*    $("li").on("click",function(event){
            $(this).append(" x ");
        });*/

    /*    $("#somebutton").click(function(){
           $("#sidelist").append("<li>NEW</li>");
        });*/

    /*$("#sidemenu").on("click","li",function(event){
        this.append(" * ")
    });*/

    /*$("#sidemenu").on("click mouseover","li",function(event){
        this.append(" * ")
    });*/

    /*$("#mybox").on("mouseover",function(event){
       $(this).append(" x ");
    });*/

    $("#mybox").mouseover(function (event) {
        $(this).append(" x ");
    }).mouseout(function (event) {
        $(this).text("mouse out");
    });

});