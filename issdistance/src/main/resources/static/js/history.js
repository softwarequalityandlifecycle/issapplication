$(document).ready(function() {
    var token = read('token');
    console.log(token);
    if (!token) {
        window.location.replace("index.html");
    }
});

$(document).ready(function() {
    $.ajax({
        url: "/history?token=" + read('token'),
        type: "GET",
        success: function(response) {
            response.items.forEach(function(data) {
                console.log(data);
                $('#historyTable tbody').append('<tr><td>' + data.result.longitude + '</td>' + '<td>' + data.result.latitude  + '</td></tr>');
            });
        },
        error: function(response) {
            alert('error loading data');
        },
    });
});