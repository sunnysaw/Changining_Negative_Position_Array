/*
Question : Given an unsorted array arr[] of size N having both negative and positive integers, place
all negative elements at the end of array without changing the order of positive elements
and negative elements
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start, sizeOfArray, swapValue, secondStart;
        System.out.println("Enter the length of array :");
        sizeOfArray = input.nextInt();
        System.out.println("Enter the element inside array :");
        int[] array = new int[sizeOfArray];
        for (start = 0; start < array.length; start++) {
            array[start] = input.nextInt();
        }
        System.out.println("Printing the result :");
        for (start = 0; start < array.length; start++) {
            for (secondStart = 0; secondStart < array.length - 1 - start; secondStart++) {
                if (array[secondStart] < 0) {
                    swapValue = array[secondStart];
                    array[secondStart] = array[secondStart + 1];
                    array[secondStart + 1] = swapValue;
                }
            }
       }
        for (start = 0; start < array.length; start++) {
                System.out.print(array[start] + " ");
        }
    }
}
