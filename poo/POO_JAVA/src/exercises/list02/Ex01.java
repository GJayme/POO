package exercises.list02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        int [] temperatures = new int[7];
        double averangeTemp;

        inputTemp(temperatures);

        averangeTemp = averangeTemperature(temperatures);

        aboveTemperatures(temperatures, averangeTemp);
    }

    public static void inputTemp(int[] temperatures) {
        Scanner scanner = new Scanner(System.in);

        for (int i =0; i < temperatures.length; i++){
            temperatures[i] = scanner.nextInt();
        }
    }

    public static double averangeTemperature(int[] temperatures) {
        double averange = 0;

        for (int i = 0; i < temperatures.length; i++) {
            averange += temperatures[i];
        }

        return averange/temperatures.length;
    }

    public static void aboveTemperatures(int[] temperatures, double averangeTemperature) {
        int countAboveTemperatures =0;
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i]> averangeTemperature) {
                countAboveTemperatures += 1;
            }
        }
        System.out.println(countAboveTemperatures);
    }
}
