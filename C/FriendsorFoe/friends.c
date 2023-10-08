#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void filter_friends (const char *names[])
{
    int len = 0;
    while(names[len]){
        len++;
    }
    int friends_len =0;

    for(int i = 0; i < len; i++){
        if (strlen(names[i])==4){
            if(friends_len!= i){
                names[friends_len] = names[i];
            }
            friends_len++;
        }
    }
    names[friends_len] = NULL;
}


int main(){
    const char* c[] = {"Marc", "I", "AM", "Sanjay", "Gupt", NULL};
    filter_friends(c);
    int i =0;
    while(c[i]){
        printf("%s \n", c[i]);
        i++;
    }
}