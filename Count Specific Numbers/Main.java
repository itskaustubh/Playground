
m = str(input())
n = str(input())

xm = int(m)
xn = int(n)

def CountSpecificNumbers(xm,xn):
  
  if (int(xm) > int(xn)):
  	return -1
  
  count = 0
  xlist = [2,3,5,6,7,8,0]
  for xi in range(xm,xn+1):
    i = str(xi)
    flag = 0
    for yi in range(len(xlist)):
      if str(xlist[yi]) in i:
        flag = 1
        break
    if flag == 0:
      count += 1

  return (count)

print(CountSpecificNumbers(xm,xn))
  
  

