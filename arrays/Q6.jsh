
if(answer == 2){
	System.out.println("You're right!");
	correct++;
} else{
	System.out.println("Too bad :(");
}
System.out.println("Comparison of arrays is \"shallow\", so we don't compare elements of array.\n" + 
"To do that we must use Arrays.equals() method.");
s(4000);
System.out.println();
System.out.println("Next question");
System.out.println("What will be the result of such operation:\n" +
"\tint[] max = new int[3_000_000_000];");
System.out.println("1. runtime error");
System.out.println("2. array of size 3_000_000_000 conteining elements equal 0");
System.out.println("3. compilation error");
declare();
System.out.println("Write /open ../arrays/Q7.jsh");


