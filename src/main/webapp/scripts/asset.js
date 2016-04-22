function addAsset(){
    console.log("lost my life" +  document.getElementById('assetid').value);
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
var data = JSON.stringify({"id":document.getElementById('assetid').value,"accessId":document.getElementById('assetaccessid').value});
    console.log(data);
xhr.send(data);
}
