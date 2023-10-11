def remove_smallest(numbers):
    a = numbers[:]
    if a:
        a.remove(min(a))
    return a