
if(answer == 3){
	System.out.println("You're right!");
	correct++;
} else{
	System.out.println("Too bad :(");
}
System.out.println("compare() method has algorithm which count difference between decimal representation in ASCII\n" +
"(default - but you can write your own comparator).\n" + 
"   - if first string starts with \"smaller\" letter returned number is positive\n" + 
"   - if first string starts with \"bigger\" letter returned number is negative\n" + 
"   - if strings are equal returned number is 0\n" +
"'g' in ASCII = 4, and 4 - 4 = 0");
s(6000);
System.out.println();
System.out.println("Next question");
System.out.println("What will be the result of: (new String(\"good\").compare(new String(\"Good\"));)");
System.out.println("1. 4");
System.out.println("2. 0");
System.out.println("3. 32");
System.out.println("4. compilation error");
System.out.println("You can check decimal representation by delaring letter as int, for example int a = 'a';");
declare();
System.out.println("Write /open ../string/Q7.jsh");


