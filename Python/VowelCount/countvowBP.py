
def getCount(inputStr):
    return sum(1 for let in inputStr if let in "aeiouAEIOU")