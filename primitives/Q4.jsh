
if(answer == 2){
	System.out.println("You're right!");
	correct++;
} else{
	System.out.println("Too bad :(");
}
System.out.println("1111 1111 1111 1111 1111 1111 1111 1111 - first bit must be one to define that number is negative,\n" + 
"to get negative number we take positive representation of number and do the negation (all 0 change to 1, all 1 change to 0),\n" + 
"and then add binary one, because range isn't symmetric");
s(4000);
System.out.println();
System.out.println("Next question");
System.out.println("How min and max values look as binary");
System.out.println("1. min: 0000 0000 0000 0000 0000 0000 0000 0001 max: 1111 1111 1111 1111 1111 1111 1111 1111");
System.out.println("2. min: 1000 0000 0000 0000 0000 0000 0000 0000 max: 0111 1111 1111 1111 1111 1111 1111 1111");
System.out.println("3. min: 0000 0000 0000 0000 0000 0000 0000 0001 max: 1000 0000 0000 0000 0000 0000 0000 0000");
declare();
System.out.println("Write /open ../primitives/Q5.jsh");


