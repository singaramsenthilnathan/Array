package test;
import java.util.Scanner;
public class Klargest
{
public static void main(String[] args) 
{
	//int temp;
int arr[]= {67,8,99,23,1,10};
Scanner sc = new Scanner(System.in);
System.out.println("Enter Values");
int m=sc.nextInt();

for(int i=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]>arr[j])
		{
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
		}
}
}
for(int k=0;k<arr.length;k++)
{
	System.out.print(arr[k]+" ");
}
System.out.println();
System.out.print("Mth Largest :"+ arr[m-1]);
}
}
/*
OUTPUT:
Enter Values
4
1 8 10 23 67 99 
Mth Largest :23
*/
