package Practice;

public class Array1 {

    public static void main(String[] args) {
        double num[] = {12.2, 5.1, 6.2, 8.1, 9.8};
        double result = 0;

        for (int i = 0; i < 5; i++) {
            result = result + num[i];
        }
        System.out.println("The average of Array is: " + result / num.length);

        int num1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int num2[][] = {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};

        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1[i].length; j++) {
                System.out.print(num1[i][j] * num2[i][j] + " ");
            }
            System.out.println();
        }
    }
}