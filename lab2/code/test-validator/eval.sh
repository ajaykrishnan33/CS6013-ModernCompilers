#!/bin/bash
ROOT=$(pwd)
cd $ROOT/BuritoJavaParser
javac Main.java
cd $ROOT
for FILE in $(ls inputs)
do
	echo -e "\n***Validating Testcase: $FILE"
	TEST=$1
	
	cd $ROOT/BuritoJavaParser
	OUT=$(java P2 < ../inputs/$FILE 2> /dev/null)
	ERR=$(java Main < ../inputs/$FILE)
	if [ "$OUT" == "Program parsed successfully" ]
	then
		echo -e "Testcase passed.\n"
	else
		echo -e "Testcase is not a BuritoJava program. Parsing error message: \n $ERR\n"
	fi
done
