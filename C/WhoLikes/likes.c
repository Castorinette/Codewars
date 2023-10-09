#include <stdlib.h>


char *likes(size_t n, const char *const names[n]) {

    char* like = malloc(sizeof(char)*100);
    
    if (n==0){
        sprintf(like, "no one likes this \0");
    }
    else if (n==1){
        sprintf(like,"%s like this \0", names[0]);
    }
    else if (n==2){
        sprintf(like, "%s and %s like this \0", names[0], names[1]);
    }
    else if (n==3){
        sprintf(like,"%s, %s and %s like this \0", names[0],names[1],names[2]);
    }
    else if (n>=4){
        sprintf(like, "%s, %s and 2 others like this \0", names[0], names[1]);
    }
    return like;
}