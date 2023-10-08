#include <stdio.h>
#include <stddef.h>
#include <string.h>

void filter_friendsBP1(const char *names[])
{
    size_t i = 0, j = 0;
    while (names[i])
    {
        if (strlen(names[i]) == 4)
        {
            names[j] = names[i];
            j++;
        }
        i++;
    }
    names[j] = NULL;
}


#include <string.h>
void filter_friendsBP2 (const char *names[])
{
  // names[] is NULL-terminated, mutate it
  // You must re-use the pointers in 'names', do not allocate memory
  // Do not forget to NULL-terminate 'names'
  
  
  int i = 0;
    while (names[i]) {
        if (strlen(names[i]) != 4) {
          
            int j = i;
            while (names[j] != NULL) {
                names[j] = names[j + 1];
                j++;
            }
        } else {
            i++;
        }
      
    }
  
}