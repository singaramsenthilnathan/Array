public class FsMax
{
public static void main(String[]args)
{
int v[]={10,20,30,22,56,88,12,9,77,32};
int max=0;
int smax=0;
for(int i=0;i<v.length;i++)
{
int no=v[i];//no=10 20  30
if(no>max)//10>0 20>10  30>20
{	
smax=max;//0 10  20
max=no;//10  20  30
}
else if(no>smax)
{
smax=no;
}
}
System.out.println("First Max Value is"+" "+max);
System.out.println("Second Max Value is"+" "+smax);

}
}