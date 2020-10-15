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
        int max = -100;
        int[] arr2 = new int[arr.length];
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] > max)
            {
                max = arr[a];
            }
        }
            for (int b = 0; b < arr.length; b++)
            {
                if (arr[b] == max)
                {
                arr[b] = -1000;
                }
            }
        
        arr2 = arr; //array without the maximum value here. 
        int secondmax = -100;
        for (int c = 0; c < arr2.length; c++)
        {
            if (arr2[c] > secondmax)
            {
                secondmax = arr2[c];
            }
        }
    return secondmax;
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        boolean x = true;
        for (int i = 0; i < arr.length - 3; i++) {
            double var = arr[i];
            double var2 = arr[i+1];
            double var3 = arr[i+2];
            double var4 = arr[i+3];
            if ((var/var2 == var2/var3) && (var/var2 == var3/var4)){
                x = true;
            }

            else 
            {
                x =false;
                break;
            }
        }
        return x;
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
