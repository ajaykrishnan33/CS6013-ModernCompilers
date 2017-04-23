DIR=$(pwd)

echo -e "\n\nCompiling P2.java\n\n"
cd $DIR/BuritoJavaParser
javac P2.java

cd $DIR/results

echo -e "\n\nClearing old results\n\n"
sudo find . -type f -name '*.class' -exec rm {} \;
sudo rm $DIR/results/inputs/values/*
sudo rm -rf $DIR/results/outputs/programs/*
sudo rm $DIR/results/outputs/values/*

# expects folder name as parameter
function compile_and_run_burito_java {
	cd $DIR/results/inputs/programs/$1/T2
	echo $1
	for prog in $(ls *.java)
	do
		echo $prog
		javac $prog
		class=$(echo $prog|cut -f1 -d.)
		java $class > $DIR/results/inputs/values/$class
	done
	echo -e "\n\n"
}

# expects folder name as parameter
function translate_to_taco_java {
	curr="$DIR/results/inputs/programs/$1/T2"
	cd $curr
	echo $1
	new_folder="$DIR/results/outputs/programs/$1"
	mkdir $new_folder
	for prog in $(ls *.java)
	do
		echo $prog
		cd $DIR/BuritoJavaParser
		sudo java P2 < $curr/$prog > $new_folder/$prog
	done
	echo -e "\n\n"
}

# expects folder name as parameter
function parse_taco_java {
	cd $DIR/results/outputs/programs/$1
	echo $1
	for prog in $(ls *.java)
	do
		echo $prog
		cd $DIR/TACoJavaParser
		sudo java Main < $DIR/results/outputs/programs/$1/$prog
	done
	echo -e "\n\n"
}

# expects folder name as parameter
function compile_and_run_taco_java {
	cd $DIR/results/outputs/programs/$1
	echo $1
	for prog in $(ls *.java)
	do
		class=$(echo $prog|cut -f1 -d.)
		echo $class
		javac $prog
		java $class > $DIR/results/outputs/values/$class
	done
	echo -e "\n\n"
}

################################################################################

if [ "$1" == "-p" ]
then
	echo -e "\n\nCompiling and running BuritoJava programs.\nResults in results/inputs/values\n\n"
	compile_and_run_burito_java "CONT16"	
	echo -e "\n\nRunning BuritoJavaParser on BuritoJava programs\nResults in results/outputs/programs\n\n"
	translate_to_taco_java "CONT16"
	echo -e "\n\nRunning TACoJava parser on the generated programs\n\n"
	cd $DIR/TACoJavaParser
	javac Main.java
	parse_taco_java "CONT16"
	echo -e "\n\nCompiling and running TACoJava programs\nResults in results/outputs/values\n\n"
	compile_and_run_taco_java "CONT16"
else
	echo -e "\n\nCompiling and running BuritoJava programs.\nResults in results/inputs/values\n\n"
	cd $DIR/results/inputs/programs/
	for folder in $(ls)
	do
		compile_and_run_burito_java "$folder"
	done

	echo -e "\n\nRunning BuritoJavaParser on BuritoJava programs\nResults in results/outputs/programs\n\n"
	cd $DIR/results/inputs/programs/
	for folder in $(ls)
	do
		translate_to_taco_java "$folder"
	done

	echo -e "\n\nRunning TACoJava parser on the generated programs\n\n"
	cd $DIR/TACoJavaParser
	javac Main.java

	cd $DIR/results/outputs/programs
	for folder in $(ls)
	do
		parse_taco_java "$folder"
	done

	echo -e "\n\nCompiling and running TACoJava programs\nResults in results/outputs/values\n\n"
	cd $DIR/results/outputs/programs
	for folder in $(ls)
	do
		compile_and_run_taco_java "$folder"
	done
fi

###################################################

echo -e "\n\nPerforming file-wise diff\n\n"
RES=$DIR/results/
cd $DIR/results/outputs/values
for val in $(ls)
do
	echo $val
	diff ./$val $DIR/results/inputs/values/$val
done

