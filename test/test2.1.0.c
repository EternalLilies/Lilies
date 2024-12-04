#include<stdio.h>
int main()
{
    int i=0,j=0,max;
    int A[3][5];
    for(i=0;i<3;i++)
    for(j=0;j<5;j++)
    scanf("%d",&A[i][j]);
    int m1[3],m2[5];
    for(i=0;i<3;i++)
    {
        m1[i]=A[i][0];
        for(j=0;j<5;j++)
        m1[i]=(m1[i]>A[i][j])?A[i][j]:m1[i];
    }
    for(i=0;i<5;i++)
    {
        m2[i]=A[0][i];
        for(j=0;j<3;j++)
        m2[i]=(m2[i]>A[j][i])?A[j][i]:m2[i];
    }
    max=m1[0];
    for(i=0;i<3;i++)
    max=(m1[i]>max)?m1[i]:max;
    for(i=0;i<5;i++)
    max=(m2[i]>max)?m2[i]:max;
    printf("%d",max);
    return 0;
}