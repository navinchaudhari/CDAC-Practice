import { pool } from "../config/DBConfig.js";

export const getAll = async (request, response) => {
  try {
    const [result] = await pool.query("SELECT * FROM student");
    response.status(200).json(result);
  } catch (err) {
    response.status(500).json({ message: "Something Went Wrong" });
  }
};

export const save = async (request, response) => {
  try {
    const { name, phone, city, marks } = request.body;
    const [result] = await pool.query(
      "INSERT INTO student (name, phone, city, marks) VALUES (?,?,?,?) ",
      [name, phone, city, marks],
    );

    response.status(201).json({ insertedId: result.insertId });
  } catch (err) {
    response.status(500).json({ message: "Something Went Wrong" });
  }
};

export const getFailed = async (request, response) => {
  try {
    const [data] = await pool.query(
      "SELECT * FROM student WHERE marks < ?",
      40.0,
    );

    response.status(200).json(data);
  } catch (error) {
    response.status(500).json({ message: "Something went wrong" });
  }
};

export const getTopper = async (request, response) => {
  try {
    const [topper] = await pool.query(
      "SELECT * FROM student WHERE marks = (SELECT max(marks) FROM student)",
    );
    response.status(200).json(topper[0]);
  } catch (error) {
    response.status(500).json({ message: "Something went wrong" });
  }
};

export const update = async (request, response) => {
  try {
    const id = request.params.id;
    const { name, phone, city, marks } = request.body;
    const [rows] = await pool.query("SELECT id FROM student where id = ?", id);

    if (rows.length !== 0) {
      const [result] = await pool.query(
        "UPDATE student SET name = ?, phone = ?, city = ?, marks = ? WHERE id = ?",
        [name, phone, city, marks, id],
      );
      response
        .status(200)
        .json({ message: "Student Details Updated Successfully" });
    } else {
      response.status(404).json({ message: "Enter Valid Id" });
    }
  } catch (error) {
    response.status(500).json({ message: "Something went wrong" });
  }
};
