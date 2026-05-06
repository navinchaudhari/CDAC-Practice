// this file will contain the function which are calling the api
// service is for students list so this will contain the function

import axios from "axios";
import { getApiConfig } from "../../utils/ApiUtil";
export function fetchAllStudents() {
  return axios.get("http://localhost:9000/students", getApiConfig());
}

export function deleteStudentById(id) {
  return axios.delete(`http://localhost:9000/students/${id}`, getApiConfig());
}
