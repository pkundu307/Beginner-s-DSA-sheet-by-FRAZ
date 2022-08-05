import java.util.Arrays;

class twosum {

    public static int[] twoSum(int[] a, int target) {
        int[] b = new int[2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if ((i != j) && a[i] + a[j] == target) {
                    b[0] = i;
                    b[1] = j;
                }
            }

        }
        return b;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };

        int[] twoSum = twoSum(arr, 18);
        System.out.println(Arrays.toString(twoSum));
    }
}