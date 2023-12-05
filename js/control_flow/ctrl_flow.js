// Chal 1
// let n = -6;

// if (n%2==0) {
//     console.log("n is even.");
// } else {
//     console.log("n is odd.");
// }


// Chal 2
let x = 3;
let y = 2;

if (x > y) {
    console.log(`${x} is greater than ${y}.`);
} else if (x == y) {
    console.log(`${x} is equal to ${y}.`);
} else {
    console.log(`${x} is less than ${y}.`);
}

// Chal 3
let userInput = 9;
if (typeof userInput == "number" && !isNaN(userInput)) {
    console.log(userInput**2);
} else if (typeof userInput == "string") {
    console.log(userInput);
} else {
    console.log("Invalid input.");
}

// Switch Chal 1
let day = 6;

switch (day) {
    case 1:
        console.log("Today is Monday")
        break
    case 2:
        console.log("Today is Tuesday")
        break
    case 3:
        console.log("It's Wednesday my dude")
        break
    case 4:
        console.log("Today is Thursday")
        break
    case 5:
        console.log("Today is Friday")
        break
    case 6:
        console.log("Today is Saturday")
        break
    case 7:
        console.log("Today is Sunday")
        break
    default:
        console.log("You are from a future where they have a different number of days in a week.")

}

// Switch Chal 2
const parent1="green";
const parent2="blue";

switch (parent1) {
    case "brown":
        switch (parent2) {   
            case "brown":
                console.log(`Your eyes are ${parent1} and ${parent2}, your childs eyes will most likely be: 75% brown, 18.75% green, 6.25% blue`)
                break
            case "green":
                console.log(`Your eyes are ${parent1} and ${parent2}, your childs eyes will most likely be: 50% brown, 37.5% green, 12.5% blue`)
                break
            case "blue":
                console.log(`Your eyes are ${parent1} and ${parent2}, your childs eyes will most likely be: 50% brown, 0% green, 50% blue`)
                break
            }
        break

    case "blue":
        switch (parent2) {   
            case "brown":
                console.log(`Your eyes are ${parent1} and ${parent2}, your childs eyes will most likely be: 50% brown, 0% green, 50% blue`)
                break
            case "green":
                console.log(`Your eyes are ${parent1} and ${parent2}, your childs eyes will most likely be: 0% brown, 50% green, 50% blue`)
                break
            case "blue":
                console.log(`Your eyes are ${parent1} and ${parent2}, your childs eyes will most likely be: 0% brown, 1% green, 99% blue`)
                break
            }
        break
    case "green":
        switch (parent2) {   
            case "brown":
                console.log(`Your eyes are ${parent1} and ${parent2}, your childs eyes will most likely be: 50% brown, 37.5% green, 12.5% blue`)
                break
            case "green":
                console.log(`Your eyes are ${parent1} and ${parent2}, your childs eyes will most likely be: <1% brown, 75% green, 25% blue`)
                break
            case "blue":
                console.log(`Your eyes are ${parent1} and ${parent2}, your childs eyes will most likely be: 0% brown, 50% green, 50% blue`)
                break
            }
        break
}