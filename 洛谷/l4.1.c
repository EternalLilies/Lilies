#include <stdio.h>
int count(int A[],int m,int n);
int main()
{
    int n,i;
    scanf("%d",&n);
    int A[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&A[i]);
    }
    int p,q,m=0;
    for(p=0;p<n;p++)
    {
        for(q=p;q<n;q++)
        {
            m+=count(A,p,q);
        }
    }
    printf("%d",m);
    return 0;
}
int count(int A[],int m,int n)
{
    int ma=A[m],mi=A[m],i,t;
    for(i=m;i<=n;i++)
    {
        mi=(A[i]<mi)?A[i]:mi;
        ma=(A[i]>ma)?A[i]:ma;
    }
    if(ma-mi==n-m)return 1;
    else return 0;
}