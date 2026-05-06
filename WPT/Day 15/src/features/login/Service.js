import axios from "axios";

export function login(credentials) {
  return axios.post("http://localhost:9000/login", credentials);
}
