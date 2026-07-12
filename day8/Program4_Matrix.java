package day8;

public class Program4_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int marks[][]= {{99,98,97},{89,88,87},{79,78,77},{69,68,67}};
     for(int row=0;row<=marks.length-1;row++)
     {
    	 for(int col=0;col<=marks[row].length-1;col++)
    		 System.out.print(marks[row][col]+" ");
    	 System.out.println();
     }
    	 
	}

}
