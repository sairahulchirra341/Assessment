1.How do you find the missing number in a given integer array of 1 to 100?

def getMissingNo(num_array):
    n = len(num_array)
    total = (n + 1)*(n + 2)/2
    sum_of_Array = sum(num_array)
    return total - sum_of_Array

num_array=list()
num=input("Enter size of array:")
for i in range(int(num)):
    n=input()
    num_array.append(int(n))
print("Array Elements:",num_array)
miss = int(getMissingNo(num_array))
print("Missing element:",miss)



Output:
Enter size of array:10
1
2
3
4
6
7
8
9
10
11
Array Elements: [1,2,3,4,6,7,8,9,10,11]
Missing element: 5
