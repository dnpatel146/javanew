import java.util.*;
import java.io.*;

public class dsa {
    static void Ins(int arr[], int n) {

        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;

                j--;
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 78, 6, 3, 90, 9, 1, 45, 3, 30, 60, 6, 5 };
        int n = arr.length;
        Ins(arr, n);

    }
}

// 45,3,30,60,6,5 => 3,45,30,60,6,5 =>
