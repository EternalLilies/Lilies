#include <stdio.h>
int same(int n,int A[],int b);
int main()
{
   int a,b,i,j;
   scanf("%d",&a);
   int A[a];
   for(i=0;i<a;i++)
   {
      scanf("%d",&A[i]);
   }
   scanf("%d",&b);
   int B[a+b];
   for(i=0;i<b;i++)
   {
      scanf("%d",&B[i]);
   }
   for(i=0,j=b;i<a;i++)
   {
      if(same(A[i],B,b))B[j]=A[i],j++;
   }
   printf("%d",B[--j]);
   for(j--;j>=b;j--)
   {
      printf(" %d",B[j]);
   }
   return 0;
}
int same(int n,int A[],int b)
{
   for(int i=0;i<b;i++)
   {
      if(n==A[i])return 1;
   }
   return 0;
}