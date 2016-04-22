package sort;

import java.util.Random;


public class Driver 
{
	public static void main(String[] args)
	{
		int[] arrayOfNumbers = new int[10];
		Driver.fillArrayWithRandomInts(arrayOfNumbers);
		Driver.printIntArray(arrayOfNumbers);
		Driver.sortArray(arrayOfNumbers);
		Driver.printIntArray(arrayOfNumbers);
	}
	//Homework
	static void sortArray(int[] ar)
	{
		//put the elements of the array in order SOMEHOW!!!
		int temp;
        for(int i = 0; i < ar.length; i++)
        {
            for(int j = 1; j < (ar.length -i); j++)
            {
                if(ar[j-1] > ar[j])
                {
                    temp = ar[j-1];
                    ar[j-1]=ar[j];
                    ar[j]=temp;
                }
            }
        }
	}
	
	static void fillArrayWithRandomInts(int[] ar)
	{
		Random r = new Random();
		for(int i = 0; i < ar.length; i++)
		{
			ar[i] = r.nextInt(101);
		}
	}
	
	static void printIntArray(int[] ar)
	{
		for(int i = 0; i < ar.length; i++)
		{
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}
}