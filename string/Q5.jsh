
if(answer == 2){
	System.out.println("You're right!");
	correct++;
} else{
	System.out.println("Too bad :(");
}
System.out.println("Operator == compare localization of objects. We have two different objects on heap in two different localizations.");
s(4000);
System.out.println();
System.out.println("Next question");
System.out.println("hat will be the result of: (new String(\"good\").compare(new String(\"good\"));)");
System.out.println("1. 4");
System.out.println("2. -4");
System.out.println("3. 0");
System.out.println("4. compilation error");
declare();
System.out.println("Write /open ../string/Q6.jsh");


