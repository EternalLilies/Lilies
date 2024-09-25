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
	unsigned long long q,p1,p2,p3,p4,p5,p6,p7,p8;
	if((a<3&&b<3)||(a>n-3&&b>m-3)){
		q=0;
	}
	else{
		p1=combination((a+b-3),(a-2))*combination((n+m-a-b+3),(n-a+2));
		p2=combination((a+b-3),(a-1))*combination((n+m-a-b+3),(n-a+1));
		p3=combination((a+b-3),(a-3))*combination((n+m-a-b+2),(n-a+2));
		p4=combination((a+b-3),a)*combination((n+m-a-b+2),(n-a));
		p5=combination((a+b-2),(a-3))*combination((n+m-a-b+1),(n-a+2));
		p6=combination((a+b-2),(a+1))*combination((n+m-a-b+1),(n-a-1));
		p7=combination((a+b-1),(a-3))*combination((n+m-a-b-1),(n-a+1));
		p8=combination((a+b-1),(a+2))*combination((n+m-a-b-1),(n-a-2));
		q=p-p1-p2-p3-p4-p5-p6-p7-p8;
	}
	printf("%llu\n",q);
	return 0;
}
