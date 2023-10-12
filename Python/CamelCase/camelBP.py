def to_camel_case(text):
    return text[:1] + text.title()[1:].replace('_', '').replace('-', '')