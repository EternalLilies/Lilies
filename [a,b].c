#include <stdio.h>
int main(){
	int a,b,c,p,m,n;
	printf("请输入两个整数：\n");
	scanf("%d %d",&a,&b);
	m=a,n=b;
	if (a<b)
		c=b,b=a,a=c;
	p=a%b;
	while(p!=0)
		{
		a=b,b=p;
		p=a%b;
		}
	printf("%d和%d的最大公约数是%d\n",m,n,b);
	return 0;
}