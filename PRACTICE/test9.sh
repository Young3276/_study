#! /bin/bash

a=2334
let "a += 1"
echo "a = $a"
echo

b=${a/23/BB}
echo "b=$b"

