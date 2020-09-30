import java.util.Arrays;
public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int [] x = new int[arr.length];
        int b = arr.length;
        for (int a = 0;a<arr.length;a++) {
            x[a] = arr[b-1];
            b = b-1;
        }
        return x;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int max = 0;
        
        for (int i = 0;i<arr.length;i++){
            if (max < arr[i]) {
                max = arr[i];
            }
            else {
                max = arr[i];
            }
        }
        int secondmax = arr[0];
        for (int i = 0;i<arr.length;i++){
            if (arr[i]!= max){
                int c = Math.max(secondmax,arr[i]);
                secondmax = c;
            }
            else {
                continue;
            }
        }
        return secondmax;
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        for (int i = 0;i < arr.length-1;i++){
            if (arr[i+1] == arr[i]*2) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(a)));
        int [] b = {1,2,3,7,11};
        System.out.println(secondLargest(b));
        int [] c = {1,2,4,8,16};
        System.out.println(isGeometric(c));
    }
}
