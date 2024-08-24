import java.util.ArrayList;

public class Race {
    public static String distance (ArrayList<Car> cars) {
        int distance = 0;
        String winner = null;
        for (Car car : cars) {
            int newDistance = car.speed * 24;
            if (newDistance > distance) {
                distance = newDistance;
                winner = car.name;
            }
        }
        return winner;
    }
}
