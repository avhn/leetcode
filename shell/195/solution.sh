#!/usr/bin/env bash

filename="file.txt"

if [ -f $filename ]; then
  i=0
  while IFS= read -r line; do
    ((i++))

    if [ $i -eq 10 ]; then
      echo $line
      exit
    fi
  done < $filename
fi
