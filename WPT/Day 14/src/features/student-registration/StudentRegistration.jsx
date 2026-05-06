import { useState } from "react";
import { Alert, Button, Col, Container, Form, Row } from "react-bootstrap";
import { registerStudent } from "./Service";
import { toast } from "react-toastify";

export function StudentRegistration() {
  const [formData, setFormData] = useState({
    name: "",
    phone: "",
    city: "",
    marks: "",
  });

  const handleChange = (event) => {
    setFormData({ ...formData, [event.target.name]: event.target.value });
  };

  const handleSubmit = async (event) => {
    try {
      event.preventDefault();
      console.log(formData);
      await registerStudent(formData);
      toast.success("Student got registered");
      // setFormData({});
    } catch (error) {
      console.log(error);
      toast.error("Error in Registration");
    }
  };

  return (
    <Container>
      <Alert variant="success">Register The Student</Alert>
      <Form onSubmit={handleSubmit}>
        <Row>
          <Col lg={4}>
            <Form.Group className="mb-3" controlId="formBasicPassword">
              <Form.Label>Name</Form.Label>
              <Form.Control
                type="text"
                name="name"
                placeholder="Enter Name"
                onChange={handleChange}
              />
            </Form.Group>
          </Col>
          <Col lg={4}>
            <Form.Group className="mb-3" controlId="formBasicPassword">
              <Form.Label>Phone No</Form.Label>
              <Form.Control
                type="text"
                name="phone"
                placeholder="Enter Phone"
                onChange={handleChange}
              />
            </Form.Group>
          </Col>
        </Row>
        <Row>
          <Col lg={4}>
            <Form.Group className="mb-3" controlId="formBasicPassword">
              <Form.Label>City</Form.Label>
              <Form.Control
                type="text"
                name="city"
                placeholder="Enter City"
                onChange={handleChange}
              />
            </Form.Group>
          </Col>
          <Col lg={4}>
            <Form.Group className="mb-3" controlId="formBasicPassword">
              <Form.Label>Marks</Form.Label>
              <Form.Control
                type="text"
                name="marks"
                placeholder="Enter Marks"
                onChange={handleChange}
              />
            </Form.Group>
          </Col>
        </Row>
        <Button variant="primary" type="submit">
          Register
        </Button>
      </Form>
    </Container>
  );
}
