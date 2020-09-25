// used to store multiple items of same or different data type
let student = [];
console.log("Type of Array: ", typeof student);

student = ['Divya', 10, 'Female'];
// print all contents
console.log(student);
console.log("Length: ", student.length);

// print individual values based on index
console.log(student[0]);
console.log(student[1]);
console.log(student[2]);

// added value
student[3] = true;
// print all contents
console.log(student);
console.log("Length: ", student.length);
