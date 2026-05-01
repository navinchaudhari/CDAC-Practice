import express, { response } from "express";

// To create server
const app = express();

// Used as middlware for post method to send request body
app.use(express.json());

//Base Url
app.get("/", (request, response) => {
  response.status(200).json({ message: "Welcome to Express JS" });
});

// URL to calculate area of a square using URL parameter
app.get("/area/square/:side", (request, response) => {
  const side = request.params.side;
  const square = side * side;
  response.status(200).json({ Square: square });
});

// URL to calculate perimeter of a square using URL parameter
app.get("/perimeter/square/:side", (request, response) => {
  const side = request.params.side;
  const perimeter = 4 * side;
  response.status(201).json({ perimeter: perimeter });
});

// URL to calculate area of a rectangle using request body json object
app.post("/area/rectangle/", (request, response) => {
  const l = request.body.length;
  const b = request.body.breadth;
  const square = l * b;
  response.status(200).json({ square: square });
});

// URL to calculate perimeter of a rectangle using request body json object
app.post("/perimeter/rectangle/", (request, response) => {
  const l = request.body.length;
  const b = request.body.breadth;
  const perimeter = 2 * (l + b);
  response.status(201).json({ Perimeter: perimeter });
});

// URL to generate bill and input from user in request body as JSON object
app.post("/generateBill/", (request, response) => {
  const quantity = request.body.quantity;
  const price = request.body.price;

  let totalPrice = price * quantity;

  //   let discount = 0;
  let netAmount = totalPrice;

  if (totalPrice >= 4000) {
    var discount = totalPrice * 0.1;
    netAmount = totalPrice - totalPrice * 0.1;
  }
  response.status(200).json({
    Price: totalPrice,
    Discount: discount,
    NetAmount: netAmount,
  });
});

// To start server on given port no
app.listen(6500);
