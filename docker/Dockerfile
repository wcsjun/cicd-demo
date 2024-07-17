# Container image that runs your code
FROM eclipse/centos_jdk8
USER root

COPY script/start.sh  /usr/local/cloud/bin/start.sh
RUN chmod a+rx /usr/local/cloud/bin/start.sh

# Copies your code file from your action repository to the filesystem path `/` of the container
COPY /target/*.jar /usr/local/cloud/webapps/application.jar

CMD ["bin/start.sh"]
