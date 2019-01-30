$(function() {
    $('#loginBtn').on('click', function (e) {
        e.preventDefault();
        $.ajax({
            url: "/login",
            type: "POST",
            data: {
                username: $('#username').val()
            },
            success: function (response) {
                write('token', response);
                window.location.replace("analysis.html");
            },
            error: function (response) {
                alert('error during login, please try again');
            },
        });
    });
});

