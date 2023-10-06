#include <stdio.h>
#include <stdlib.h>

long sum_two_smallest_numbers(size_t n, const int numbers[n]) {

    int small1 = numbers[0];
    int small2 = numbers[1];
    for (int i = 1; i < n; i++)
    {
        if (small1>numbers[i])
        {
            small2 = small1;
            small1 = numbers[i];
        }
        else if (small2 > numbers[i]){
        small2= numbers[i];
        }
    }
    return small1 + small2;

}

int main(){
    const int numbers[5] = {5, 8, 12, 19, 22};
    printf("%lu \n", sum_two_smallest_numbers(5,numbers));
}