package array1;

public class E15_double23 {
    /**
     *
     Given an int array, return true if the array contains 2 twice, or 3 twice.
     The array will be length 0, 1, or 2.


     double23([2, 2]) → true
     double23([3, 3]) → true
     double23([2, 3]) → false
     * @param args
     */
    public static void main(String[] args) {

        int [] arr={2,2};
        System.out.println("double23(arr) = " + double23(arr));

    }
    public static boolean double23(int[] nums) {

        int count2=0;
        int count3=0;

        for(int a:nums){
            if(a==2) count2++;
            if(a==3) count3++;
        }

        return count2==2||count3==2;

    }

}
