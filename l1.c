#include <stdio.h>
#include <string.h>
int main(){
	char A[1000],B[1000];
	int a[1000]={0};
	int i,t,m=0;
	scanf("%s%s",A,B);
	for(i=0;A[i]!='\0';i++){
		if(A[i]==B[i])continue;
		else a[i]=1;
	}
	for(i=0;i<strlen(A);){
		if(a[i]==1){
			t=i;
			i++;
			while(a[i]!=1){i++;}
			m+=i-t;
		}
		i++;
	}
	printf("%d",m);
	return 0;
}
