from sys import argv

script, fileName = argv

def fileRead(f):
	print f.read()

def file_rewind(f):
	f.seek(0)

def print_readLine(line_count,f):
	print line_count, f.readline()

source = open(fileName)

print "The content in the file %s" % fileName

fileRead(source)

print "Rewinding the file"

file_rewind(source)

print "Reading the file line by line\n\n"

line_count = 1

print_readLine( line_count , source)
print_readLine( line_count + 1 , source)
print_readLine( line_count + 1 , source)
print_readLine( line_count + 1 , source)
print_readLine( line_count + 1 , source)