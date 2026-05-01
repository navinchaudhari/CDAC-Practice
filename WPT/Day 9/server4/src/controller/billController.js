export const generateBill = (request, response) => {
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
};
