export const areaOfSquare = (request, response) => {
  const side = request.params.side;
  const square = side * side;
  response.status(200).json({ Square: square });
};

export const perimeterOfSquare = (request, response) => {
  const side = request.params.side;
  const perimeter = 4 * side;
  response.status(201).json({ perimeter: perimeter });
};

export const areaOfRectangle = (request, response) => {
  const l = request.body.length;
  const b = request.body.breadth;
  const square = l * b;
  response.status(200).json({ square: square });
};

export const perimeterOfRectangle = (request, response) => {
  const l = request.body.length;
  const b = request.body.breadth;
  const perimeter = 2 * (l + b);
  response.status(201).json({ Perimeter: perimeter });
};
