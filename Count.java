public class Count
{
public static void main(String[]args)
{
int a[]={10,3,4,5,10,5,3,10,4,2};
int freq[]=new int[a.length];
for(int j=0;j<a.length;j++)
{
int no=a[j];
int count=1;
for(int i=j+1;i<a.length;i++)
{
if(no==a[i])
{
count++;
freq[i] = -1;
}
}
//System.out.print(count+" ");
if(freq[j]!=-1)
freq[j]=count;
}
for(int j=0;j<a.length;j++)
{
//if(freq[j]<0)	
if(freq[j]>0)
System.out.println(a[j] +" "+ "Occurs " + freq[j] +" "+ "times");
}
System.out.println();
}

}

/* OUTPUT:
10 Occurs 3 times
3 Occurs 2 times
4 Occurs 2 times
5 Occurs 2 times
2 Occurs 1 times
*/
