def add(a,b):
	print "ADDING %d + %d " % (a,b)
	return a + b

def sub(a,b):
	print "SUBSTRACT %d - %d " % (a,b)
	return a - b

def multiply(a,b):
	print "MULTIPLY %d * %d " % (a,b)
	return a * b

def divide(a,b):
	print "DIVIDE %d / %d " % (a,b)
	return a/b 

a = 50
b = 10

addition = add(a,b)
substraction = sub(a,b)
multiply = multiply(a,b)
divide = divide(a,b)

print "ADD :   %d SUB : %d   MUL : %d   DIV : %d   " % (addition,substraction,multiply,divide)