function addAsset(){
    console.log("lost my life" + this.myvar);
    xhr = new XMLHttpRequest();
var url = "/asset";
xhr.open("POST", url, true);
xhr.setRequestHeader("Content-type", "application/json");
xhr.onreadystatechange = function () { 
    if (xhr.readyState == 4 && xhr.status == 200) {
        var json = JSON.parse(xhr.responseText);
        console.log(json);
    }
}
var data = JSON.stringify({"id":this.assetid.value,"accessId":this.assetaccessid.value});
    console.log(data);
xhr.send(data);
}
