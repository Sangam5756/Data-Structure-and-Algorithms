// Given an array of integers, find and print the non-duplicate elements.

import java.util.HashMap;
import java.util.Scanner;

public class Main{

    public static void findNonDuplicateElements(int[] arr) {
      HashMap<Integer,Integer> hm = new HashMap<>();

      for(int i : arr){
        hm.put(i, hm.getOrDefault(i, 0) +1);
      }

      for(int x : hm.keySet()){
        if(hm.get(x) <= 1){
            System.out.println(x+" ");
        }
      }
      
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        // Find and print non-duplicate elements
        findNonDuplicateElements(arr);
        scanner.close();
    }
}
