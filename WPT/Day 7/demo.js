console.log("Hello World");

// const { log } = require("console");
const fs = require("fs");
// fs.readFile("myfile.txt", (error, data) => {
//   if (error) {
//     console.log("Error in reading file");
//     console.log(error);
//   } else {
//     console.log(data.toString());
//   }
// });

// const fs = require("fs");
// const data = fs.readFileSync("myfile.txt");
// console.log(data.toString());

// fs.writeFile("newFile.txt", "This is Dummy Data", () => {
//   console.log("After complting write function");
// });

fs.writeFileSync("newFile.txt", "New Content of the File");

console.log("After Reading File");
