#include <stddef.h>
#include <limits.h>

long sum_two_smallest_numbers(size_t n, const int numbers[n])
{
    long small1 = INT_MAX, small2 = INT_MAX;
    for (int i = 0; i < n; i++)
    {
        if (numbers[i] < small1)
        {
            small2 = small1;
            small1 = numbers[i];
        } else if (numbers[i] < small2) small2 = numbers[i];
    }
    return small1 + small2;
}