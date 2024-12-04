#include <stdio.h>
#include <stdlib.h>

typedef struct node{
    int num;
    struct node* next;
}node;

node* create(int num);
void add(node*,int,int);
int pri(node*,int);
void dele(node**,int);

int main()
{
    int n,k,m,j,i=0,t=0;
    node* head=NULL;
    head=create(1);
    scanf("%d",&n);
    int A[n];
    for(;n>0;n--)
    {
        scanf("%d",&k);
        switch(k)
        {
            case 1:
                scanf("%d%d",&m,&j);
                add(head,m,j);
                break;
            case 2:
                scanf("%d",&m);
                A[i]=pri(head,m);
                i++;
                t++;
                break;
            case 3:
                scanf("%d",&m);
                dele(&head,m);
                break;
        }
    }
    node* a;
    while(head!=NULL)
    {
        a=head;
        head=head->next;
        free(a);
    }
    for(i=0;i<t;i++)
    printf("%d\n",A[i]);
    return 0;
}

node* create(int num)
{
    node* new=(node*)malloc(sizeof(node));
    if(new==NULL)
    exit(1);
    new->num=num;
    new->next=NULL;
    return new;
}

void add(node* head, int x, int y)
{
    node* a=head;
    while(a!=NULL)
    {
        if(a->num==x)
        {
            node* new=create(y);
            new->next=a->next;
            a->next=new;
        }
        a=a->next;
    }
}

int pri(node* head,int x)
{
    node* a=head;
    while(a!=NULL)
    {
        if(a->num==x)
        {
            if(a->next!=NULL)
            return a->next->num;
            else
            return 0;
        }
        a=a->next;
    }
}

void dele(node** head,int x)
{
     node *a=*head,*pre=NULL;
    while(a!=NULL)
    {
        if(a->num==x)
        {
            if(a->next!=NULL)
            {
                pre=a->next;
                a->next=pre->next;
                free(pre);
            }
        }
        pre=a;
        a=a->next;
    }
}