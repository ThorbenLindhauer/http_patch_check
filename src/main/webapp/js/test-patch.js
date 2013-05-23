$(document).ready(function() {
    $.ajax(
        {
            url: 'rest/patch',
            type : 'patch',
            success : function(data) {
                $('#patch_result').text('Yes. Response: ' + data.content);
            },
            error : function(data) {
                $('#patch_result').text('No');
            }
        });
});