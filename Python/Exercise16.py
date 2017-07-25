from sys import argv

script, filename = argv

print "We are deleting all content in this file"

target = open(filename,'w')

target.truncate()

print "please enter five lines line to enter"

line1 = raw_input("Line 1 > ")
line2 = raw_input("Line 2 > ")
line3 = raw_input("Line 3 > ")
line4 = raw_input("Line 4 > ")
line5 = raw_input("Line 5 > ")

print "Now Im writing these lines"

target.write(line1)
target.write("\n")
target.write(line2)
target.write("\n")
target.write(line3)
target.write("\n")
target.write(line4)
target.write("\n")
target.write(line5)

print "Closing the file"

target.close()