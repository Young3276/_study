#! /bin/bash

function usage(){
	echo "#####################################################"
	echo "Usage : $0 [argv1] [argv2]"
	echo "[argv1] : -d or -c option"
	echo "[argv2] : Directory path"
	echo "#####################################################"
	exit 1
}

function check(){
	if [ $# != 2 ]
	then
		usage
	fi

	FLAG=0
	if [ $1 == "-d" ]
	then
		FLAG=1
	elif [ $1 == "-c" ]
	then
		FLAG=1
	fi

	if [ $FLAG -ne 1 ]
	then
		usage
	fi

	if !([ -d $2 ])
	then
		usage
	fi
}


check $*
case $1 in
	-d)
		COUNT1=`find $2 -maxdepth 1 -type f -size +100k |wc -l`
		RESULT1=`find $2 -maxdepth 1 -type f -size +100k -print`
		echo "File Count : $COUNT1"
		echo "DELETE START"
		for TEMP in $RESULT1
		do
			echo "delete $TEMP"
			rm -rf $TEMP
		done
		echo "DELETE END";;

	-c)
		find $2 -maxdepth 1 -type f -size +100k -exec ls -lh {} \;
		RESULT2=`find $2 -maxdepth 1 -type f -size +100k -print`
		COUNT2=`find $2 -maxdepth 1 -type f -size +100k |wc -l`
		echo "File Count : $COUNT2"
		echo "Compress File's name : "
		read NAME2
		tar -cvzf $NAME2.tar $RESULT2
		echo "$NAME2.tar is completed successfully";; 
esac

