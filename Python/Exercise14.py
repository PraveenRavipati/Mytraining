from sys import argv

script, user_name = argv

print "Hi %s this is %s\'s script ' " % (script,user_name)

print "Please answer following questions"

age = raw_input("what is your age")

height = raw_input("what is your height")

print """Thanks for the information"""