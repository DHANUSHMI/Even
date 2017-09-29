import java.io.*;
import java.util.*;
class Positive
{
public static void main(String args[]);
{
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
if(s<0)
{
System.out.print("Negative");
}
else if(s>0)
{
System.out.print("Positive");
}
else
{
System.out.print("Zero");
}
}
}
