
if(answer == 3){
	System.out.println("You're right!");
	correct++;
} else{
	System.out.println("Too bad :(");
}
System.out.println("'!' in ASCII has a value 33, and 'A' is 97, so addition give us 98.\n" + 
"If we convert it to char, we will get 'b', which value is equal to 98 in ASCII.");
s(4000);
System.out.println("You have " + correct + " correct answers on 9 possible");
System.out.println("If you aren't satisfied repeat test (or cheat the system and declare correct variable on 9 )");
if(correct == 9){
	System.out.println("Wow, all correct! You're so great :D");
}
System.out.println();
System.out.println();
System.out.println("Check what is the difference between integer literals and floating-point literals");
System.out.println("Is it possible to exceed the range? Why or why not?");
System.out.println("Declare maxDouble and maxFloat by using wrapped classes");
System.out.println("For example double maxDouble = Double.MAX_VALUE;");
System.out.println("Try to manipulate this values, for example add, divide (use zero = 0 variable). What happend?");
System.out.println("Write /open ../primitives/E2.jsh");


