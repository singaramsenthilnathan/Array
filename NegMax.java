public class NegMax
{
public static void main(String[]args)
{
int v[]={-100,-99,-66,-44,-800,-46,-5,-8,-4,-6};
int max = Integer.MIN_VALUE;
int position =0;
for(int i=0;i<v.length;i++)
{
if(max<v[i])
{
max = v[i];
position=i;
}
}
System.out.println(position+"th"+max+" "+"Value");
}
}