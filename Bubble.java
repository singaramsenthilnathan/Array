public class Bubble
{
public static void main(String[]args)
{
int b[]={3,7,3,6,1,10,45,2,22};
for(int j=1;j<b.length;j++)
{
for(int i=0;i<b.length-j;i++)
{
if(b[i]>b[i+1])
{
	int temp=b[i];
	b[i]=b[i+1];
	b[i+1]=temp;
}
}
}
for(int i=0;i<b.length;i++)
{
	System.out.println(b[i]);
}
/*System.out.println(b[b.length-9]);
System.out.println(b[b.length-8]);
System.out.println(b[b.length-7]);
System.out.println(b[b.length-6]);
System.out.println(b[b.length-5]);
System.out.println(b[b.length-4]);
System.out.println(b[b.length-3]);
System.out.println(b[b.length-2]);
System.out.println(b[b.length-1]);*/
}
}