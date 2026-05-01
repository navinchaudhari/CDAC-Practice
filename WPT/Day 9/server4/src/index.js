import express, { response } from "express";
import {
  areaOfSquare,
  perimeterOfSquare,
  areaOfRectangle,
  perimeterOfRectangle,
} from "./controller/numberController.js";

import { generateBill } from "./controller/billController.js";

// To create server
const app = express();

// Used as middlware for post method to send request body
app.use(express.json());

//Base Url
app.get("/", (request, response) => {
  response.status(200).json({ message: "Welcome to Express JS" });
});

// URL to calculate area of a square using URL parameter
app.get("/area/square/:side", areaOfSquare);

// URL to calculate perimeter of a square using URL parameter
app.get("/perimeter/square/:side", perimeterOfSquare);

// URL to calculate area of a rectangle using request body json object
app.post("/area/rectangle/", areaOfRectangle);

// URL to calculate perimeter of a rectangle using request body json object
app.post("/perimeter/rectangle/", perimeterOfRectangle);

// URL to generate bill and input from user in request body as JSON object
app.post("/generateBill/", generateBill);

// To start server on given port no
app.listen(6500);
