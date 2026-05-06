import { Alert, Button, Col, Container, Form, Row } from "react-bootstrap";
import { useForm } from "react-hook-form";
import { loginSchema } from "./ValidationSchema";
import { yupResolver } from "@hookform/resolvers/yup";
import { toast } from "react-toastify";
import { login } from "./Service";
import { getToken, storeToken } from "./TokenService";
import { useNavigate } from "react-router-dom";
import { useEffect } from "react";

export function Login() {
  const navigate = useNavigate();

  const {
    register, // to register theinput field of our form with react-hook-form
    formState: { errors },
    handleSubmit,
  } = useForm({
    resolver: yupResolver(loginSchema),
    defaultValues: { phone: "", password: "" },
  });

  useEffect(() => {
    if (getToken()) {
      navigate("/home");
    }
  }, []);

  const onSubmit = async (data) => {
    console.log(data);
    try {
      const response = await login(data);
      const loginData = response.data;
      toast.success("Login Successfull");
      console.log(response);

      storeToken(loginData.token); // Achieved loose coupling
      navigate("/home");
    } catch (err) {
      console.log(err.response.data.message);
      toast.error(err.response.data.message);
    }
  };

  return (
    <Container>
      <Alert variant="success">Login</Alert>
      <Form onSubmit={handleSubmit(onSubmit)}>
        <Row>
          <Col lg={4}>
            <Form.Group className="mb-3" controlId="formBasicPassword">
              <Form.Label>Phone</Form.Label>
              <Form.Control
                type="text"
                name="phone"
                placeholder="Enter Phone"
                {...register("phone")}
                isInvalid={!!errors.phone}
              />
              <Form.Control.Feedback type="invalid">
                {errors.phone?.message}
              </Form.Control.Feedback>
            </Form.Group>
          </Col>
        </Row>
        <Row>
          <Col lg={4}>
            <Form.Group className="mb-3">
              <Form.Label>Password</Form.Label>
              <Form.Control
                type="password"
                name="password"
                placeholder="Enter Password"
                {...register("password")}
                isInvalid={!!errors.password} //return a boolean value
              />
              <Form.Control.Feedback type="invalid">
                {errors.password?.message}
              </Form.Control.Feedback>
            </Form.Group>
          </Col>
        </Row>
        <Row>
          <Col lg={4} className="mb-3">
            <Form.Check
              name="role"
              type={"radio"}
              label={"Admin"}
              value={"admin"}
              {...register("role")}
            />
            <Form.Check
              name="role"
              type={"radio"}
              label={"Student"}
              value={"student"}
              {...register("role")}
              isInvalid={!!errors.role}
              checked
            />
            <div>{errors.role?.message}</div>

            {/* <Form.Control.Feedback type="invalid">
              {errors.role?.message}
            </Form.Control.Feedback> */}
          </Col>
        </Row>
        <Button variant="primary" type="submit">
          Login
        </Button>
      </Form>
    </Container>
  );
}
