System.out.println("You can see how looks your method by typing /list and name of method and see:");
/list makeOutWord
Thread.sleep(5000);
System.out.println();
System.out.println("Now we will test it for this calls:");
System.out.println("\tmakeOutWord(\"<<>>\", \"Works\") -> \"<<Works>>\"");
System.out.println("\tmakeOutWord(\"[[>>\", \"Butterfly\") -> \"[[Butterfly>>\"");
System.out.println("\tmakeOutWord(\"youare\", \" inside \") -> \"you inside are\"");
System.out.println("\tmakeOutWord(\"<<>\", \"what?\") -> \"\"");
s(4000);
System.out.println();
if (!makeOutWord("<<>>", "Works").equals("<<Works>>")) {
            System.out.println("First test didn't work.");
        } else if (!makeOutWord("[[>>", "Butterfly").equals("[[Butterfly>>")) {
            System.out.println("Second test didn't work.");
        } else if (!makeOutWord("youare", " inside ").equals("you inside are")) {
            System.out.println("Third test didn't work.");
        } else if (!makeOutWord("<<>", "what?").equals("")) {
            System.out.println("Fourth test didn't work.");
        } else {
            System.out.println("Wow. You passed all tests. Congratulations such a feat!");
        }
	
public String rightMakeOutWord(String out, String word) {
  int length = out.length();
  //checks if first argument is even
  if(length%2 != 0){
    return "";
  }
  //temp has out value starting in the middle of this word
  String temp = out.substring(length/2);
  //connects half of out value with word in the middle, and ends with temp variable
  out = out.substring(0, length/2) + word + temp;
  return out;
}

System.out.println("Something wrong with your solution?");
System.out.println("When you type /list rightMakeOutWord you can see how to do this exercise");

System.out.println("Then write /open ../string/E3.jsh");
