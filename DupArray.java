//Write a java program to check the equality of two arrays?
package test;
public class DupArray 
{
public static void main(String[] args) 
{
String arr[]= {"Java","Jsp","Vb","Java","SQL"};
for(int i=0;i<arr.length-1;i++)
{
	for(int j=0+1;j<arr.length;j++)
	{
		if(arr[i].equals(arr[j]) && i!=j)
		{
			System.out.println(arr[j]);
		}
	}
}
}
}
