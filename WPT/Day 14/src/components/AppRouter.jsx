import { Route, Routes } from "react-router-dom";
import { Home } from "../features/home/Home";
import { StudentList } from "../features/student-list/StudentList";
import { StudentRegistration } from "../features/student-registration/StudentRegistration";
import { UpdateStudent } from "../features/update-student/UpdateStudent";
import { Login } from "../features/login/Login";
import { PrivateRoute } from "./PrivateRoute";

export function AppRouter() {
  return (
    <Routes>
      <Route path="/" element={<Login />} />
      <Route element={<PrivateRoute />}>
        <Route path="/home" element={<Home />} />
        <Route path="/student-list" element={<StudentList />} />
        <Route path="/register-student" element={<StudentRegistration />} />
        <Route path="/edit-student/:id" element={<UpdateStudent />} />
      </Route>
    </Routes>
  );
}
