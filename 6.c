#include <stdio.h>
int main(){
	unsigned n,k,i,h;
	scanf("%u %u",&n,&k);
	i=0;
	h=n;
	for(;n/k!=0;){
		i=i+n/k;
		n=n/k+n%k;
	}
	printf("%u",h+i);
	return 0;
}
