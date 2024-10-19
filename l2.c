#include <stdio.h>
#include <string.h>
int find(int p,int q);
int main()
{
	char A[1000100];
	int i,m,j,n,t=0;
	int s[110]={0};
	scanf("%d",&m);
	getchar();
	for(i=0;i<m;i++)
	{
		fgets(A,sizeof(A),stdin);
		j=0;
		for(;j<=strlen(A);)
		{
			for(n=0;(A[j]<='9'&&A[j]>='0')&&A[j]!='\n';j++)
			{
				n=n*10+A[j]-'0';
				if(A[j+1]==32||A[j+1]=='\n')
				{
					s[t]=n;
					t++;
				}
			}
			j++;
		}
	}
	int min,max;
	max=min=s[0];
	for(i=1;s[i]!=0;i++)
	{
		if(s[i]>max)max=s[i];
		if(s[i]<min)min=s[i];
	}
	for(min++;min<max;min++)
	{
		j=0;
		for(i=0;s[i]!=0;i++)
		{
			j+=find(min,s[i]);
		}
		if(j==0)printf("%d ",min);
		if(j==2)t=min;
	}
	printf("%d\n",t);
	return 0;
}


int find(int p,int q)
{
	if(p==q)return 1;
	else return 0;
}
