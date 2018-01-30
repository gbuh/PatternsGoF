package creational.AbstractFactory.auto;

public interface AutoFactory {
    Carcase getCarcase();
    Motor getMotor();
    Chassis getChassis();
}
