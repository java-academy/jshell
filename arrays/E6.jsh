System.out.println("Your method:");
/list joinArrays
Thread.sleep(5000);
System.out.println();
System.out.println("And we will test it for this calls:");
System.out.println("\tjoinArrays([1, 2, 3], [5, 6, 7]) -> [1, 2, 3, 5, 6, 7]");
System.out.println("\tjoinArrays([1, 2, 3], []) -> [1, 2, 3]");
System.out.println("\tjoinArrays([], [5, 6, 7]) -> [5, 6, 7]");
System.out.println("\tjoinArrays([1, 2], [5, 6, 7]) -> [1, 2, 5, 6, 7]");
System.out.println("\tjoinArrays([1, 2, 3], [5, 6]) -> [1, 2, 3, 5, 6]");
s(4000);
System.out.println();
if (!Arrays.equals(joinArrays(new int[]{1, 2, 3}, new int[]{5, 6, 7}), new int[]{1,2,3,5,6,7})) {
            System.out.println("First test didn't work.");
        } else if (!Arrays.equals(joinArrays(new int[]{1, 2, 3}, new int[]{}), new int[]{1,2,3})) {
            System.out.println("Second test didn't work.");
        } else if (!Arrays.equals(joinArrays(new int[]{}, new int[]{5, 6, 7}), new int[]{5,6,7})) {
            System.out.println("Third test didn't work.");
        } else if (!Arrays.equals(joinArrays(new int[]{1, 2}, new int[]{5, 6, 7}), new int[]{1,2,5,6,7})) {
            System.out.println("Fourth test didn't work.");
        } else if (!Arrays.equals(joinArrays(new int[]{1, 2, 3}, new int[]{5, 6}), new int[]{1,2,3,5,6})) {
            System.out.println("Fifth test didn't work. Most importatnt!");
        } else {
            System.out.println("Wow. You passed all tests. Congratulations such a feat!");
        }
	
public int[] rightJoinArrays(int[] a, int[] b) {
  //checks if one of arrays is empty
  if(a.length == 0){
	return b;
  }
  if(b.length == 0){
	return a;
  }
  //create an array to contaions two given
  int[] arr = new int[a.length + b.length];
	//copy first array at the begining
        System.arraycopy(a, 0, arr, 0, a.length);
	//copy second array at place where first was finished
        System.arraycopy(b, 0, arr, a.length, b.length);
        return arr;
}


System.out.println("When you type /list rightJoinArrays you can see how to do this exercise");

System.out.println("Then write /open ../arrays/E7.jsh");
