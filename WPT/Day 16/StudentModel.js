import { model, Schema } from "mongoose";

const studentSchema = new Schema({
  roll: Number,
  name: String,
  phone: { type: String, unique: true },
  marks: Number,
});

export const Student = model("Student", studentSchema);

