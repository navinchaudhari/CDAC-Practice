import { Route, Routes } from "react-router-dom";
import { Home } from "../features/home/Home";
import { StudentsList } from "../features/students-list/StudentsList";
import { StudentRegistration } from "../features/student-registration/StudentRegistration";
import { UpdateStudent } from "../features/update-student/UpdateStudent";
import { Login } from "../features/login/Login";
import { PrivateRoute } from "./PrivateRoute";

export function AppRouter() {
  return (
    <Routes>
      <Route path="/" element={<Login />} />
      <Route element={<PrivateRoute allowedRoles={["admin", "student"]} />}>
        <Route path="/home" element={<Home />} />
       
      </Route>

      <Route>
         <Route element={<PrivateRoute allowedRoles={["admin"]} />}>
        <Route path="/home" element={<Home />} />
        <Route path="/student-list" element={<StudentsList />} />
        <Route path="/register-student" element={<StudentRegistration />} />
        <Route path="/edit-student/:id" element={<UpdateStudent />} />
      </Route>
    </Routes>
  );
}
