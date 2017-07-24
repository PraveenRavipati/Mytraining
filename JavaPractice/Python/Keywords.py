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

