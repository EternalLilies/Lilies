#include <stdio.h>
int main(){
	int i,a,b;
	int j[12];
	for(i=0;i<12;i++){
		scanf("%d",&j[i]);
	}
	a=0;
	b=0;
	for(i=0;;i++){
		a=a+300;
		a=a-j[i];
		if(a<0){
			printf("-%d",i+1);
			break;
		}
		b=b+a/100;
		a=a%100;
		if(i==11){
			printf("%d",a+120*b);
			break;
		}
	}
	return 0;
}
