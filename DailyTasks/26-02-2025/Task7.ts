// Type alias for a custom object type
type Address = {
    street: string;
    city: string;
    postalCode: string;
};

// Type alias for a union type
type Status = 'Active' | 'Inactive' | 'Pending';

// Type alias for a complex object combining other aliases
type User = {
    id: number;
    name: string;
    age?: number; // Optional property
    address: Address;
    status: Status;
};

// Using the type aliases to define variables
const user1: User = {
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

const user2: User = {
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
function displayUserInfo(user: User): void {
    console.log(`Name: ${user.name}`);
    console.log(`Street: ${user.address.street}`);
    console.log(`City: ${user.address.city}`);
    console.log(`Status: ${user.status}`);
}

// Test function calls
displayUserInfo(user1);
displayUserInfo(user2);
