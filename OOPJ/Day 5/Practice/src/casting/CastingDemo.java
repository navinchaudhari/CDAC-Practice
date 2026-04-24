package casting;

public class CastingDemo {
    public static void main(String[] args) {
      /*  FourWheeler fw;
        Car car = new Car();

        fw = car;
        fw.driveVehicle();
        ((Car)fw).driveCar();

        car = (Car) fw;
        car.driveCar();
        car.driveVehicle();*/

        Car  c = (Car) new FourWheeler();
        c.driveVehicle();
        c.driveCar();

    }
}
