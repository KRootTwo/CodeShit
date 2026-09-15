import re

pattern = re.compile(r'\d{3}[.-]\d{3}[.-]\d{4}')

with open('data.txt', 'r') as f:
    content = f.read()

    matches = pattern.finditer(content)

    # print(f"{matches}")

    for m in matches:
        print(f"{m}\n")