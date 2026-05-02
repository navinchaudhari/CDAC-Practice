import express from "express";
import studentRouter from "./routers/StudentRouter.js";
import adminRouter from "./routers/AdminRouter.js";

const app = express();
app.use(express.json());
app.use("/students", studentRouter);
app.use("/admins", adminRouter);

app.listen(9000);
