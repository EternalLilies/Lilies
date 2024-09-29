#include <stdio.h>
int main(){
	int a1,a2,a3,a4,a5,a6,a7,a8,a9,a0,b,i;
	scanf("%d %d %d %d %d %d %d %d %d %d\n",&a1,&a2,&a3,&a4,&a5,&a6,&a7,&a8,&a9,&a0);
	scanf("%d",&b);
	i=0;
	b=b+30;
	if(a1<=b)i++;
	if(a2<=b)i++;
	if(a3<=b)i++;
	if(a4<=b)i++;
	if(a5<=b)i++;
	if(a6<=b)i++;
	if(a7<=b)i++;
	if(a8<=b)i++;
	if(a8<=b)i++;
	if(a9<=b)i++;
	if(a0<=b)i++;
	printf("%d\n",i);
	return 0;
}
