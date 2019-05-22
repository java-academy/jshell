void s(long time){
	try{
		Thread.sleep(time);
	} catch (InterruptedException e){
	}
}

System.out.println("String in java is an immutable class (but not clearly immutable). It's because String objects are in one 'string constant pool'.");
System.out.println("What that's mean?");
System.out.println("When we start program our pool is empty.");
System.out.println("To fill the pool, we need to create new object.");
s(3000);
System.out.println("There are two ways to do that in java:");
System.out.println("\ta) by literal - String s = \"my string\";");
System.out.println("\t\t our variable hold the reference to string object in pool, if there is no such string in pool new literal is been created");
s(2000);
System.out.println("\tb) by keyword new - String s = new String(\"my string\");");
System.out.println("\t\t always create new object on heap, and if there is no such literal in pool new literal is been created too");
System.out.println("To be sure that we use object from pool, we can use String method intern() -> read documentation");
System.out.println();
s(1000);
System.out.println("We know something about String class, time for questions.");
System.out.println("Write /open ../string/Q1.jsh");
