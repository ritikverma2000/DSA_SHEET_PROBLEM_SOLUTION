package Arrays;

public class equilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {1 ,7 ,3 ,6 ,5 ,6};
        System.out.println(arrayEquilibriumIndex(arr));
    }

    public static int arrayEquilibriumIndex(int[] arr) {
        //Your code goes here

        int total_sum = 0;
        //finding total_sum
        for (int j : arr) {
            total_sum = total_sum + j;
        }
        // for first element left index will be zero
        int left_sum_ele = 0;

        for (int i = 0; i < arr.length; i++) {
            int right_sum_ele = total_sum - left_sum_ele - arr[i];

            if (right_sum_ele == left_sum_ele) {
                return i;
            }
            left_sum_ele = left_sum_ele + arr[i];

        }
        return -1;
    }
}
