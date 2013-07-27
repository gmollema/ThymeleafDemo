var currentLocation=window.location.pathname;

// Windows, use forward slashes
var thRoot = currentLocation.substr(0, (currentLocation.lastIndexOf('/view')));
var thPath='/view/templates';
var x =  currentLocation.substr(currentLocation.lastIndexOf('/pages'));
var sepCount = ((x.split('/')).length-1);
var relWebAppPath = "../../"
for (var i=0;i<sepCount;i++) {
    relWebAppPath = relWebAppPath + "../";
}
