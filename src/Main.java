public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Lada Priora", 4);
        Car car2 = new Car("Mazda 3", 4);

        Truck truck1 = new Truck("Volvo FH4", 6);
        Truck truck2 = new Truck("Kamaz", 8);

        Bicycle bicycle1 = new Bicycle("Outleap", 2);
        Bicycle bicycle2 = new Bicycle("Stels", 2);

        ServiceStation station = new ServiceStation();

        station.check(car1);
        station.check(car2);
        station.check(truck1);
        station.check(truck2);
        station.check(bicycle1);
        station.check(bicycle2);
    }
}
