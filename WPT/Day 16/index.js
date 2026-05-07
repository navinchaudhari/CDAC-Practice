import express from "express";
import mongoose from "mongoose";
import cors from "cors";
import { getConnection } from "./DbConfig";
import { Student } from "./StudentModel";

const app = express();

app.use(cors());
app.use(express.json());
getConnection();

app.get("/", (request, response) => {
  response.send({ message: "Welcome" });
});

app.post("/students", async (request, response) => {
  try {
    const { roll, name, phone, marks } = request.body;
    const s1 = new Student();
    s1.roll = roll;
    s1.name = name;
    s1.phone = phone;
    s1.marks = marks;
    const result = await s1.save(); // once promise is resolved then it will return inserted document
    console.log(result);

    response.status(201).json({ message: "Student Register" });
  } catch (error) {
    response.status(500).json({ message: "Something Went Wrong" });
  }
});

app.get("/students", async (request, response) => {
  try {
    const data = await Student.find();
    console.log(data);

    response.status(201).json({ message: "Student Register" });
  } catch (error) {
    response.status(500).json({ message: "Something Went Wrong" });
  }
});

app.listen(7500);
