import * as yup from "yup";

export const loginSchema = yup.object().shape({
  phone: yup.string().required("Phone is Required"),
  password: yup.string().required("Password is Required"),
});
