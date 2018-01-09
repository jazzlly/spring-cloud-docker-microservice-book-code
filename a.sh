#!/bin/bash

for path in $(ls)
do
    abbv=${path#consumer-movie-}

    echo path is : $path

    if [ "$path" != "$abbv" ];then
        abbv=consumer-${abbv}
        echo abbv is : $abbv
        mv $path $abbv
    fi
done
