#include <stdio.h>
int main(){
	int n,m,p,q;
	q=1;
	scanf("%d",&n);
	int i[n][n];
	for(m=0;m<n;m++){
                for(p=0;p<n;p++){
			i[m][p]=0;
		}
	}
	m=0,p=0;
	for (;q<=n*n-1;){
		for(;;p++){
			i[m][p]=q;
			q++;
			if(p==n-1)break;
			if(i[m][p+1]!=0)break;
		}
		//q--;
		for(;;m++){
                        i[m][p]=q;
                        q++;
			if(m==n-1)break;
			if(i[m+1][p]!=0)break;
                }
		q--;
		for(;;p--){
                        i[m][p]=q;
                        q++;
			if(p==0)break;
			if(i[m][p-1]!=0)break;
                }
		q--;
		for(;;m--){
                        i[m][p]=q;
			q++;
			if(m==0)break;
			if(i[m-1][p]!=0)break;
                }
		q--;
	}
	for(m=0;m<n;m++){
		for(p=0;p<n;p++){
			printf("%-4d",i[m][p]);
		}
		printf("\n");
	}
	return 0;
}
