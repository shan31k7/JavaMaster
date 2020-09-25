let a, b;

//Assignment operators
a = 10;
b = 5;

// Arithmetic operators
console.log(a + b);
console.log(a - b);
console.log(a * b);
console.log(a / b); // Quotient
console.log(a % b); // Remainder
console.log(a ** b); // power

// Increment, Decrement operators
let x = 100,
    y = 100,
    output = null;

// Post-Increment
output = x++;
document.write("<br> Post-Increment: ", output, ',  ', x);

// Pre-Increment
output = ++y;
document.write("<br> Pre-Increment: ", output, ',  ', y);
// Same is true for Decrement

// shortcuts
a = a + 5;
a += 5;

// Strictly equals (Type and value should match)
document.write("<br><br>");
document.write("<br> Strict Equals (===): ", 1 === 1); // true
document.write("<br> Strict Equals (===): ", '1' === 1); // false
document.write("<br> Strict Equals (===): ", true === 1); // false
// similarly we have !==

// Loosely equals (Only value should match)
document.write("<br><br>");
document.write("<br> Loose Equals (==): ", 1 == 1); // true
document.write("<br> Loose Equals (==): ", '1' == 1); // true
document.write("<br> Loose Equals (==): ", true == 1); // true
// similarly we have !=

//Ternary operators, shortcut for if and else statements
normalBodyTemperature = 98.6;
your_Temparature = 102;
symptom = your_Temparature > normalBodyTemperature ? "Fever" : "No Fever";

// Logical operators, AND, OR, NOT
