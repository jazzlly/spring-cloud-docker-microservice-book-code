#!/bin/bash

for path in $(ls)
do
    abbv=${path#microservice-}

    echo path is : $path
    echo abbv is : $abbv

    if [ "$path" != "$abbv" ];then
        mv $path $abbv
    fi
done
