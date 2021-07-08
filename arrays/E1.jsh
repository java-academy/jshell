if(answer == 2){
        System.out.println("You're right!");
        correct++;
} else{
        System.out.println("Too bad :(");
}
System.out.println("When we create new array, it is fill by default values, so for logical boolean it will be false.\n" +
"If condition is true, so program will print num variable.");
s(4000);
System.out.println("You have " + correct + " correct answers on 8 possible");
System.out.println("If you aren't satisfied you know what to do");
if(correct == 8){
        System.out.println("I can't believe you are so smart..");
}
System.out.println();
System.out.println("And now very basic problem. You have an array and want to reverse it. Return array with a new order.");
System.out.println("For example, [1, 2, 3] -> [3, 2, 1]");
System.out.println("Type your method in JShell and named it reverse");
System.out.println("When you finish, write /open ../arrays/E2.jsh");
