import express, { response } from "express"; // same as const express = require('express');
// import the entire express library and give reference name to it

const server = express();
server.get("/", (req, res) => {
  res.send("Welcome to Base URL");
});

server.get("/login", (req, res) => {
  res.send("Welcome to Login");
});

server.get("/sum", (req, res) => {
  const a = 10;
  const b = 20;
  const c = a + b;
  res.send(`Sum of ${a} and ${b} is ${c}`);
});

server.get("/factorial/:n", (req, res) => {
  //{n:3}
  //   console.log(req.params);
  try {
    const num = parseInt(req.params.n);
    if (num <= 0) {
      // res.send("Please enter a positive number");
      res.status(400).json({ message: "Please provide +ve only" }); // used to send json object instead of string
    } else {
      var fact = 1;
      for (let index = 1; index <= num; index++) {
        fact = fact * index;
      }
      // res.send(`Factorial of ${num} is ${fact}`);
      res.status(200).json({ factorial: fact }); // used to send json object instead of string
    }
  } catch (error) {
    res.status(500).json({ message: "Some went wrong" });
  }
});

server.listen(7500);
