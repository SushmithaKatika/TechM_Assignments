function ProductChange() {
    let selectProduct = document.getElementById("lstProducts").value;
    let pic = document.getElementById("pic");

    // Correct variable name and image paths
    if (selectProduct === "pasta") {
        pic.src = "Images/pasta.jpg";  // Ensure image is in "Images" folder
    } else if (selectProduct === "burger") {
        pic.src = "Images/burger.jpg";
    } else if (selectProduct === "salad") {
        pic.src = "Images/salad.jpg";
    } else {
        pic.src = "";  // Clear image if no valid selection
    }
}
