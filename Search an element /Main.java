n = int(input())
arr = input().split() 
x = str(input())

if (x in arr):
  print("index = " + str(arr.index(str(x))))
else:
  print('-1')