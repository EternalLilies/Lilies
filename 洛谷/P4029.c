#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define FINALL "A0B0C0D0E0F0G0H0I0J0K0L0M0N0O0P0Q0R0S0T0U0V0W0X0Y0Z0"
void case0(void);
void case1(void);
void case2(void);
void case3(void);
void core(int);
void add(char*,char*);
void del(char*,char*);
void pri(char*);
int main()
{
    int n,c;
    scanf("%d%d",&n,&c);
    getchar();
//    putchar('E');
    for(int i=0;i<n;i++)
    core(c);
//    putchar('e');
    return 0;
}

void core(int c)
{
    char A[640],B[54];
    strcpy(B,FINALL);
    fgets(A,sizeof(A),stdin);
/*    switch(c)
    {
        case 0:
        case0();
        break;
        case 1:
        case1();
        break;
        case 2:
        case2();
        break;
        case 3:
        case3();
        break;
    }
*/    char* pre=&A[0],*pa=&A[0];
    char* LEFT[6],*RIGHT[6];
    int x=0,i=0,j=0;
    for(;*pre!='\n';pre++)
    {
        if(*pre=='+'||*pre=='=')
        {
            LEFT[i]=(char*)malloc(54*sizeof(char));
            LEFT[i]=pa;
            i++;
            pa=pre;
            pa++;
        }
        if(*pre=='=')
        break;
        if(*pre=='?')
        {
            x++;
            pa+=2;
        }
    }
//    putchar('e');
    for(;*pre!='\n';pre++)
    {
//        putchar('H');
        if(*pre=='Z')
        {
//            putchar('H');
            RIGHT[j]=(char*)malloc(54*sizeof(char));
            RIGHT[j]=pa;
            j++;
            pre++;
            pa=pre;
            pa+=2;
        }
        if(*pre=='?')
        pa+=2;
    }
//    putchar('k');
    if(x==0)
    {
        for(;i>0;i--)
        {
            add(B,LEFT[i-1]);
            free(LEFT[i-1]);
        }
        for(;j>0;j--)
        {
            del(B,RIGHT[j-1]);
            free(RIGHT[j]);
        }
    }
    else
    {
        for(;j>0;j--)
        add(B,RIGHT[j-1]);
        for(;i>0;i--)
        del(B,LEFT[i-1]);
    }
//    putchar('j');
    pri(B);
}

void case0(void)
{

}

void case1(void)
{

}

void case2(void)
{

}

void case3(void)
{

}

void add(char* a1,char* a2)
{
    char *a0;
    a0=a1;
//    putchar('a');
    a1++,a2++;
    *a1+=*a2-'0';
    if(!(*a1>='0'&&*a1<='9'))
    *a0='E';
    for(int i=0;i<25;i++)
    {
        a1++,a2++;
        a1++,a2++;
        *a1+=*a2-'0';
        if(!(*a1>='0'&&*a1<='9'))
        *a0='E';
    }
}

void del(char* a1,char* a2)
{
    char *a0;
    a0=a1;
    a1++,a2++;
    *a1-=*a2-'0';
    if(!(*a1>='0'&&*a1<='9'))
    *a0='E';
    for(int i=0;i<26;i++)
    {
        a1++,a2++;
        a1++,a2++;
        *a1-=*a2-'0';
        if(!(*a1>='0'&&*a1<='9'))
        *a0='E';
    }
}

void pri(char* re)
{
    if(*re=='A')
    while(*re!='\0')
    {
        if(*(re+1)=='0')
        re+=2;
        else if(*(re+1)=='1')
        {
            putchar(*re);
            re+=2;
        }
            else
            {
                putchar(*re);
                re++;
                putchar(*re);
                re++;
            }
    }
    else
    puts("No Solution");
//    putchar('p');
}