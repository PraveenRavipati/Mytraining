from sys import argv
from os.path import exists

script, from_name, to_name = argv

source = open(from_name)

text = source.read()


print "The source file is %s and destination file %s" % (from_name,to_name)
print "Is destinamtion file exist : %r" % exists(to_name)

dest = open(to_name, 'w')

dest.write(text)

source.close()
dest.close()