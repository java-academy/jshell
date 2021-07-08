void declare(){
	System.out.println("Remember to declare answer");
}

if(answer == 2){
	System.out.println("You're right!");
	correct++;
} else{
	System.out.println("Too bad :(");
}
System.out.println("We need 2 places to represent binary values of 1 and 0. n is a size of type in bits.\n" +
"Subtracting one from min and max is because we need to leave place for most significant bit.\n" +
"The minus one from max value is for representing zero.");
s(6000);
System.out.println();
System.out.println("Next question");
System.out.println("What is binary representation of 1");
System.out.println("1. 0000 0000 0000 0000 0000 0000 0000 0001");
System.out.println("2. 1111 1111 1111 1111 1111 1111 1111 1111");
System.out.println("3. 1000 0000 0000 0000 0000 0000 0000 0000");
System.out.println("If you need help, try to type primitive wrapped class and check its methods. Use 'tab' for that.");
System.out.println("For example: Integer.to ...");
declare();
System.out.println("Write /open ../primitives/Q3.jsh");


