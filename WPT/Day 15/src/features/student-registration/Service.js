import axios from "axios";
import { getApiConfig } from "../../utils/ApiUtil";

export function registerStudent(studentData) {
  return axios.post(
    "http://localhost:9000/students",
    studentData,
    getApiConfig(),
  );
}
