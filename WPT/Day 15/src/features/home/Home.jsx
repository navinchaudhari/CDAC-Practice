import { Container, Alert } from "react-bootstrap";

export function Home() {
  return (
    <Container className="mt-4">
      <Alert variant="primary">Welcome to Student Management App</Alert>
      <p>You can perform CRUD Operations on Student</p>
    </Container>
  );
}
