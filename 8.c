#include <stdio.h>
int main(){
	int m,l,a,b;
	scanf("%d %d",&m,&l);
	int i[m+1],j[l],k[l];
	for(a=0;a<l;a++){
		scanf("%d %d",&j[a],&k[a]);
	}
	for(a=0;a<=m;a++){
		i[a]=1;
	}
	for(a=0;a<l;a++){
		for(b=j[a];b<=k[a];b++){
			i[b]=0;
		}
	}
	b=0;
	for(a=0;a<=m;a++){
		b=b+i[a];
	}
	printf("%d",b);
	return 0;
}
