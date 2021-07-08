
if(answer == 1){
	System.out.println("You're right!");
	correct++;
} else{
	System.out.println("Too bad :(");
}
System.out.println("All arrays are an object. Result of arr.getClass() is 'class [I' for int typ,\n" +
"'class [B' for byte type, 'class [S' for short type, 'class [Ljava.lang.String' for String.\n" + 
"And the result of arr.getClass().getSuperclass() is 'class java.lang.Object'. \n" +
"Because of that we can call all of Object methods on array.");
s(4000);
System.out.println();
System.out.println("Next question");
System.out.println("What will be the result of arrays comparison:\n" +
"(new int[]{1, 2, 3}).equals(new int[]{1, 2, 3})");
System.out.println("1. true");
System.out.println("2. false");
System.out.println("3. compilation error");
declare();
System.out.println("Write /open ../arrays/Q6.jsh");


