import java.util.Arrays;

public class Activity3Tester {

	public static void main(String[] args) {
		
		//Declare a Board object
		Board obj = new Board();
		//create an array with some values you want to 
		//slideRight. ie [2 0 0 0]
		
		//invoke the slideRight method on the array 
		
		int[][] test1 = {{0, 4, 2, 0, 2, 0, 2}, {2, 0, 0, 2, 3, 4, 5}};
		//print out the array to see if slideRight
		//worked
	//	obj.slideRight(test1);
	//	System.out.println(Arrays.toString(test1));
		obj.toString();
		obj.slideUp();
		System.out.println(Arrays.toString(test1));
		
		
	}

}
