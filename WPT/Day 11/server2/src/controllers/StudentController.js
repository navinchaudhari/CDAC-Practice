import { pool } from "../config/DBConfig.js";

export const getAll = async (request, response) => {
  try {
    const [result] = await pool.query("SELECT * FROM student");
    response.status(200).json(result);
  } catch (error) {
    response.status(500).json({ message: "Something Went Wrong" });
  }
};

export const getById = async (request, response) => {
  try {
    const id = request.params.id;
    const [data] = await pool.query(`SELECT * FROM student WHERE id = ?`, id);
    if (data.length === 0) {
      response.status(400).json({ message: "Student not found" });
    } else {
      response.status(200).json(data[0]);
    }
  } catch (error) {
    response.status(500).json({ message: "Something went wrong" });
  }
};

export const save = async (request, response) => {
  try {
    const { name, phone, city, marks } = request.body;

    const [result] = await pool.query(
      "INSERT INTO student (name, phone, city, marks) values (?,?,?,?)",
      [name, phone, city, marks],
    );
    console.log(result);

    response.status(201).json({ insertedId: result.insertId });
  } catch (error) {
    response.status(500).json({ message: "Something wait wrong" });
  }
};

export const deleteByID = async (request, response) => {
  try {
    const id = request.params.id;
    const [result] = await pool.query("DELETE FROM student WHERE id = ?", id);
    response.status(200).json({ message: "Student Data Deleted" });
  } catch (error) {
    response.status(500).json({ message: "Something wait wrong" });
  }
};
