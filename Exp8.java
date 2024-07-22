import java.lang.*;
public class Exp8
{
public int sum(int x,int y)
{
return(x+y);
}
public int sum(int x,int y,int z)
{
return(x+y+z);
}
public double sum(double x,double y)
{
return(x+y);
}
public static void main(string[]args)
{
Exp8 s=new Exp8();
system.out.println(s.sum(10,20));
system.out.println(s.sum(10,20,30));
system.out.println(s.sum(10.5,20.5));
}
}