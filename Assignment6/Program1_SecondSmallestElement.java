package Assignment6;

public class Program1_SecondSmallestElement {

	public static void main(String[] args) { 

		        int arr[] = {4, 2, 7, 2, 9, 1};

		        int smallest = Integer.MAX_VALUE;
		        int secondSmallest = Integer.MAX_VALUE;

		        
		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] < smallest) {
		                smallest = arr[i];
		            }
		        }

		        
		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] > smallest && arr[i] < secondSmallest) {
		                secondSmallest = arr[i];
		            }
		        }

		       
		        if (secondSmallest == Integer.MAX_VALUE) {
		            System.out.println("No second smallest element");
		        } else {
		            System.out.println("Second Smallest = " + secondSmallest);
		        }
		    }
		

	}


