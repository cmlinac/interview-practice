make clean: 
	rm *.class 
	ls | grep -v "\." | grep -v "makefile" | xargs rm
