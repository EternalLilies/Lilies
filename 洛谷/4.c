#include <stdio.h>
int main(){
	int a1,a2,a3,a4,a5,a6,a7,b1,b2,b3,b4,b5,b6,b7,c,d;
	scanf("%d %d\n%d %d\n%d %d\n%d %d\n%d %d\n%d %d\n%d %d",&a1,&b1,&a2,&b2,&a3,&b3,&a4,&b4,&a5,&b5,&a6,&b6,&a7,&b7);
	c=a7+b7;
	d=7;
	if(c<a6+b6){c=a6+b6;d=6;}
	if(c<a5+b5){c=a5+b5;d=5;}
	if(c<a4+b4){c=a4+b4;d=4;}
	if(c<a3+b3){c=a3+b3;d=3;}
	if(c<a2+b2){c=a2+b2;d=2;}
	if(c<a1+b1){c=a1+b1;d=1;}
	if(c<8)d=0;
	printf("%d",d);
	return 0;
}
