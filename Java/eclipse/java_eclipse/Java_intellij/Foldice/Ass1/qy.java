import java.util.Scanner;
public class qy{
public static void main (String [] args) {
Scanner siu=new Scanner(System.in);
System.out.print("Enter a number: ");
int n=siu.nextInt();
int s=0;
int i=n;
while(i>0){
int d=i%10;
s+=d;
i/=10;
}
if(s%9==0)
System.out.println(n+" is divisible by 9.");
else
System.out.println(n+" is not divisible by 9.");
}
}
