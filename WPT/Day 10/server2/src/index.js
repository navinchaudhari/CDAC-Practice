import express from "express";
import studentRouter from "./routers/StudentRouter.js";

const app = express();
app.use(express.json());

//to make generic for students we use this
app.use("/students", studentRouter);

app.listen(9000);
