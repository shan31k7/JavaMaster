// Variables in Javascript

// one variable can hold data of any Type - termed as Dynamic Typing (Java is Static Typing)

// create variable using keywords var or let
// using let keyword is new ES6 javascript standards and var is older notation
// Identifier naming conventions are the same as like Java
// undefined, null, NaN, None

// primitive types
// string, number, boolean, null, undefined

// Reference types
// object, arrays, function

let firstName = undefined;
var lastName; // same as undefined
document.write('Printing variables: ', firstName, ', ', lastName, '<br>');
document.write('DataType: ', typeof firstName, ', ', typeof lastName, '<br><br>');


// undefined and null are different
// undefined is empty, null is an object
firstName = null;
lastName = null;
document.write('Printing variables: ', firstName, ', ', lastName, '<br>');
document.write('DataType: ', typeof firstName, ', ', typeof lastName, '<br><br>');


// string can be represented in Single or double quotes
firstName = 'Ramya';
lastName = "Suresh";
document.write('Printing variables: ', firstName, ', ', lastName, '<br>');
document.write('DataType: ', typeof firstName, ', ', typeof lastName, '<br><br>');


// number (we do not have integer, float, double)
firstName = 55;
lastName = 87.9;
document.write('Printing variables: ', firstName, ', ', lastName, '<br>');
document.write('DataType: ', typeof firstName, ', ', typeof lastName, '<br><br>');


// boolean (false =0, true =1)
firstName = true;
lastName = false;
document.write('Printing variables: ', firstName, ', ', lastName, '<br>');
document.write('DataType: ', typeof firstName, ', ', typeof lastName, '<br><br>');


// constants
const PI = 3.14;
//PI = 3.15;
document.write("Constant PI: ", PI);
