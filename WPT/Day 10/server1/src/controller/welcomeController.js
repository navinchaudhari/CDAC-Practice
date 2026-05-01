export const welcome = (request, response) => {
  response.status(200).json({ message: "Welcome to Express JS" });
}