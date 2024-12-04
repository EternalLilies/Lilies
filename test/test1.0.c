#include <stdio.h>
int main()
{
    int n,m;
    scanf("%d",&n);
    printf("%d=",n);
    for(m=2;m<=n;)
    {
        if(n%m==0&&n/m!=1)
        {
            n/=m;
            printf("%d*",m);
        }
        else if(n%m==0&&n/m==1)
        {
            n=1;
            printf("%d",m);
        }
        else
        m++;
    }
    return 0;
}