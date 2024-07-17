#!/bin/bash

echo "Using JAVA_OPTS:"
for arg in $JAVA_OPTS do
    echo $arg
done

echo "app starting..."
java ${JAVA_OPTS} -jar ${JAVA_OPTS} /usr/local/cloud/webapps/application.jar