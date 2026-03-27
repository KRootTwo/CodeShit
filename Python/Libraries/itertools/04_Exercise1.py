class Sentence :

    def __init__(self, sentence) :
        self.sentence = sentence
        self.index = 0
        self.words = self.sentence.split()

    def __iter__(self) :
        return self

    def __next__(self) :
        if self.index >= len(self.words) :
            raise StopIteration
        i = self.index
        self.index += 1
        return self.words[i]


# def stringiter(s) :
#     a = list(s.split())
#     index = 0
#     while  (index < len(s)) :
#         yield a[index]
#         index += 1

def stringiter(s) :
    for i in s.split() :
        yield i

msi = Sentence("Sup Fuck Nigga")
msj = stringiter("Sup Fuck Nigga")

for i in msj :
    print (i)
