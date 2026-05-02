import express from "express";
import studentRouter from "./routers/StudentRouter.js";

const app = express();
app.use(express.json());

app.use(studentRouter);

app.listen(8200);
