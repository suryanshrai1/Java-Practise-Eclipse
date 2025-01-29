public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i; // New length of the array after removal
    }

    public static void main(String[] args) {
        // Example usage
        int[] nums = {3, 2, 2, 3, 4, 5, 3};
        int val = 3;

        int newSize = removeElement(nums, val);

        System.out.println("New size: " + newSize);
        System.out.print("Modified array: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}