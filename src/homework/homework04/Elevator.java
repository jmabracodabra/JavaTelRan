package homework.homework04;

public class Elevator {
    public static void main(String[] args) {
        System.out.println(numberOfLifts(200, 50, 1));
    }

    private static int numberOfLifts(int floor, int stepUp, int stepDown) {
        int count = 0;
        int currentFloor = 0;

        do {
            currentFloor = currentFloor + stepUp - stepDown;
//            System.out.println("current: " + currentFloor + ", step up: " + stepUp + ", step down: " + stepDown);
            count++;
        } while (currentFloor < floor);

        return count;
    }
}
