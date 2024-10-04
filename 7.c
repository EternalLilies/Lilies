#include <stdio.h>
int main(){
	int m,n,p,q,t,i;
	i=0;
	scanf("%d",&t);
	for(m=10000;m<=30000;m++){
		n=m/100;
		p=(m-m/10000*10000)/10;
		q=m-m/1000*1000;
		if(n%t==0&&p%t==0&&q%t==0){
			printf("%d\n",m);
			i++;
		}
	}
	if(i==0)printf("No");
	return 0;
}
