$(document).ready(function () {

    $('#one').hide();
    $('span.slide').click(function() {
        $('#second').hide();
        $('#one').slideToggle(400, function() {

            if ($(this).is(":visible"))
                $('span.slide > a').text('Collapse');
            else
                $('span.slide > a').text('Expands');
        });
        return false;
    });

});