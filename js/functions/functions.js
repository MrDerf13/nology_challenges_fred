function moonOrbits(days) {
    return (days/27.3).toFixed(3);
}
// console.log(moonOrbits(365))

function circleArea(radius) {
    return (3.1415*(radius**2)).toFixed(3)
}
function circlePerimeter(radius) {
    return (3.1415*radius*2).toFixed(3)

}
// console.log(circleArea(10))
// console.log(circlePerimeter(10))

function ageInDays(years) {
    return years*(0.25*366 +0.75*365)
}

function ageInSeconds(years) {
    return years*(0.25*366 +0.75*365)*24*60*60
}

function remainder(num1, num2) {
    return num1%num2
}

// console.log(remainder(-9, 45))

function lessThan100(num1, num2) {
    if (num1 + num2 < 100) {
        return true
    } else {
        return false
    }
}

console.log(ageInSeconds(12))