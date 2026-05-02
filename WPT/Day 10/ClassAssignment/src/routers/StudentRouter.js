import { Router } from "express";
import {
  getAll,
  getFailed,
  getTopper,
  save,
  update,
} from "../controller/StudentController.js";

const studentRouter = Router();

studentRouter.get("/students", getAll);
studentRouter.post("/students", save);
studentRouter.get("/students/fail", getFailed);
studentRouter.get("/students/topper", getTopper);
studentRouter.put("/students/update/:id", update);

export default studentRouter;
