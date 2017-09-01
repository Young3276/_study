#! /bin/bash

rootPWD="tjxmdlqslek";
#echo $rootPWD
sudo add-apt-repository ppa:webupd8team/java
sudo apt-get update
sudo apt-get install -y openjdk-7-jdk
#sudo apt install oracle-java8-installer
echo "JAVA_HOME=/usr/lib/jvm/java-7-openjdk-amd64/" >> /etc/bash.bashrc
source /etc/bash.bashrc

