make clean: 
	ls | grep -v "\." | grep -v "makefile" | xargs rm