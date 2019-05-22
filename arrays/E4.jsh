System.out.println("Your method looks like that:");
/list maxValues
Thread.sleep(5000);
System.out.println();
System.out.println("Now we will test it for this calls:");
System.out.println("\tmaxValues([1, 2, 3]) -> [3, 3, 3]");
System.out.println("\tmaxValues([2, 16, 6, 18, 8, 10]) -> [18, 18, 18, 18, 18, 18]");
System.out.println("\tmaxValues([5, 5, 5]) -> [5, 5, 5]");
System.out.println("\tmaxValues([3, 0, -5, 2]) -> [3, 3, 3, 3]");
System.out.println("\tmaxValues([-3, -5, -2]) -> [-2, -2, -2]");
s(4000);
System.out.println();
if (!Arrays.equals(maxValues(new int[]{1, 2, 3}),new int[]{3, 3, 3})){
            System.out.println("First test didn't work.");
        } else if (!Arrays.equals(maxValues(new int[]{2, 16, 6, 18, 8, 10}),new int[]{18, 18, 18, 18, 18, 18})){
            System.out.println("Second test didn't work.");
        } else if (!Arrays.equals(maxValues(new int[]{5, 5, 5}),new int[]{5, 5, 5})) {
            System.out.println("Third test didn't work.");
        } else if (!Arrays.equals(maxValues(new int[]{3, 0, -5, 2}),new int[]{3, 3, 3, 3})) {
            System.out.println("Fourth test didn't work.");
        } else if (!Arrays.equals(maxValues(new int[]{-3, -5, -2}),new int[]{-2, -2, -2})) {
            System.out.println("Fourth test didn't work.");
        } else {
            System.out.println("Wow. You passed all tests. Congratulations such a feat!");
        }
	
public int[] rightMaxValues(int[] nums) {
  //finds max value at the end of array
  Arrays.sort(nums);
  //fill array with founded value
  Arrays.fill(nums, nums[nums.length - 1]);
  return nums;
}


System.out.println("When you type /list rightMaxValues you can see how to do this exercise");

System.out.println("Then write /open ../arrays/E5.jsh");
