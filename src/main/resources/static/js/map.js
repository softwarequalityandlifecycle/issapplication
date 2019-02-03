$(document).ready(function() {
    var token = read('token');
    console.log(token);
    if (!token) {
        window.location.replace("index.html");
    }
});



// Initialize the platform object:
var platform = new H.service.Platform({
    'app_id': 'tL7c1r1qjC5qaIrmc8vw',
    'app_code': '7zG42Iltw2LFTr4WAhK2Xg',
    'useHTTPS': true
});

// Obtain the default map types from the platform object:
var defaultLayers = platform.createDefaultLayers();

var pixelRatio = window.devicePixelRatio || 1;
var defaultLayers = platform.createDefaultLayers({
    tileSize: pixelRatio === 1 ? 256 : 512,
    ppi: pixelRatio === 1 ? undefined : 320
});

//Step 2: initialize a map - this map is centered over Europe
var map = new H.Map(document.getElementById('map'),
    defaultLayers.normal.map, {
        center: { lat: 50, lng: 5 },
        zoom: 4,
        pixelRatio: pixelRatio
    });

//Step 3: make the map interactive
// MapEvents enables the event system
// Behavior implements default interactions for pan/zoom (also on mobile touch environments)
var behavior = new H.mapevents.Behavior(new H.mapevents.MapEvents(map));

// Create the default UI components
var ui = H.ui.UI.createDefault(map, defaultLayers);

$(document).ready(function() {
    $.ajax({
        url: "/analyze",
        type: "POST",
        data: {
            token: read('token')
        },
    }).then(function(data) {
        console.log(data);
        $('.longitude').append(data.longitude);
        $('.latitude').append(data.latitude);

        addMarker(map, data.longitude, data.latitude);

    });
});

function addMarker(map, longitude, latitude) {
    var marker = new H.map.Marker({ lat: latitude, lng: longitude });
    map.addObject(marker);
    map.setCenter({ lat: latitude, lng: longitude });
}

function refresh() {
    $(document).ready(function() {
        $.ajax({
            url: "/analyze",
            type: "POST",
            data: {
                token: read('token')
            },
        }).then(function(data) {
            console.log(data);
            $('.longitude').empty();
            $('.latitude').empty();

            $('.longitude').append("Longitude: ");
            $('.latitude').append("Latitude: ");
            $('.longitude').append(data.longitude);
            $('.latitude').append(data.latitude);
            addMarker(map, data.longitude, data.latitude);
        });
    });
}