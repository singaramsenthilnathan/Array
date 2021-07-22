//Write a java program to check the equality of two arrays?
package test;
import java.util.Arrays;
public class EqArr
{
public static void main(String[] args) 
{
int one[]= {23,65,76,90,1};
int two[]= {23,65,76,90,1};

//boolean eqnot=Arrays.equals(one, two);

System.out.println(Arrays.toString(one));
System.out.println(Arrays.toString(two));
if(Arrays.equals(one, two))
{
	System.out.println("Both are Equal");
}
else
{
	System.out.println("Not Equal");
}
}
}
