public class SelectionSort
{
public static void main(String[]args)
{

int[] arr ={13,16,11,20};// 0  1  2  3  //11 16 13 20  //1 2 3
for(int i=0;i<arr.length;i++)   // 11 16  13  20
{
int smallest = arr[i]; //16  //13   //20
for(int j=i+1;j<arr.length;j++) // 0+1;1<4 // 2; 2<4 // 1+1 ; 2<2
{
if(arr[i]>arr[j])    //13 > 16   // 16>11  // 13>20
{
	smallest = arr[j];   //11
	arr[j]=arr[i];    //16
	arr[i]=smallest;   //11
}
}
}
for(int k=0;k<arr.length;k++)
{
	System.out.print(arr[k] + " ");
}
}
}