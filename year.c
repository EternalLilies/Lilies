#include <stdio.h>
int main(){
	int x;
	printf("请输入一个年份:\n");
	scanf("%d",&x);
	if(x%4==0&&x%400!=0)
		printf("%d是闰年\n",x);
	else
		printf("%d不是闰年\n",x);
	return 0;
}
