import re


text = '''Here are some course codes: CS101, MA202, PH303.
        Note that CS202 & AB100 are valid, but not CS1010 or MA20.'''

pat = re.compile(r'\b[a-zA-Z]{2}\d{3}\b')

print(f"{pat.findall(text)}")

text = '''Here are some email addresses:
- avani-lekhara@soa.ac.in
- nitesh.kumar@gmail.com
- sumit_antil@yahoo.com
- HarvinderSingh@domain.org
- Dharabir@domain
- Praveen+Kumar@rediff.mail
- Navdeep@Singh.in'''

# pat = re.compile(r'\b[a-zA-Z0-9.-_+]+@[a-zA-Z0-9.-]+\.?[a-z]*\.?[a-z]*\b')

# print(f"{pat.findall(text)}")

# pat = r'[a-zA-Z0-9.%+=]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}'

# email_ids = re.findall(pat, text)

pat = r'[a-zA-Z0-9.%+=]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}'

print(f"{re.findall(pat, text)}")


name = '''Manoranjan Parhi, Ashis Pati, Debashis Pandit, Meenakshi Padhi, Modi patri, Naveen Panda, Mohan Pahi'''

pat = r'\b[\w\s]*P\w*i\b'

# print(f"{re.findall(pat, name)}")



mat = re.search('India', 'I love my India')
print(f"{mat}")








# pat = r'\b[\w*\s]*P\w*i\b'