System.out.println("If you don't know, your method looks like that:");
/list repeatSeparator
Thread.sleep(5000);
System.out.println();
System.out.println("Now we will test it for this calls:");
System.out.println("\trepeatSeparator(\"Very\", \"Happy\", 5) -> \"VeryHappyVeryHappyVeryHappyVeryHappyVeryHappy\"");
System.out.println("\trepeatSeparator(\"won't\", \"be\", 1) -> \"won't\"");
System.out.println("\trepeatSeparator(\"he is empty ->\", \"\", 2) -> \"he is empty->he is empty->\"");
System.out.println("\trepeatSeparator(\"give me\", \"a chance\", 0), -> \"\"");
s(4000);
System.out.println();
if (!repeatSeparator("Very", "Happy", 5).equals("VeryHappyVeryHappyVeryHappyVeryHappyVery")) {
            System.out.println("First test didn't work.");
        } else if (!repeatSeparator("won't", "be", 1).equals("won't")) {
            System.out.println("Second test didn't work.");
        } else if (!repeatSeparator("he is empty ->", "", 2).equals("he is empty ->he is empty ->")) {
            System.out.println("Third test didn't work.");
        } else if (!repeatSeparator("give me", "a chance", 0).equals("")) {
            System.out.println("Fourth test didn't work.");
        } else {
            System.out.println("Wow. You passed all tests. Congratulations such a feat!");
        }
	
public String rightRepeatSeparator(String word, String sep, int count) {
    //create object of StringJoiner with separator in constructor
    StringJoiner joiner = new StringJoiner(sep);
		//join words for given count
        for (int i = 0; i< count; i++){
            joiner.add(word);
        }
    return joiner.toString();
}


System.out.println("Something wrong with your solution?");
System.out.println("When you type /list rightRepeatSeparator you can see how to do this exercise");

System.out.println("Then write /open ../string/E5.jsh");
