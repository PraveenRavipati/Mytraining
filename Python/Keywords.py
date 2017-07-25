import keyword
print(keyword.kwlist)
print('------------------------------------------------')

print("Funtion without argument")

def sum_function():
	a = 1
	b = 2
	c = a + b

x = sum_function()

print(x)

print('-------------------------------------------------')

print("Funtion with arguments")

def sum_function(a,b):
	return a + b

x = sum_function(2,3)

print(x)

print('------------------------------------------------')


def isEven(a):
	return a%2 == 0

x = isEven(5)

print(x)

x = isEven(10)

print(x) #this is even number

#print "This is also a way"