/*
Given two arrays, 1,2,3,4,5 and 2,3,1,0,5 
find which number is not present in the second array.
 */
package test;
public class RajArr 
{
public static void main(String[] args) 
{
int arr1[]= {1,2,3,4,5};
int arr2[]= {2,3,1,0,5};
int m=arr1.length;
int n=arr2.length;
findMissingElement(arr1,arr2,m,n);
}
static void findMissingElement(int[] arr1, int[] arr2, int m, int n) 
{
for(int i=0;i<m;i++)
{
int count=0;
for(int j=0;j<n;j++)
{
if(arr1[i]==arr2[j])
{
count++;
}
}
if(count<1)
{
System.out.println(arr1[i]);
}
}
}
}
