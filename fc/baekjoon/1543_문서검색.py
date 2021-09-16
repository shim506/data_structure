# 문서검색

doc = input()
find_doc = input()

idx =0
count = 0
while len(find_doc) <= len(doc) - idx:
   
    if find_doc  ==  doc[idx :idx+ len(find_doc)]:
        count += 1
        idx += len(find_doc)
    else:
        idx += 1
        
print(count)