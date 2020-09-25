// function supports code reusability

// function with no arguments and no return value
function process() {
    alert("Random number: " + Math.random());
}


// function with arguments, but no return value
function greetings(name) {
    alert("Welcome Aboard... " + name);
}


// function with arguments and return value
function productOutput(number1, number2) {
    return number1 * number2;
}


// call the respective functions
process();

greetings('Adbul Kalam');

let output = productOutput(25, 25000);
alert("Multiplied value: " + output);
