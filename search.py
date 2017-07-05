#! /usr/bin/python
import sys
import time

def main():
	if len(sys.argv) != 3:
		print "<Usage> : %s <Input String> <Search char>" % sys.argv[0]
		sys.exit()
	myfunc(sys.argv[1], sys.argv[2], 0)

def myfunc(opt1, opt2, opt3):
	while opt1.find(opt2, opt3) != -1:
		print "find location! [index]:",
		print opt1.find(opt2, opt3)
		opt3 = opt1.find(opt2, opt3)+1
#		time.sleep(2)
#	while (opt3=opt1.find(opt2,opt3))!=-1:

if __name__ == '__main__':
	main()
