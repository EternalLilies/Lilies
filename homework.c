#include <stdio.h>
int main(){
	char shu;
	long long int i=0;
	int e=1,j=0;
	double t;
	for( ; ; ){
		scanf(" %c", &shu);
		if(shu==46)for(;;j++){
			scanf(" %c", &shu);
			if(shu<48||shu>57)break;
			i=shu-'0'+10*i;
		}
		if(shu<48||shu>57)break;
		i=shu-'0'+10*i;
	}
	for(;j>0;j--){
		e=10*e;
	}
	t=i;
	t=t/e;
	printf("%lf",t);
	return 0;
}
