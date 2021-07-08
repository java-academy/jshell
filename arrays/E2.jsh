System.out.println("Your method:");
/list reverse
s(5000);
System.out.println();
System.out.println("Now we will test it for this calls:");
System.out.println("\treverse([1, 2, 3]) -> [3, 2, 1]");
System.out.println("\treverse([1, 2, 3, 1, 2, 3]) -> [3, 2, 1, 3, 2, 1]");
System.out.println("\treverse([0, 0, 0, 0]) -> [0, 0, 0, 0]");
System.out.println("\treverse([]) -> []");
s(4000);
System.out.println();
if (!Arrays.equals(reverse(new int[]{1, 2, 3}),new int[]{3, 2, 1})) {
            System.out.println("First test didn't work.");
        } else if (!Arrays.equals(reverse(new int[]{1, 2, 3, 1, 2, 3}),new int[]{3, 2, 1, 3, 2, 1}))  {
            System.out.println("Second test didn't work.");
        } else if (!Arrays.equals(reverse(new int[]{0, 0, 0, 0}), new int[]{0, 0, 0, 0})) {
            System.out.println("Third test didn't work.");
        } else if (!Arrays.equals(reverse(new int[]{}),new int[]{})) {
            System.out.println("Fourth test didn't work.");
        } else {
            System.out.println("Wow. You passed all tests. Congratulations such a feat!");
        }
	
public int[] rightReverse(int[] nums) {
  int[] temp = new int[nums.length];
	//two conditions in loop to iterate over two arrays
        for(int i = nums.length - 1, j = 0; i >= 0 & j < nums.length; i--, j++){
            temp[i] = nums[j];
        }
        return temp;
}


System.out.println("Something wrong with your solution?");
System.out.println("When you type /list rightReverse you can see how to do this exercise");

System.out.println("Then write /open ../arrays/E3.jsh");
