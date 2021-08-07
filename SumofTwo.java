/*
3 Solutions to Find Pair Of Integers in Array whose Sum is Given Number
For example, 
if the input integer array is {2, 6, 3, 9, 11} and given sum is 9, 
the output should be {6,3}
 */
package test;
public class SumofTwo 
{
public static void main(String[] args) 
{
int arr1[]= {2, 6, 3, 9, 11};
int arr2;

for(int i=0;i<arr1.length;i++)
{
for(int j=i+1;j<arr1.length;j++)
{
arr2=arr1[i]+arr1[j];
if(arr2==9)
{
System.out.println(arr1[i]+" "+arr1[j]);
}
}
}
}
}
