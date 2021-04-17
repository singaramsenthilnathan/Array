public class Mini1
{
public static void main(String[]args)
{
int u[] ={-1,-2,-9,-99,-33,-66,-5,-3,-9,-100};
int min = Integer.MAX_VALUE;
int position =0;
for(int i=0;i<u.length;i++)
{
if(min>u[i])
{
min=u[i];
position=i;
}
}
System.out.println(position+"th"+" Position"+" "+min+" "+"Value");
}
}