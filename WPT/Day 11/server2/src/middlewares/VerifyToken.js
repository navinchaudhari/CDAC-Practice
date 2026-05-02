import jwt from "jsonwebtoken";

export function verifyToken(request, response, next) {
  const authHeader = request.get("Authorization");
  if (authHeader) {
    const token = authHeader.split(" ")[1];
    jwt.verify(token, "hello123", (error, payload) => {
      if (error) {
        response
          .status(401)
          .json({ message: "Unauthorized Access. Token is missing." });
      } else {
        next();
      }
    });
  } else {
    response
      .status(401)
      .json({ message: "Unauthorized Access. Token is missing." });
  }
}
