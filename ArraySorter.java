package Practice;

import java.util.Scanner;

public class ArraySorter {
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

       
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

  
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                   
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

         
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

      
        int[] arr = new int[n];

       
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

     
        bubbleSort(arr);

      
        System.out.println("The sorted array in ascending order is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

      
        scanner.close();
    }
}