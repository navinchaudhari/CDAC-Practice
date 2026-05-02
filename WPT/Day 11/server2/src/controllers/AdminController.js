import { pool } from "../config/DBConfig.js";
import bcrypt from "bcrypt";
import jwt from "jsonwebtoken";

export const register = async (request, response) => {
  try {
    const { name, phone, password } = request.body;
    const encryptPassword = bcrypt.hashSync(password, 10);
    const [result] = await pool.query(
      "INSERT INTO admin (name, phone, password) VALUES (?,?,?)",
      [name, phone, encryptPassword],
    );
    response.status(200).json({ InsertedID: result.insertId });
  } catch (error) {
    response.status(500).json({ message: "Something Went Wrong" });
  }
};

export const login = async (request, response) => {
  try {
    const { phone, password } = request.body;
    const [result] = await pool.query("SELECT * FROM admin WHERE phone = ?", [
      phone,
    ]);

    if (result.length === 0) {
      response.status(400).json({ mesage: "Invalid Credentials" });
    } else {
      if (bcrypt.compareSync(password, result[0].password)) {
        const token = jwt.sign({ adminId: result[0].id }, "hello123");
        response.status(200).json({ message: "Login Successfull", token });
      } else {
        response.status(400).json({ message: "Invalid Crendential" });
      }
    }
  } catch (error) {
    response.status(500).json({ message: "Something Went Wrong" });
  }
};

export const getAll = async (request, response) => {
  try {
    const [result] = await pool.query("SELECT * FROM admin");
    response.status(200).json(result);
  } catch (error) {
    response.status(500).json({ message: "Something Went Wrong" });
  }
};
