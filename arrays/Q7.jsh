
if(answer == 3){
	System.out.println("You're right!");
	correct++;
} else{
	System.out.println("Too bad :(");
}
System.out.println("Compilator will tell that \"Integer number too large\", because range of int was exceeded.\n" +
"If you don't know why, go back to primitives questions.");
s(4000);
System.out.println();
System.out.println("Next question");
System.out.println("What will be the result of such operation:\n" +
"\tbyte[] max = new byte[150];");
System.out.println("1. runtime error");
System.out.println("2. array of size 150 conteining elements equal 0");
System.out.println("3. compilation error");
declare();
System.out.println("Write /open ../arrays/Q8.jsh");


