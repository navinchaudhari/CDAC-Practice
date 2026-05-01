import express from "express";

const app = express();
app.use(express.json());

app.get("/", (request, response) => {
  response.status(200).json({ message: "Welcome to Base URL" });
});

// app.post(
//   "/sum",
//   (request, response, next) => {
//     // response.json({ message: "cannot process request" }); // We can send response directly
//     next();
//   },
//   (request, response) => {
//     console.log(request.body);

//     //   const requestData = request.body;
//     //   const n3 = requestData.n1 + requestData.n2;
//     //   response.status(200).json({ sum: n3 });

//     response.send({ message: "Hello" });
//   },
// );

app.post("/sum", (request, response) => {
  //   console.log(request.body);
  const num1 = request.body.n1;
  const num2 = request.body.n2;
  const num3 = num1 + num2;
  response.status(200).json({ sum: num3 });

  //   response.send({ message: "Hello" });
});

app.post("/product", (request, response) => {
  //   console.log(request.body);
  const num1 = request.body.n1;
  const num2 = request.body.n2;
  const num3 = num1 * num2;

  response.status(200).json({ Product: num3 });
});

app.listen(6500);
