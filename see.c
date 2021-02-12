 arry ii#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#define SIZE 10
//Define variables
char board_player1[SIZE][SIZE];
char board_player2[SIZE][SIZE];
int *ship_5_player1[21];
int *ship_3_1_player1[15];
int *ship_3_2_player1[15];
int *ship_2_1_player1[12];
int *ship_2_2_player1[12];
int *ship_2_3_player1[12];
int *ship_1_1_player1[9];
int *ship_1_2_player1[9];
int *ship_1_3_player1[9];
int *ship_1_4_player1[9];
int *ship_5_player2[21];
int *ship_3_1_player2[15];
int *ship_3_2_player2[15];
int *ship_2_1_player2[12];
int *ship_2_2_player2[12];
int *ship_2_3_player2[12];
int *ship_1_1_player2[9];
int *ship_1_2_player2[9];
int *ship_1_3_player2[9];
int *ship_1_4_player2[9];
struct node
{
    int  ship;
    struct  Node*next;
};
struct number 
  {
      int size;
      
  };



---------------------------------------
//Define functions
void draw();
int Menu();
void create_ship(struct node **head,int a,int n,int size);
void deleteNode(struct node** head_ref, int key);
void Initialization_vertically(int **array, int length,int h,int size)
void Initialization_horizontally(int **array, int length,int h,int size)
int main()
{
    struct Node *player_1 = NULL;
    struct Node *player_2 = NULL;
    struct number p15={5},p25={5};
    struct number p131={3},p231={3};
    struct number p132={3},p232={3};
    struct number p121={2},p221={2};
    struct number p122={2},p222={2};
    struct number p123={2},p223={2};
    struct number p111={1},p211={1};
    struct number p112={1},p212={1};
    struct number p113={1},p213={1};
    struct number p114={1},p214={1}; 
    int Selection=Menu();
    switch (Selection)
     {
      case 1:
          {
               int n,m,p,q;
               printf("first player\n");
               printf("\nchoice user\n1.choice from available users\n2.new user");
               scanf("%d",&n);
              if(n==1)
              {
        
              }
             else if(n==2)
             {
        
             }
             printf("put ship\n");
             printf("1.auto\n2.Manual");
             scanf("%d",&m);
              if(m==2)
              {
                  printf("your map\n")
                  draw();
                  printf()
              }
             else if(m==1)
             {
        
             }
             printf("second player\n");
               printf("\nchoice user\n1.choice from available users\n2.new user");
               scanf("%d",&q);
              if(q==1)
              {
        
              }
             else if(q==2)
             {
        
             }
             printf("put ship\n");
             printf("1.auto\n2.Manual");
             scanf("%d",&p);
              if(p==2)
              {
                  
              }
             else if(p==1)
             {
        
             }
             
                break;
          }
       case 2:
          {
                break;
          }
       case 3:
        {
                break;
        }
       case 4:
{
                 break;
}
case 5:
{
break;
}
case 6:
{
break;
}
case 7:
{
break;
} 
}
 

}
int Menu()
{
    int n;
    printf("Welcome to battleships :)");
    printf("\nChoose an option:");
    printf("\n1.play with a friend\n2.play with bot\n3.load game\n4.load lsat game");
    printf("5.settings\n6.socer board\n7.exit");
    scanf("%d",&n);
    return  n;
}
void draw()
{
    int t=1;
    for (int i = 0; i < SIZE; i++)
    {
        for (int j = 0; j < SIZE; j++)
        {
            board[i][j] = t;
            t++;
        }
    }
    // row names display
    printf("   ");
    for (int i = 0; i < SIZE; i++)
    {
        printf(" %c  ", i+65);
    }
    printf("\n");

    // board display
    for (int i = 0; i < SIZE; ++i)
    {
        // column names display
        printf(" %i  ",i);
        for (int j = 0; j < SIZE; j++)
        {
            printf("%-3d ", board[i][j]);
        }
        printf("\n");
    }
}
void create_ship(struct node **head,int a,int n,int size)
{
     
    struct node *temp, *rear;
 if (n==1)
    {
        for (int i = 0; i <size ; ++i)
        {
        temp = (struct node *)malloc(sizeof(struct node));
        temp->ship = a;
        temp->next = NULL;
        if (*head == NULL)
        {
            *head = temp;
        }
        else
        {
            rear->next = temp;
        }
        rear = temp;
          
          a++;   
        }
    }
    else if(n==2)
    {
        for (int i = 0; i <size ; ++i)
        {
        temp = (struct node *)malloc(sizeof(struct node));
        temp->ship = a;
        temp->next = NULL;
        if (*head == NULL)
        {
            *head = temp;
        }
        else
        {
            rear->next = temp;
        }
        rear = temp;
          
          a+=10;   
        }
    }
     
}
void deleteNode(struct node** head_ref, int key)
{ 
    struct node *temp = *head_ref, *prev;
    if (temp != NULL && temp->ship == key) {
        *head_ref = temp->next; 
        free(temp);  
        return;
    }
    while (temp != NULL && temp->ship != key) {
        prev = temp;
        temp = temp->next;
    }
    if (temp == NULL)
        return;
    prev->next = temp->next;
    free(temp);  
}
void Initialization_horizontally(int **array, int length,int h,int size)
{
    int a,b,t;
    *array = (int *) malloc(length * sizeof(int));
    if (*array == NULL)
        h--;
        a=h-10;
        b=h+10;
        if (length==1)
        {
            t=5;
        } else if (length==2)
        {
            t=6;
        } else if (length==3)
        {
            t=7;
        } else if (length==5)
        {
            t=9;
        }
        for (int i = 0 ; i <(length+2) ,a>0,a>100 ; i++)
        {
            if (a%10!=0)
            {
                (*array)[i] = a;
            } else
                {
                    (*array)[i] = 0;
            }
            a++;
        }
        for (int i = length+2 ; i < (length+t)  ,h>0,h>100; i++)
        {if (h%10!=0)
            {
                (*array)[i] = h;
            } else
            {
                (*array)[i] = 0;
            }

            h++;
        }

        for (int i =length+t ; i <size  ,b>0,b>100; i++)
        {
            if (b%10!=0)
            {
                (*array)[i] = b;
            } else
            {
                (*array)[i] = 0;
            }
            b++;
        }
}
void Initialization_vertically(int **array, int length,int h,int size)
{
    int a,b,t;
    *array =(int *) malloc(((length+2)*3)* sizeof(int));
    if (*array == NULL)
        return;
    h-=10;
    a=h--;
    b=h++;
    if (length==1)
    {
        t=5;
    } else if (length==2)
    {
        t=6;
    } else if (length==3)
    {
        t=7;
    } else if (length==5)
    {
        t=9;
    }

    if(a%10==0 && a<1)
    {
        for (int i = 0 ; i <(length+2) , a<=100; i++)
        {
            (*array)[i] = a;
            a=0;
        }

        for (int i = length+2 ; i < (length+t), h<=100 ; i++)
        {
            (*array)[i] = h;
            h+=10;
        }

        for (int i =length+t ; i <size , b<=100 ; i++)
        {
            (*array)[i] = b;
            b+=10;
        }


    }
    else if(b%11==0)
    {
        for (int i = 0 ; i <(length+2) , a<=100; i++)
        {
            (*array)[i] = a;
            a+=10;
        }

        for (int i = length+2 ; i < (length+t) , h<=100 ; i++)
        {
            (*array)[i] = h;
            h+=10;
        }

        for (int i =length+t ; i <size , b<=100; i++)
        {
            (*array)[i] = b;
            b=0;
        }

    } else
    {
            for (int i = 0 ; i <(length+2) , a<=100 ; i++)
            {
                (*array)[i] = a;
                a+=10;
            }

            for (int i = length+2 ; i < (length+t) , a<=100 ; i++)
            {
                (*array)[i] = h;
                h+=10;
            }
            for (int i =length+t ; i <size, a<=100 ; i++)
            {
                (*array)[i] = b;
                b+=10;
            }
    }
}
int get_ship(int a,int size)
{
    size--;
    int start,end,g;
    if(a==1)
    {
        for( ; ; )
        {
            do {
                printf("Coordinates of the start of The first ship of length 3:\n");
                scanf("%d", &start);
                printf("Coordinates of the end of The first ship of length 3:\n");
                scanf("%d", &end);
                if (end!= (start + size))
                {
                    printf("The coordinates of the last point are incorrect!!\n");
                }
            } while (end!= (start + size));
            if((g=check(bord_player1_check,start))==1)
            {
                return start;
                break;
            }
            else{printf("You can not place the ship in this place:( Please try again\n");}
        }
    } else if (a==2)
    {
        for( ; ; )
        {
            do {
                printf("Coordinates of the start of The first ship of length 3:\n");
                scanf("%d", &start);
                printf("Coordinates of the end of The first ship of length 3:\n");
                scanf("%d", &end);
                if (end!= (start +size*10)
                {
                    printf("The coordinates of the last point are incorrect!!\n");
                }
            } while (end!= (start+ size*10));
            if((g=check(bord_player1_check,start))==1)
            {
                return start;
                break;
            }
            else{printf("You can not place the ship in this place:( Please try again\n");}
        }
    }
}


}
