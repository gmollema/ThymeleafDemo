var currentLocation=window.location.pathname;

// Windows, use forward slashes
var thRoot = currentLocation.substr(1, (currentLocation.lastIndexOf('/view')-1));
var thPath='/view/templates';
var x =  currentLocation.substr(currentLocation.lastIndexOf('/pages'));
var sepCount = ((x.split('/')).length-1);
var relWebAppPath = "../../"
for (var i=0;i<sepCount;i++) {
    relWebAppPath = relWebAppPath + "../";
}

if (!thRoot) {
    // *nix, use backward slashes
    thRoot = currentLocation.substr(1, (currentLocation.lastIndexOf('\view')-1));
    thPath='\view\templates';
}
