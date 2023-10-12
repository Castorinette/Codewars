def disemvowel(string):
    vowel = "aeiouAEIOU"
    new_string =""

    for c in string:
        if c not in vowel:
            new_string+=c
    return new_string


print(disemvowel("Bonjour, comment ça va?"))

