#!/bin/bash

a=879
echo "\"a\"의 값은 이제 $a입니다."

let a=16+5
echo "\"a\"의 값은 이제 $a입니다."

echo -n "루프에서 \"a\"의 값은 "
for a in 7 8 9 11
do
	echo -n "$a 입니다."
done

echo
echo

echo -n "\"a\"를 넣으세요."
read a
echo "\"a\"의 값은 이제 $a입니다."

echo 

exit 0
