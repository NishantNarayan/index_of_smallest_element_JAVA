import java.util.Scanner;

public class problem71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter 10 numbers:");
		Scanner input = new Scanner(System.in);
		double[] numberarr = new double[10];
		for(int i=0;i<numberarr.length;i++) {
			numberarr[i] = input.nextInt();
		}
		System.out.print("Position of smallest element is: " + indexOfsmallestElement (numberarr));
	}
	public static int indexOfsmallestElement (double[] array) 
	{
		double low=array[0];
		int lowindex = 0;
		for(int i=0;i<array.length;i++) {
			if(array[i]<low) {
				low = array[i];
				lowindex=i;
			}
		}
		return lowindex;
	}
}
