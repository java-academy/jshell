void s(long time){
	try{
		Thread.sleep(time);
	} catch (InterruptedException e){
		Thread.currentThread().interrupt();
	}
}

System.out.println("JShell is is an interactive tool added in Java 9.");
System.out.println("Every time you write something, JShell evaluate it and print the result\n" +
			"It calls REPL - READ, EVAL, PRINT, LOOP");
System.out.println("Loop is beacuse we can do it over and over and over..");
s(5000);
System.out.println("First write '/help intro' and next '/help' and read the content");
System.out.println("Learn some useful commands:");
System.out.println("- Start typing name of some class and enter 'tab'");
System.out.println("  What do you see? Now try the same for class methods.");
System.out.println("- Declare few variables and make basic operations on them");
System.out.println("- Declare a method which add two int numbers");
System.out.println("- See the difference between /list and /vars");
System.out.println("- Try to declare class which contains two numbers and has methods to do operations on them");
s(5000);
System.out.println("Don't rush. You have how many time you want. When you finished, use /open command to open Imports.jsh");
