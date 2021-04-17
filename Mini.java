public class Mini
{
public static void main(String[]args)
{
int m[]={4,9,24,6,11,22,4,7,99,55};
int min=m[0];
int position=0;

for(int i=1;i<m.length;i++)
{
if(m[i]<=min)
{
min=m[i];
position=i;
}
}
System.out.println(min +" "+position+"th"+" Value");
}
}
/* OUTPUT:

4 6th Value
*/