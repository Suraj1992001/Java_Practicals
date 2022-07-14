package practicals_14_07_2022;
import java.util.*;
public class changing_rows_columns
{
	public static void main(String[] args) 
	{
		changing_rows_columns obj = new changing_rows_columns();
		obj.array_demo();
	}
	public void array_demo()
	{
		Scanner sc = new Scanner(System.in);
		int rows,cols,i,j;
		System.out.println("Enter the rows and columns of an array:");
		rows=sc.nextInt();
		cols=sc.nextInt();
		int[][] arr = new int[rows][cols];
		System.out.println("Enter the elements in an array:");
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Original Array is:");
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
		}
		System.out.println("\n New Array is:");
		for(i=0;i<cols;i++)
		{
			for(j=0;j<rows;j++)
			{
				System.out.print(arr[j][i]+"\t");
			}
		}
	}
}
