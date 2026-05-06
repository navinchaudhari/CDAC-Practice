import { useEffect, useState } from "react";
import { Alert, Button, Col, Container, Form, Row } from "react-bootstrap";
import { useParams } from "react-router-dom";
import { toast } from "react-toastify";
import { getStudentById } from "./Service";

export function UpdateStudent() {
  const { id } = useParams(); // hook to read all the url parameters (id).

  const [formData, setFormData] = useState({
    name: "",
    phone: "",
    city: "",
    marks: "",
  });

  const getStudentData = async () => {
    try {
      const response = await getStudentById(id);
      const studentData = response.data;
      setFormData({
        name: studentData.name,
        phone: studentData.phone,
        city: studentData.city,
        marks: studentData.marks,
      });
    } catch (error) {
      toast.error("Error in Fetching Data");
    }
  };

  useEffect(() => {
    getStudentData();
  }, []);

  const handleChange = (event) => {
    setFormData({ ...formData, [event.target.name]: event.target.value });
  };

  const handleSubmit = async (event) => {
    try {
      event.preventDefault();
      console.log(formData);
      //   await registerStudent(formData);
      //   toast.success("Student got registered");
      // setFormData({});
    } catch (error) {
      console.log(error);
      toast.error("Error in Registration");
    }
  };

  return (
    <Container>
      <Alert variant="success">Update The Student</Alert>
      <Form onSubmit={handleSubmit}>
        <Row>
          <Col lg={4}>
            <Form.Group className="mb-3" >
              <Form.Label>Name</Form.Label>
              <Form.Control
                type="text"
                value={formData.name}
                name="name"
                placeholder="Enter Name"
                onChange={handleChange}
              />
            </Form.Group>
          </Col>
          <Col lg={4}>
            <Form.Group className="mb-3" >
              <Form.Label>Phone No</Form.Label>
              <Form.Control
                type="text"
                value={formData.phone}
                name="phone"
                placeholder="Enter Phone"
                onChange={handleChange}
              />
            </Form.Group>
          </Col>
        </Row>
        <Row>
          <Col lg={4}>
            <Form.Group className="mb-3" >
              <Form.Label>City</Form.Label>
              <Form.Control
                type="text"
                value={formData.city}
                name="city"
                placeholder="Enter City"
                onChange={handleChange}
              />
            </Form.Group>
          </Col>
          <Col lg={4}>
            <Form.Group className="mb-3" >
              <Form.Label>Marks</Form.Label>
              <Form.Control
                type="text"
                value={formData.marks}
                name="marks"
                placeholder="Enter Marks"
                onChange={handleChange}
              />
            </Form.Group>
          </Col>
        </Row>
        <Button variant="primary" type="submit">
          Update
        </Button>
      </Form>
    </Container>
  );
}
