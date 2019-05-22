void declare(){
	System.out.println("Remember to declare answer");
}
if(answer == 2){
	System.out.println("You're right!");
	correct++;
} else{
	System.out.println("Too bad :(");
}
System.out.println("Possible creations for one dimensional array:\nint[] a = new int[5];\nint b[] = new int[5];\nint[] c = {1,2,3};\n" + 
"int[] d = new int[]{1,2,3};\nThe size of the array is not part of its type (which is why the brackets are empty).");
s(4000);
System.out.println();
System.out.println("Next question");
System.out.println("How can't we declare multidimensional array?");
System.out.println("1. int[][] arr = new int[3][];");
System.out.println("2. int[][] arr = new int[3][3];");
System.out.println("3. int[][] arr = new int[][];");
declare();
System.out.println("Write /open ../arrays/Q3.jsh");


