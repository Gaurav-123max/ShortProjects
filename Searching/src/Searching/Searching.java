package Searching;
import java.io.*;
import java.util.*;
public class Searching {
public static int linearSch(int[] arr, int  key)
{
	for (int i=0;i< arr.length; i++)
	{
		if (arr[i]== key)
			return i;
	}
	return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated 
		Scanner sc=  new Scanner (System.in); 
		 int arr[]= {88,33,66,44,77,22,55, 11};
		 System.out.println("Enter the value to search:   ");
		int key=sc.nextInt();
		
		int index1 =linearSch(arr,key);
		if (index1 !=-1)
		System.out.println("key is found ---" +index1);
		else
			System.out.print("key is not fount");
		
		 
		 
		 
	} 

}
