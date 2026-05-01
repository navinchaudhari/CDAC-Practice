import { createServer } from "http";

const server = createServer((request, response) => {
  response.write("Hello Server");
  response.end();
});

server.listen(7700);
