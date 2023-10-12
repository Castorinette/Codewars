def disemvowel1(s):
    for i in "aeiouAEIOU": //change the original string 
        s = s.replace(i,'')
    return s

def disemvowel2(string):
    return "".join(c for c in string if c.lower() not in "aeiou") // returns a new string