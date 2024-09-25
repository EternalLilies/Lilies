#include <stdio.h>
unsigned long long factorial(int n);
unsigned long long combination(int s,int r){
	if (r>s){
		return 0;
	}
	if (r==0||r==s){
		return 1;
	}
	return factorial(s)/(factorial(r)*factorial(s-r));
}
unsigned long long factorial(int n){
	unsigned long long result=1;
	for(int i=2;i<=n;i++){
		result *=i;
	}
	return result;
}
int main(){
	int a,b,m,n;
	scanf("%d %d %d %d",&n,&m,&a,&b);
	unsigned long long p=combination(n+m,n);
	unsigned long long q;
	if((a<3&&b<3)||(a>n-3&&b>m-3)){
		q=0;
	}
	if(a>2&&b>2&&a<n-2&&b<m-2){
		q=p-combination((a+b-3),(a-2))*combination((n+m-a-b+3),(n-a+2))-combination((a+b-3),(a-1))*combination((n+m-a-b+3),(n-a+1))-combination((a+b-3),(a-3))*combination((n+m-a-b+2),(n-a+2))-combination((a+b-3),a)*combination((n+m-a-b+2),(n-a))-combination((a+b-2),(a-3))*combination((n+m-a-b+1),(n-a+2))-combination((a+b-2),(a+1))*combination((n+m-a-b+2),(n-a-1))-combination((a+b-1),(a-3))*combination((n+m-a-b-1),(n-a+1))-combination((a+b-1),(a+2))*combination((n+m-a-b-1),(n-a-2));
	}
	printf("%llu %llu\n",q,p);
	return 0;
}
