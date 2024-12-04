#include<stdio.h>
#include<stdlib.h>
#include<string.h>
void DigiTran(int,char*);
int main()
{
    int k;
    char a[1000],b[1000]={'\0'},c[2]={32,0},t[1000]={'\0'};
//    char* a;
//    a=(char*)malloc(1000*sizeof(char));
    while(1)
    {
        scanf("%d",&k);
        if(k<0)
        break;
        strcpy(a,t);
        DigiTran(k,a);
        strcat(b,a);
        strcat(b,c);
    }
    printf("%s",b);
    return 0;
}
void DigiTran(int k,char a[])
{
    int A[100];
    int i=0,j=0;
    while(1)
    {
        if(k<10)
        {
            A[i]=k;
            break;
        }
        A[i]=k-k/10*10;
        i++;
        k/=10;
    }
    while(i>=0)
    {
        if(i>0&&(10*A[i]+A[i-1])<26)
        {
            a[j]='A'+10*A[i]+A[i-1];
            i--;
        }
        else
        a[j]='A'+A[i];
        j++;
        i--;
    }
}