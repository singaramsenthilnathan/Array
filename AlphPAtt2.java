/*
A
B B
C C C
D D D D
E E E E E
F F F F F F
 */
package test;
public class AlphPAtt2
{
public static void main(String[] args) 
{
int al=65;
for(int i=1;i<=6;i++)
{
for (int j=1;j<=i;j++)
{
System.out.print((char)al+" ");		
}
al++;
System.out.println();
}
}
}
