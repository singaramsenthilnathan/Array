public class Maxi
{
public static void main(String[]args)
{
int m[]={4,9,2,6,11,22,4,7,99,55};
int max=0;

for(int i=0;i<m.length;i++)
{
if(m[i]>max)
max=m[i];
}
System.out.println(max +" "+"Value");
}
}