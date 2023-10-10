def get_count(sentence):
    vowels = "aeiou"
    nb_vow = 0
    
    for c in sentence:
        if c in vowels:
            nb_vow+=1
    return nb_vow
