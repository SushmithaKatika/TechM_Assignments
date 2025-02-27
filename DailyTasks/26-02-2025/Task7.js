// Using the type aliases to define variables
var user1 = {
    id: 1,
    name: 'Sushmitha',
    age: 25,
    address: {
        street: 'viharika colony',
        city: 'medipally',
        postalCode: '508116',
    },
    status: 'Active',
};
var user2 = {
    id: 2,
    name: 'Srujana',
    address: {
        street: 'APHB colony',
        city: 'Bhongir',
        postalCode: '508112',
    },
    status: 'Pending',
};
// Function using the User type alias
function displayUserInfo(user) {
    console.log("Name: ".concat(user.name));
    console.log("Street: ".concat(user.address.street));
    console.log("City: ".concat(user.address.city));
    console.log("Status: ".concat(user.status));
}
// Test function calls
displayUserInfo(user1);
displayUserInfo(user2);
