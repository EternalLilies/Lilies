#include <stdio.h>
int main()
{
    int n,nu=0;
    scanf("%d",&n);
    if (n==1)printf("1");
    else
    {
        int A[n];
        for(int num=0;num<n;num++)
        {
            scanf("%d",&A[num]);
        }
        int i,j;
        int mi,ma;
        for(i=0;i<n;i++)
        {
            mi=ma=A[i];
            for(j=i;j<n;j++)
            {
                mi=(A[j]<mi)?A[j]:mi;
                ma=(A[j]>ma)?A[j]:ma;
                nu+=(j-i==ma-mi)?1:0;
            }
        }
    }
    printf("%d",nu);
    return 0;
}