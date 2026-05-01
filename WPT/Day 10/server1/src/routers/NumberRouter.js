import { Router } from "express";
import { areaOfSquare, areaOfRectangle } from "../controller/numberController.js";

const numberRouter = Router(); // Router() is a function that will

numberRouter.get("/area/square/:side", areaOfSquare);
numberRouter.post("/area/rectangle/", areaOfRectangle);

export default numberRouter;
