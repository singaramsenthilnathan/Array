/*
 A
 A B
 A B C
 A B C D
 A B C D E
 A B C D E F
 */
package test;
public class AlphPatt 
{
public static void main(String[] args) 
{

	for(int i=1;i<=6;i++)
	{
		int alph=65;
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)alph+" ");
			alph++;
		}
		System.out.println();
	}
}
}
