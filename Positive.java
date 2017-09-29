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
System.out.println("Negative");
}
else if(s>0)
{
System.out.println("Positive");
}
else
{
System.out.println("Zero");
}
}
}
