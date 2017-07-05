#! /bin/bash

File=/etc/fstab

{
read line1
read line2
read line3
} < $File

echo "$File 파일의 첫번째 줄 :"
echo "$line1"
echo "$File 파일의 두번째 줄 :"
echo "$line2"
echo "$file 파일의 세번째 줄 :"
echo "$line3"
exit 0
