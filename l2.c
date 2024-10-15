#include <stdio.h>
#include <string.h>
int find(int p,int q);
int main()
{
	char A[1000100];
	int i,m,j=0,n=0,t=0;
	int a[110];
	scanf("%d",&m);
	for(i=0;i<m;i++)
	{
		fgets(A,sizeof(A),stdin);
		for(;A[j]=='\n';)
		{
			for(;A[j]<='9'&&A[j]>='0';)
			{
				n=n*10+A[j];
				j++;
			}
			a[t]=n;
			t++;
		}
	}
	int min,max;
	for(i=0;a[i]!=0;i++)
	{
		min=max=a[i];
		if(a[i]>max)max=a[i];
		if(a[i]<min)min=a[i];
	}
	for(min++;min<max;min++)
	{
		for(i=0;a[i]!=0;i++)
		{
			j+=find(min,a[i]);
		}
		if(j==0)printf("%d ",min);
		if(j==2)t=min;
	}
	printf("%d",t);
	return 0;
}


int find(int p,int q)
{
	if(p==q)return 1;
	else return 0;
}
