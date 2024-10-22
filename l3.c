#include <stdio.h>
int judge(int a,int A[9]);
//int change(int n,int A[9],int j,int i);
int main()
{
	int num,i,j,s,t=0;
	int a1=1,a2=1,a3=1,a4=1,a5=1,a6=1,a7=1,a8=1,a9=1;
	int A[9]/*={1,2,3,4,5,6,7,8,9}*/;
	scanf("%d",&num);
	for(;a1<=9;a1++)
	{
	for(;a2<=9;a2++)
	{
	if(a2!=a1)
	for(;a3<=9;a3++)
	{
	if(a3!=a1&&a3!=a2)
	for(;a4<=9;a4++)
	{
	if(a4!=a1&&a4!=a2&&a4!=a3)
	for(;a5<=9;a5++)
	{
	if(a5!=a1&&a5!=a2&&a5!=a3&&a5!=a4)
	for(;a6<=9;a6++)
	{
	if(a6!=a1&&a6!=a2&&a6!=a3&&a6!=a4&&a6!=a5)
	for(;a7<=9;a7++)
	{
	if(a7!=a1&&a7!=a2&&a7!=a3&&a7!=a4&&a7!=a5&&a7!=a6)
	for(;a8<=9;a8++)
	{
	if(a8!=a1&&a8!=a2&&a8!=a3&&a8!=a4&&a8!=a5&&a8!=a6&&a8!=a7)
	for(;a9<=9;a9++)
	{
	if(a9!=a1&&a9!=a2&&a9!=a3&&a9!=a4&&a9!=a5&&a9!=a6&&a9!=a7&&a9!=a8)
	{
	A[0]=a1,A[1]=a2,A[2]=a3,A[3]=a4,A[4]=a5,A[5]=a6,A[6]=a7,A[7]=a8,A[8]=a9;
	t+=judge(num,A);
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
	printf("%d",t);
	return 0;
}
/*int change(int n,int A[9],int j,int i)
{
	int t=0,s=0;
	if(i<9)
	{
		s=A[j];A[j]=A[i];A[i]=s;
		if(i==j&&j!=8)
		{
			i++;j++;
			t+=change(n,A,j,i);
			else if(j==8)
			{
				j--;
				t+=judge(n,A);
				s=A[j];A[j]=A[i];A[i]=s;
				j--;i--;
				t+=judge(n,A);
				t+=change(n,A,j,i);
			}
				else if(j<i&&i!=8)
				{
*/
int judge(int a,int A[9])
{
	int i,j,m=0,n=0,p=0,q,s,t=0;
	for(j=1;j<9;j++)
	{
		for(i=0;i<j;i++)
		{
			for(q=8;q>=j;q--)
			{
				p=p*10+A[q];
			}
			for(;i<j;j--)
			{
				n=n*10+A[j-1];
			}
			for(;i>=0;i--)
			{
				m=m*10+A[i];
			}
			if(n%p==0)
			{
				s=m+n/p;
				if(s==a)t++;
			}
		}
	}
	return t;
}
