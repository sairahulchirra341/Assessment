6. How do you reverse words in a given sentence without using any library method?


def reverse_word(s,start,end):
    while start<end:
        s[start],s[end]=s[end],s[start]
        start=start+1
        end-=1
s=input("Enter any sentence:")
s=list(s)
start=0
while True:
    try:
        end=s.index(' ',start)
        reverse_word(s,start,end-1)
        start=end+1
    except ValueError:
        reverse_word(s,start,len(s)-1)
        break
s.reverse()
s="".join(s)
print(s)


Output:
Enter any sentence: I like to join

join to like I
