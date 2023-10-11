def remove_smallest(numbers):
    
    nb = numbers.copy()
    if len(numbers) == 0:
        return numbers
    else:
        nb.remove(min(nb))
        return nb
