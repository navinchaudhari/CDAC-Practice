import { Link } from "react-router-dom";

export function Navbar() {
  return (
    <div>
      <div>
        <Link to={"/"}>Home</Link>
      </div>
      <div>
        <Link to={"/about"}>About</Link>
      </div>
      <div>
        <Link to="/contact">Contact</Link>
      </div>
    </div>
  );
}
