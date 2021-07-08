System.out.println("Your method:");
/list sumDigits
Thread.sleep(5000);
System.out.println();
System.out.println("And we will test it for this calls:");
System.out.println("\tsumDigits(\"aa1bc2d3\") -> 6");
System.out.println("\tsumDigits(\"a1b1c1d1e1f1g1h1i1j1k1l1m1n1o1p1r1s1t1u1w1x1y1z1\") -> 24");
System.out.println("\tsumDigits(\"\") -> 0");
System.out.println("\tsumDigits(\"abc123def456\") -> 21");
System.out.println("\tsumDigits(\"9966\") -> 30");
System.out.println("\tsumDigits(\"Lovely!\") -> 0");
s(4000);
System.out.println();
if (sumDigits("aa1bc2d3") != 6) {
            System.out.println("First test didn't work.");
        } else if (sumDigits("a1b1c1d1e1f1g1h1i1j1k1l1m1n1o1p1r1s1t1u1w1x1y1z1") != 24) {
            System.out.println("Second test didn't work.");
        } else if (sumDigits("") != 0) {
            System.out.println("Third test didn't work.");
        } else if (sumDigits("abc123def456") != 21) {
            System.out.println("Fourth test didn't work.");
        } else if (sumDigits("9966") != 30) {
            System.out.println("Fifth test didn't work. Most importatnt!");
        } else if (sumDigits("Lovely") != 0) {
            System.out.println("Sixth test didn't work. Most importatnt!");
        }else {
            System.out.println("Wow. You passed all tests. Congratulations such a feat!");
        }
	
public int rightSumDigits(String str) {
		//create array of char
        char[] charArr = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArr.length; i++) {
			//checks if given char is a digital number
            if (Character.isDigit(charArr[i])) {
				//parsing number and add to sum (use substring because parseInt method takes only string argument)
                sum += Integer.parseInt(str.substring(i, i + 1));
            }
        }
        return sum;
}


System.out.println("When you type /list rightSumDigits you can see how to do this exercise");
System.out.println();
System.out.println("That would be enough from strings");
System.out.println("To learn more see the oracle page: https://docs.oracle.com/javase/tutorial/java/data/strings.html or java language specification!");
System.out.println("Now we start with arrays. When you're ready go to /open ../arrays/Arrays.jsh");
