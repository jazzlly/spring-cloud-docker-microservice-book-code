#!/bin/bash

for path in $(ls)
do
    if [ -e $path/pom.xml ];then
        echo $path has pom.xml
        cd $path
        mvn clean install
        cd -
    fi
done
