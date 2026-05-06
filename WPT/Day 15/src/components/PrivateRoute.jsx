import { Navigate, Outlet } from "react-router-dom";
import { getToken } from "../features/login/TokenService";
import { getRole } from "../features/login/RoleService";

export function PrivateRoute(props) {
  const { allowedRoles } = props;

  const token = getToken();
  const role = getRole();

  if (token) {
    // Countinue with the child route component
    if (allowedRoles.includes(role)) {
      return <Outlet />;
    } else {
      return <h3>Access Denied</h3>;
    }
  } else {
    // redirect user on the login route
    return <Navigate to={"/"} />;
  }
}
