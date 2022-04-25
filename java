import java.io.*;
import java.util.*;
class  submatrix
{
static void subtraction(int a[][],int b[][],int n)
{
int c[][]=new int[n][n];
int i,j;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
c[i][j]=a[i][j]-b[i][j];
}
}
System.out.println("subtraction of two numbers");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(c[i][j]+"   ");
}
System.out.println();
}
}
public static void main(String args[])
{
int a[][],b[][];
int i,j,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter matrix size");
n=sc.nextInt();
a=new int[n][n];
b=new int[n][n];
System.out.println("enter A-matrix");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("enter B-matrix");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
b[i][j]=sc.nextInt();
}
}
subtraction(a,b,n);
}
}
