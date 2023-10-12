def to_camel_case(text):
    

    for i in range(len(text)):
        if text[i-1] == "-" or text[i-1]=="_":
            text = text[:i] + text[i].upper() + text[i+1:]
    
    text = text.replace("-", ""). replace("_","")
    return text

