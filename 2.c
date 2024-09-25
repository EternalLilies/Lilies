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
	unsigned long long q,p1,p2,p3,p4,p5,p6,p7,p8,p9,p0;
	p1=combination((n+m-a-b-3),(n-a));
	p2=combination((n+m-a-b-3),(n-a-3));
	p3=combination((a+b-3),(a-3));
	p4=combination((a+b-3),a);
	if((a==2&&b==2)||(a==n-2&&b==m-2)||(a==0&&b==0)||(a==n&&b==m)||(a*b==2)||((a==n-1||a==n+1)&&(b==m+2||b==m-2))||((a==n+2||a==n-2)&&(b==m-1||b==m+1))||(a==n+1&&b==m+1)){
		q=0;
	}
	if((a==1&&b==1)||(a==n-1&&b==m-1)){
		q=p1+p2+p3+p4;
	}
	if((a==1&&b==0)||(a==2&&b==0)||((a==n-1||a==n-2||a==n+1||a==n+2)&&b==m)||(a==n-1&&b==m+1)){
		q=p1+p4;
	}
	if((a==0&&b==2)||(a==0&&b==1)||(a==n&&(b==m-2||b==m-1||b==m+1||b==m+2))||(a==n+1&&b==m-1)){
		q=p2+p3;
	}
	if((a>2||b>2)&&(a<n-2||b<m-2)){
		p1=combination((a+b-3),(a-2))*combination((n+m-a-b+3),(n-a+2));
		p2=combination((a+b-3),(a-1))*combination((n+m-a-b+3),(n-a+1));
		p3=combination((a+b-3),(a-3))*combination((n+m-a-b+2),(n-a+2));
		p4=combination((a+b-3),a)*combination((n+m-a-b+2),(n-a));
		p5=combination((a+b-2),(a-3))*combination((n+m-a-b+1),(n-a+2));
		p6=combination((a+b-2),(a+1))*combination((n+m-a-b+1),(n-a-1));
		p7=combination((a+b-1),(a-3))*combination((n+m-a-b-1),(n-a+1));
		p8=combination((a+b-1),(a+2))*combination((n+m-a-b-1),(n-a-2));
		p9=combination((a+b-3),(a-3))*combination((n+m-a-b-3),n-a);
		p0=combination((a+b-3),a)*combination((n+m-a-b-3),(n-a-3));
		q=p-p1-p2-p3-p4-p5-p6-p7-p8+p9+p0;
	}
	if(a>n+2||b>m+2||(a==n+2&&b==m+2)){
		q=p;
	}
	printf("%llu\n",q);
	return 0;
}
