const http = require("http");

const server = http.createServer((request, response) => {
    response.write("Hello World");
    response.end();
}); // it will return the object reference of the newly created server
// ip: 127.0.0.1

server.listen(5000);
