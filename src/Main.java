public class Main {

    public static void main(String[] args) {

        createObject(" Машина ");
        System.out.println("___________________");
        createObject(" Самолет ");
        System.out.println("___________________");
        createObject(" Корабль ");
        System.out.println("___________________");
    }

    public static Transport createObject(String className) {
        
         switch (className) {
            case " Машина ":
                Car car = new Car("BMV", 2020, 3.2, "автомат");
                car.draw();
                break;
            case " Самолет ":
                Plane plane = new Plane(" An 202", 2022, 3500, 250);
                plane.draw();
                break;
            case " Корабль ":
                Ship ship = new Ship("Aurora", 2018, 4.3);
                ship.draw();
                break;
            default:
                System.out.println("Такого класса не существует!");
                break;
        }
        return null;
    }
}