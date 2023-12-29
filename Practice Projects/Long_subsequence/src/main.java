public class main {
    public static int length(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= nums[i - 1]) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        int[] numbers = {-10, 1, 7, -30, -40, -50, 65};
        int ans = length(numbers);
        System.out.println("Length of longest increasing subsequence is: " + ans);
    }
}
