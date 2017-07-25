from sys import argv

script, fileName = argv

txt = open(fileName)

print txt.read()

fileName = raw_input("Enter new file name \n> ")

txt = open(fileName)

print txt.read()