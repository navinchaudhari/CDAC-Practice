import { Button, Container, Nav, Navbar } from "react-bootstrap";
import { LinkContainer } from "react-router-bootstrap";
import { removeToken } from "../features/login/TokenService";
import { useNavigate } from "react-router-dom";

export function NavigationBar() {
  const navigate = useNavigate();

  const logout = () => {
    removeToken();
    navigate("/");
  };

  return (
    <Navbar expand="lg" bg="dark" data-bs-theme="dark">
      <Container>
        <Navbar.Brand href="#home">Student Management App</Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="me-auto">
            <LinkContainer to="/home">
              <Nav.Link>Home</Nav.Link>
            </LinkContainer>
            <LinkContainer to="/student-list">
              <Nav.Link>Student List</Nav.Link>
            </LinkContainer>
            <LinkContainer to="/register-student">
              <Nav.Link>Register Student</Nav.Link>
            </LinkContainer>
          </Nav>
          <Button variant="success" size="sm" onClick={logout}>
            Logout
          </Button>
        </Navbar.Collapse>
      </Container>
    </Navbar>
  );
}
