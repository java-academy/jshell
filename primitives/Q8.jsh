
if(answer == 1){
	System.out.println("You're right!");
	correct++;
} else{
	System.out.println("Too bad :(");
}
System.out.println("We get compile error 'incompatible types: possible lossy conversion from int to short',\n" +
"because JVM treats short values as integer literal so short variable can't contain int without loosing precision");
s(4000);
System.out.println();
System.out.println("Next question");
System.out.println("Whitch line/s doesn't compile?");
System.out.println("\ta) float f1 = 3;");
System.out.println("\tb) float f2 = 3.14;");
System.out.println("\tc) double d1 = 3;");
System.out.println("\td) double d2 = 3.14;");
System.out.println("1. b, d");
System.out.println("2. b");
System.out.println("3. d");
System.out.println("4. all of them");
declare();
System.out.println("Write /open ../primitives/Q9.jsh");


