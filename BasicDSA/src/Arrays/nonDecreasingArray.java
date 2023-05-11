package Arrays;

import  java.util.*;
public class nonDecreasingArray {
    public static void main(String[] args) {

       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
        int [] arr   = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println(isPossible(arr,n));

    }




    public static boolean isPossible(int[] arr, int n) {
        // Write your code here.

        boolean changed = false;
        if(n==0||n==1){
            return true;
        }
        for (int i = 0; i < arr.length-1; i++) {

          if(arr[i]<=arr[i+1]){
              continue;
          }
          if(changed){
              return false;
          }

          //but we need to change one of the value
          if(i==0||arr[i+1]>=arr[i-1]){
                arr[i]=arr[i+1];
          }
          else{
              arr[i+1] = arr[i];
          }
       changed=true;

        }
        return true;

    }
}

