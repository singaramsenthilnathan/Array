public class StringLearn {
int price;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
StringLearn s1 = new StringLearn();
System.out.println("Hashcode of s1"+s1);
System.out.println(s1.hashCode());//integer value(int java.lang.Object.hashCode())
s1.price=100;
StringLearn s2 = new StringLearn();
System.out.println("Hashcode of s2"+s2);
System.out.println(s2.hashCode());
s2.price=150;
if(s1.equals(s2))
{
	System.out.println("Both are Equal");
}
else
{
	System.out.println("Not Equal");
}
}
public boolean equals(Object u) // static or non static method? 
{
StringLearn s = (StringLearn)u;
if(this.price == s.price)
return true; 
else   
return false; 
}
public int hashcode()
{
	return 123;
}
public String toString()
{
	return("HI");
}
}

