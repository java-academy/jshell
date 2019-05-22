System.out.println("Your method:");
/list move
Thread.sleep(5000);
System.out.println();
System.out.println("And we will test it for this calls:");
System.out.println("\tmove([1, 2, 3, 4, 5], 1) -> [5, 1, 2, 3, 4]");
System.out.println("\tmove([1, 2, 3, 4, 5], 0) -> [1, 2, 3, 4, 5]");
System.out.println("\tmove([1, 2, 3, 4, 5], 3) -> [3, 4, 5, 1, 2]");
System.out.println("\tmove([1, 2, 3, 4, 5], 5) -> [1, 2, 3, 4, 5]");
System.out.println("\tmove([1, 2, 3, 4, 5], 7) -> [4, 5, 1, 2, 3]");
s(4000);
System.out.println();

if (!Arrays.equals(move(new int[]{1, 2, 3, 4, 5}, 1), new int[]{5,1,2,3,4})) {
            System.out.println("First test didn't work.");
        } else if (!Arrays.equals(move(new int[]{1, 2, 3, 4, 5}, 1), new int[]{5,1,2,3,4})) {
            System.out.println("Second test didn't work.");
        } else if (!Arrays.equals(move(new int[]{1, 2, 3, 4, 5}, 0), new int[]{1,2,3,4,5})) {
            System.out.println("Third test didn't work.");
        } else if (!Arrays.equals(move(new int[]{1, 2, 3, 4, 5}, 3), new int[]{3,4,5,1,2})) {
            System.out.println("Fourth test didn't work.");
        } else if (!Arrays.equals(move(new int[]{1, 2, 3, 4, 5}, 5), new int[]{1,2,3,4,5})) {
            System.out.println("Fifth test didn't work. Most importatnt!");
        } else if (!Arrays.equals(move(new int[]{1, 2, 3, 4, 5}, 7), new int[]{4,5,1,2,3})) {
            System.out.println("Sixth test didn't work. Most importatnt!");
        }else {
            System.out.println("Wow. You passed all tests. Congratulations such a feat!");
        }
	
public int[] rightMove(int[] arr, int times){
	//checks if array can stay without changes
        if (times%arr.length == 0 || times == 0){
            return arr;
        }
	//checks if number of moves can be repeated
        if (times > arr.length){
            times = times%arr.length;
        }
        int[] moved = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
	    //for first part of array
            if (i < arr.length - times){
		//puts elements moved by number of times
                moved[i + times] = arr[i];
            } else{
                moved[i - (arr.length - times)] = arr[i];
            }
        }
        return moved;
    }


System.out.println("When you type /list rightMove you can see how to do this exercise");

System.out.println();
System.out.println("That's all for now. Try to do more exercises for example on page https://codingbat.com/java");
System.out.println("Read also documentation and oracle tutorials.");
