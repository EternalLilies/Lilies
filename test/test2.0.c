#include<stdio.h>
int main()
{
    int n,i,j;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        for(int m=0;m<i;m++)
        printf(" ");
        for(j=0;j<n;j++)
        printf("*");
        printf("\n");
    }
    return 0;
}