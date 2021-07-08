if(answer == 1){
        System.out.println("You're right!");
        correct++;
} else{
        System.out.println("Too bad :(");
}
System.out.println("If we divide the string, sign of plus (+) must be added.");
s(4000);
System.out.println("You have " + correct + " correct answers on 8 possible");
System.out.println("If you aren't satisfied you know what to do");
if(correct == 8){
        System.out.println("I can't believe you are so smart..");
}
System.out.println();
System.out.println("First task is to return string which consist of two other strings.\n" +
"Method takes two strings: out and word, and the word must be in the middle of out.\n" +
"For example, makeOutWord(\"<<>>\", \"Yay\") -> \"<<Yay>>\"");
System.out.println("Check if arguments are ok, if not return empty string");
System.out.println("Type your method in JShell and named it as above makeOutWord");
System.out.println("When you finish, write /open ../string/E2.jsh");
