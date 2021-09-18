#베스트셀러

test  = int(input())
dic = dict()
lst = []
for i in range(test):
    title = input()
    if title  not in dic:
        lst.append(title)
        dic[title] = 1
    else:
        dic[title] +=1

lst.sort()
most_book = lst[0]


for i in lst:
    if dic[i] > dic[most_book]:
        most_book = i
    #print(dic[i])

print(most_book)


