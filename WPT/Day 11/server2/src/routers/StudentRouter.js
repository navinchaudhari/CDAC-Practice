import { Router } from "express";
import {
  deleteByID,
  getAll,
  getById,
  save,
} from "../controllers/StudentController.js";
import { verifyToken } from "../middlewares/VerifyToken.js";

const studentRouter = Router();

studentRouter.get("/", verifyToken, getAll);
studentRouter.get("/:id", getById);
studentRouter.post("/", save);
studentRouter.delete("/:id", verifyToken, deleteByID);

export default studentRouter;
