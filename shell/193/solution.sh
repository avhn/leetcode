#!/usr/bin/env bash
filename="file.txt"
grep -e "^([0-9]\{3\}) [0-9]\{3\}-[0-9]\{4\}$" -e "^[0-9]\{3\}-[0-9]\{3\}-[0-9]\{4\}$" $filename
