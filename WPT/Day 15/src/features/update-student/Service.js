import axios from "axios";
import { getApiConfig } from "../../utils/ApiUtil";

export function getStudentById(id) {
  return axios.get(`http://localhost:9000/students/${id}`, getApiConfig());
}
