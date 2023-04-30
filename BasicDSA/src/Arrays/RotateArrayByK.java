package Arrays;

import java.util.* ;

class RotateArrayByK {

    public static void main(String args[]) {

        // Write code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []  arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();


        int [] ans = rotateArraybyK2(n, arr, k );


    }

    //approach2
    //reversal algorithm
    public static int[] rotateArraybyK2(int n , int [] arr ,int k ){

       int [] temp1 = new int[k];

        for (int i = 0; i <k ; i++) {
            temp1[i]=arr[i];

        }
        temp1=rev(temp1);
        int [] temp2 = new int[n-k];
        int p=k;
        for (int i = 0; i <temp2.length ; i++) {
            if (p < n) {
                temp2[i] = arr[p];
                p++;
            }

        }
        temp2=rev(temp2);
        int j=0;
        for (int i = 0; i <n ; i++) {
            if(i<k){
                arr[i]=temp1[i];
            }
            else{
                arr[i]=temp2[j];
                j++;

            }

        }

        arr=rev(arr);
        System.out.println(Arrays.toString(arr));


 return arr;
    }

    public static int[] rev(int [] arr){
        int [] rev = new int[arr.length];
        int k=0;
        for (int i = arr.length-1; i >= 0; i--) {
            rev[k]=arr[i];
            k++;
        }
return rev;
    }

    public static int[] rotateArraybyK(int n , int [] arr ,int k ){

        while(k>0){
            int ele = arr[0];
            for(int i=0;i<n-1;i++){
                arr[i]=arr[i+1];
            }
            arr[n-1]=ele;
            k--;
        }
        return arr;

    }
}