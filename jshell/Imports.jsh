
System.out.println("First thing, which we'll learn is adding external library to jshell.");
System.out.println("To do that you must have on your computer jar with packages you want.");
System.out.println("For this tutorial we'll need Gson class.");
System.out.println("Find in the internet the latest version of gson.jar and download it.");
System.out.println("Remember the path to this jar file.");
System.out.println("Now in second terminal open /help /env and read because we'll use this command to add jar.");
s(10000);
System.out.println("If you know what /env is doing write command to add class path with needed jar.");
System.out.println("It looks like that: /env -class-path /dir/with/libs/*.jar, where last argument is a path to our jar file.");
System.out.println("So, add gson jar to class path. One thing which left is importing.");
System.out.println("Just type import com.google.gson.* and everything should be ok.");
System.out.println("You can check if import is available by /imports command.");
System.out.println("Now go to Finish.jsh. But only if you can see gson import.");

