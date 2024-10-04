#include <stdio.h>
int main(){
	unsigned n,k,i;
	scanf("%u %u",&n,&k);
	i=0;
	for(;n/k!=0;){
		i=i+n/k;
		n=n/k+n%k;
	}
	printf("%u",i);
	return 0;
}
