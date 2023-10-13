#include <stdio.h>
#include <string.h>


int calculate_damage(const char *your_type, const char *opponent_type, int attack, int defense) {

    char* types[4] = {"fire", "water", "grass", "electric"};
    float fight_fire[] = {0.5, 0.5, 2.0, 1.0};
    float fight_water[] = {2.0, 0.5, 0.5, 0.5};
    float fight_grass[] = {0.5, 2.0, 0.5, 1.0};
    float fight_electric[] = {1.0, 2.0, 0.5, 0.5};
  
    int myType = -1, oppType = -1, damage=0;
    for(int i = 0; i < 4; i++){

        if(strcmp(types[i],your_type) == 0){    
            myType = i+1;
        }
        if(strcmp(types[i],opponent_type) == 0){
            oppType = i;
        }
    }
    switch (myType){

        case 1: 
          damage = 50*(attack/defense) * fight_fire[oppType]; 
          break;
        case 2: 
          damage = 50*(attack/defense) * fight_water[oppType];
          break;
        case 3:
          damage = 50*(attack/defense) * fight_grass[oppType];
          break;
        case 4:
          damage = 50*(attack/defense) * fight_electric[oppType];
          break;
    }
    return damage;
}

int main(){
    int test = calculate_damage("water", "water", 100, 100);
    printf("%d \n", test );
}