#include <stdio.h>
int main(){
	int a,b,c,p,m,n;
	printf("请输入两个整数：\n");
	scanf("%d %d",&a,&b);
	m=a,n=b;
	p=a%b;
	while(p!=0)
		{
		a=b,b=p;
		p=a%b;
		}
	c=m*n/b;
	printf("%d和%d的最大公约数是%d\n",m,n,b);
	printf("%d和%d的最小公倍数是%d\n",m,n,c);
	return 0;
}
