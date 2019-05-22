System.out.println("Your method:");
/list mixString
Thread.sleep(5000);
System.out.println();
System.out.println("And we will test it for this calls:");
System.out.println("\tmixString(\"a\", \"b\") -> \"ab\"");
System.out.println("\tmixString(\"free\", \"hugs\") -> \"fhrueges\"");
System.out.println("\tmixString(\"trywithverylong\", \"word\") -> \"twroyrwdithverylong\"");
System.out.println("\tmixString(\"this\", \"could be long too\") -> \"tchoiusld be long too\"");
System.out.println("\tmixString(\"sievrdy\", \"mleeya\") -> guess what ;)");
s(4000);
System.out.println();
if (!mixString("a", "b").equals("ab")) {
            System.out.println("First test didn't work.");
        } else if (!mixString("free", "hugs").equals("fhrueges")) {
            System.out.println("Second test didn't work.");
        } else if (!mixString("trywithverylong", "word").equals("twroyrwdithverylong")) {
            System.out.println("Third test didn't work.");
        } else if (!mixString("this", "could be long too").equals("tchoiusld be long too")) {
            System.out.println("Fourth test didn't work.");
        } else if (!mixString("sievrdy", "mleeya").equals("smileeveryday")) {
            System.out.println("Fifth test didn't work. Most importatnt!");
        } else {
            System.out.println("Wow. You passed all tests. Congratulations such a feat!");
        }
	
public String rightMixString(String a, String b) {
  StringBuilder builder = new StringBuilder();
		//create arrays of char from strings
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
		//append by StringBuilder letter from a, and then from b
        for (int i = 0, j = 0; i < arrA.length & j < arrB.length; i++, j++) {
            builder.append(arrA[i]).append(arrB[i]);
        }
		//if something left add it to the end
        if (arrA.length > arrB.length){
            builder.append(a.substring(arrB.length));
        } else {
            builder.append(b.substring(arrA.length));
        }

        return builder.toString();
}

System.out.println("When you type /list rightMixString you can see how to do this exercise");

System.out.println("Then write /open ../string/E7.jsh");
