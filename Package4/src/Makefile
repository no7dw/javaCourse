target: 
	javac ./package1/A.java -d ../classes
	javac ./package2/B.java -d ../classes
	javac ./package3/C.java -d ../classes
	javac ./main/Test.java  -d ../classes/main/ -classpath ../classes
run:
	java -classpath ../classes/main:../classes Test
clean:
	rm -rf ../classes/package1/*.class
	rm -rf ../classes/package2/*.class
	rm -rf ../classes/package3/*.class
	rm -rf ../classes/main/*.class
.PHONY: target run clean
