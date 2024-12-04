#include <stdio.h>
#include <stdlib.h>

typedef struct node{
    int num;
    struct node* next;
}node;

node* create(int num);
void dele(node*);

int main()
{
    int i,n,m,k=0;
    node* head=NULL;
    head=create(1);
    node* end=head;
    scanf("%d%d",&n,&m);
    for(i=1;i<n;i++)
    {
        end=end->next;
        end=create(i+1);
    }
    end->next=head;
    i=0;
    node* pr=head;
    while(k<n)
    {
        i++;
        if(i==m)
        {
            printf("%d ",pr->num);
            dele(pr);
            k++;
        }
    }
    return 0;
}

node* create(int n)
{
    node* new=(node*)malloc(sizeof(node));
    if(new==NULL)
    exit(1);
    new->num=n;
    new->next=NULL;
    return new;
}

void dele(node* a)
{
    node* s=a;
    a=a->next;
    free(s);
}