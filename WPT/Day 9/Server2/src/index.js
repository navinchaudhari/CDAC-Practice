import express, { json, request } from "express";

const app = express();
app.use(express.json());

app.get("/", (request, response) => {
  response.json({ Message: "This is Landing Page" });
});

app.get("/factorial/:n", (request, response) => {
  const num = parseInt(request.params.n);
  let fact = 1;
  for (let i = 1; i <= num; i++) {
    fact *= i;
  }
  response.status(200).json({ factorial: fact });
});

// app.post(
//   "/sum",
//   (request, response, next) => {
//     // response.json({ message: "API failed to get Response" });
//     next();
//   },
//   (request, response) => {
//     console.log(request.body);
//     const num1 = request.body.n1;
//     const num2 = request.body.n2;
//     const sum = num1 + num2;
//     response.status(200).json({ sum: sum });
//   },
// );

// OR

app.post("/sum", (request, resoonse) => {
  console.log(request.body);
  const num1 = request.body.n1;
  const num2 = request.body.n2;
  const sum = num1 + num2;
  resoonse.status(200).json({ sum: sum });
});

app.listen(8200);
