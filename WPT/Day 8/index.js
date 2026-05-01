import { createServer } from "http";

import { sum, product } from "./mymodule.js";

const server = createServer((req, res) => {
  const sumResult = sum(10, 20);
  const produtResult = product(10, 20);
  res.write(`Sum: ${sumResult}, Product: ${produtResult}`);
  res.end();
});
server.listen(6700);
