import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();

    }


    private static void task1() {
        System.out.println("Задание 1, 2");
        int[] one = new int[3];
        for (int i = 0; i < one.length; i++) {
            one[i] = i + 1;
        }
        double[] two = {1.57, 7.654, 9.986};
        int[] three = {100, 200, 300, 400, 500};
        for (int i = 0; i < one.length; i++) {
            System.out.print(one[i]);
            if (i != one.length - 1) {
                System.out.print(", ");

            }
        }
        System.out.println();
        for (int i = 0; i < two.length; i++) {
            System.out.print(two[i]);
            if (i != two.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < three.length; i++) {
            System.out.print(three[i]);
            if (i != three.length - 1) {
                System.out.print(", ");
            }
        }
    }

    private static void task2() {
        System.out.println();
        System.out.println("Задание 3");
        int[] one = new int[3];
        for (int i = one.length - 1; i >= 0; i--) {
            one[i] = i + 1;
        }
        double[] two = {1.57, 7.654, 9.986};
        int[] three = {100, 200, 300, 400, 500};
        for (int i = one.length - 1; i >= 0; i--) {
            System.out.print(one[i]);
            if (i != 0) {
                System.out.print(", ");

            }
        }
        System.out.println();
        for (int i = two.length - 1; i >= 0; i--) {
            System.out.print(two[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = three.length - 1; i >= 0; i--) {
            System.out.print(three[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

    }

    private static void task3() {
        System.out.println();
        System.out.println("Задание 4");
        int[] one = new int[3];
        for (int i = 0; i < one.length; i++) {
            one[i] = i + 1;
            if (one[i] % 2 == 1) {
                one[i]++;
            }
        }
        System.out.println(Arrays.toString(one));
    }

}


















