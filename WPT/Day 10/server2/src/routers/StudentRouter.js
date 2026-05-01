import { Router } from "express";
import { deleteByID, getAll, getById, save } from "../controller/StudentController.js";

const studentRouter = Router();

studentRouter.get("/", getAll);

studentRouter.get("/:id", getById);
studentRouter.post("/", save);
studentRouter.delete("/:id", deleteByID);

export default studentRouter;
