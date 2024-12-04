#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<locale.h>
typedef struct{
    char number[12];
    char name[40];
    int score;
}student;
int main()
{
    student A[10];
    for(int i=0;i<10;i++)
    {
        printf("%d:",i+1);
        scanf("%s",&A[i].number);
        scanf("%s",&A[i].name);
        scanf("%d",&A[i].score);
        getchar();
    }
    student a;
    for(int i=0,j=0;i<10;i++)
    for(j=i;j<10;j++)
    if(memcmp(A[i].number,A[j].number,12*sizeof(char))>0)
    {
        a=A[i];
        A[i]=A[j];
        A[j]=a;
    }
    printf("Number\tName\tScore\n\r");
    for(int i=0;i<10;i++)
    printf("%s\t%s\t%d\n\r",A[i].number,A[i].name,A[i].score);
    printf("The number:");
    scanf("%s",a.number);
//    getchar();
    for(int i=0;i<10;i++)
    if (memcmp(A[i].number,a.number,strlen(A[i].number))==0)
    printf("The score is %d\n",A[i].score);
    int sum=0;
    for(int i=0;i<10;i++)
    sum+=A[i].score;
    printf("The pei-score is %f\n",((float)sum)/10);
    a=A[0];
    for(int i=0;i<10;i++)
    a=(A[i].score>a.score)?A[i]:a;
    printf("Max is %s(%s), his score is %d\n",a.name,a.number,a.score);
    return 0;
}
