import { Router } from "express";
import { welcome } from "../controller/welcomeController.js";

const welcomeRouter = Router();

welcomeRouter.get("/", welcome);

export default welcomeRouter;
