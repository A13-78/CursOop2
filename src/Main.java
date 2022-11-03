public class Main {
    public static void main(String[] args) {

        Car car = new Car("Веста",4);

        Truck truck = new Truck("Камаз", 10);

        Bicycle bicycle = new Bicycle("Скиф",2);

        ServiceStation station = new ServiceStation();
        station.check(bicycle);
        System.out.println();
        station.check(car);
        System.out.println();
        station.check(truck);





    }
}