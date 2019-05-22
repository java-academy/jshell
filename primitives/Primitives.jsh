void s(long time){
	try{
		Thread.sleep(time);
	} catch (InterruptedException e){
	}
}

System.out.println("You know that there are 8 primitives type in java");
System.out.println("4 Integer Literals:");
System.out.println("\t byte: " + Byte.MIN_VALUE + " : " + Byte.MAX_VALUE + " of size " + Byte.SIZE + " bits");
System.out.println("\t short: " + Short.MIN_VALUE + " : " + Short.MAX_VALUE + " of size " + Short.SIZE + " bits");
System.out.println("\t int: " + Integer.MIN_VALUE + " : " + Integer.MAX_VALUE + " of size " + Integer.SIZE + " bits");
System.out.println("\t long: " + Long.MIN_VALUE + " : " + Long.MAX_VALUE + " of size " + Long.SIZE + " bits");
s(4000);
System.out.println("2 Floating-Point Literals:");
System.out.println("\t float: " + Float.MIN_VALUE + " : " + Float.MAX_VALUE + " of size " + Float.SIZE + " bits");
System.out.println("\t double: " + Double.MIN_VALUE + " : " + Double.MAX_VALUE + " of size " + Double.SIZE + " bits");
s(4000);
System.out.println("1 Character Literal:");
System.out.println("\t char: " + (int) Character.MIN_VALUE + " : " + (int) Character.MAX_VALUE + " of size " + Character.SIZE + " bits");
s(3000);
System.out.println("1 Logical Literal:");
System.out.println("\t boolean which has two values: " + Boolean.FALSE + " and " + Boolean.TRUE);
System.out.println("\t boolean represents 1 bit of information, but its size isn't something that's precisely defined");
System.out.println();
s(3000);
System.out.println("Use static fields of wrapped classes to see max and min values of all types like Integer.MAX_VALUE");
System.out.println("When you finish, write /open ../primitives/Q1.jsh");
