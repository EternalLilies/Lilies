#include <stdio.h>
int main()
{
    int n,k=0,m=0,t=0,s;
    scanf("%d%d",&n,&s);
    int A[n];
    for(int i=0;i<n;i++)
    A[i]=i+1;
    while(k<n-1)
    {
        if(m==n)
        {
            m=0;
        }
        else if(A[m]==0)
        {
            m++;
        }
        else
        {
            t++;
            if(t==s)
            {
                printf("%d ",A[m]);
                k++;
                A[m]=0;
                t=0;
            }
            m++;
        }
    }
    for(int i=0;i<n;i++)
    if(A[i]!=0)
    printf("\n%d",A[i]);
    return 0;
}