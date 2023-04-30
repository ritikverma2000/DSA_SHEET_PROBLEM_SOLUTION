package Arrays;

public class SecondLargestElement {

    public static void main(String[] args) {

        int [] arr = {12 ,1 ,35 ,10 ,34 ,1 };

        System.out.println(findSecondLargest(arr.length,arr));

    }




    public static int findSecondLargest(int n, int[] arr) {
        // Write your code here.
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        // System.out.println(largest);
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }

        }
        if(secondLargest==Integer.MIN_VALUE){
            return -1;
        }




        return secondLargest;

    }
}



