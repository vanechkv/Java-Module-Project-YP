import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = carsRegistration();
        System.out.println("Машины зарегистрированы. Гонка начинается!");
        String winner = Race.distance(cars);
        System.out.println("Самая быстрая машина: " + winner);

    }

    public static ArrayList<Car> carsRegistration() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название машины №" + (i + 1));
            String name = scanner.next();

            while (true) {
                try {
                    System.out.println("Введите скорость машины №" + (i + 1));
                    int speed = scanner.nextInt();
                    if (speed > 0 && speed <= 250) {
                        cars.add(new Car(name, speed));
                        Car newCar = cars.get(i);
                        System.out.println("Машина '" + newCar.name + "' со скоростью " + newCar.speed + " добавлена в гонку");
                        break;
                    } else {
                        scanner.nextLine();
                        System.out.println("Скорость должна быть от 0 до 250");
                    }
                } catch (InputMismatchException e) {
                    scanner.nextLine();
                    System.out.println("Неверное значение!");
                }
            }
        }
        return cars;
    }
}
