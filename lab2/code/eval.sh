
DIR=$(pwd)
cd $DIR/inputs/contributedP2/
FIR=$(pwd)
cd $DIR/inputs/contributedP2/
for folder in $(ls)
do
	cd $FIR/$folder/T2
	echo $folder
	for prog in $(ls *.java)
	do
		echo $prog
		javac $prog
	done
done

cd $DIR/inputs/contributedP2/
for folder in $(ls)
do
	cd $FIR/$folder/T2
	echo $folder
	for prog in $(ls *.java)
	do
		class=$(echo $prog|cut -f1 -d.)
		echo $class
		java $class > $DIR/results/inputs/$class
	done
done

cd $DIR/inputs/contributedP2/
for folder in $(ls)
do
	cd $FIR/$folder/T2
	echo $folder
	mkdir $DIR/results/outputs/programs/$folder
	for prog in $(ls *.java)
	do
		echo $prog
		cd $DIR/BuritoJavaParser
		sudo java P2 < $FIR/$folder/T2/$prog > $DIR/results/outputs/programs/$folder/$prog
	done
done

RES=$DIR/results/outputs
cd $RES/programs
for folder in $(ls)
do
	cd $RES/programs/$folder
	for prog in $(ls *.java)
	do
		class=$(echo $prog|cut -f1 -d.)
		echo $class
		javac $prog
		java $class > $RES/values/$class
	done
done

RES=$DIR/results/
cd $RES/outputs/values
for val in $(ls)
do
	echo $val
	diff ./$val $RES/inputs/$val 
done


