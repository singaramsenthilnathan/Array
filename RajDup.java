package test;
public class RajDup
{
public static void main(String[] args) 
{
	int arr1[]= {100,9,19,29,39,23,99};
	int arr2[]= {23,44,54,99,1,24,33};
	
	for(int i=0;i<arr1.length;i++)
	{
		for(int j=0;j<arr2.length;j++)
		{
			int count=0;
			if(arr1[i]==arr2[j])
			{
				count++;
			}
			if(count>0)
			{
				System.out.println("Duplicate Elements--->"+" "+arr1[i]+" ");
			}
		}
	}

	}

}
