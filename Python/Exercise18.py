def print_three(*agrs):
	arg1, arg2, arg3 = agrs
	print "arg1 : %r  arg2 : %r  arg3 : %r " % (arg1,arg2,arg3)

def print_threeAgain(arg1, arg2, arg3):
	print "arg1 : %r  arg2 : %r  arg3 : %r " % (arg1,arg2,arg3)

def print_two(*agrs):
	arg1, arg2 = agrs
	print "arg1 : %r  arg2 : %r " % (arg1,arg2)

def print_twoAgain(arg1, arg2):
	print "arg1 : %r  arg2 : %r " % (arg1,arg2)

def print_one(arg1):
	print "arg1 : %r " % arg1

def print_nothing():
	print "No arguments"



print_three("Praveen","srinivas","raghava")
print_threeAgain("Praveen","srinivas","raghava")
print_two("praveen","srinivas")
print_twoAgain("praveen","srinivas")
print_one("praveen")
print_nothing()
