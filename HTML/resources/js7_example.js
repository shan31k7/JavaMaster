// Modifies the DOM document

function change() {
    var button = document.getElementsByTagName("input").item(0);
    //button.nodeValue = "clicked";
    button.setAttribute("value", "clicked");

    // modify contents in <h2> tag
    var header = document.getElementsByTagName("H2").item(0);
    header.data = "A dynamic document";

    // modify contents in <p> tag
    var para = document.getElementById("para1");
    para.firstChild.data = "This is the first paragraph.";

    // create a new Text node for the second paragraph
    var newText = document.createTextNode("This is the second paragraph.\n");

    // create a new Element to be the second paragraph
    var newElement = document.createElement("P").appendChild(newText);

    // and put the paragraph on the end of the document by appending it to
    // the BODY (which is the parent of para)
    para.parentNode.appendChild(newElement);
}
