import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage () {

        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;
        long average = 0;

        while (true) {
            try {
                String userInput = scanner.nextLine();
                int intSum = Integer.parseInt(userInput);
                long longAverage = Long.parseLong(userInput);
                sum += intSum;
                average = sum / count;
                count++;
            } catch (NumberFormatException badUserData) {
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
        }
    }
}
