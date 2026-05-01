import express from "express";
import numberRouter from "./routers/NUmberRouter.js";
import welcomeRouter from "./routers/welcomeRouter.js";

// To create server
const app = express();

// Used as middlware for post method to send request body
app.use(express.json());
app.use(numberRouter);
app.use(welcomeRouter);





// To start server on given port no
app.listen(6500);
