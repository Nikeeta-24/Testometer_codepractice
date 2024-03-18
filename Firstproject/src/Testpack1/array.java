package Testpack1;

public class array {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		
		
		//1st syntax for declaring array-
		//datatype[] refvariablename={values of variables};
		//indexing     0 1 2 3 4
		int[] array1= {a,b,3,4,5};
		
		
		// System.out.println(array1[1]);	 //one way to print number from array 

int arraynum=array1[3];
System.out.println(arraynum);               //second way to print number from array 
	
	
//2nd syntax for declaring array-when we know how many nos we need in the array.+
	
int [] array2= new int[5];
array2[0]=100;
array2[1]=200;
System.out.println(array2[1]);


	
	
	
	}

}
