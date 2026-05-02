import { Router } from "express";
import { getAll, login, register } from "../controllers/AdminController.js";

const adminRouter = Router();

adminRouter.get("/", getAll);
adminRouter.post("/register", register);
adminRouter.post("/login", login);

export default adminRouter;
