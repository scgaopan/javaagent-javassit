# javaagent-javassit

mvn clean package

cd target

注：需要把javassist的jar包copy到同一目录下
java -javaagent:javaagent-javassit.jar=HELLO1 -jar javaagent-javassit-0.0.1-SNAPSHOT.jar 

gaopandeMacBook-Pro:target gaopan$ java -javaagent:javaagent-javassit.jar=HELLO1 -jar javaagent-javassit-0.0.1-SNAPSHOT.jar 
objc[1533]: Class JavaLaunchHelper is implemented in both /Library/Java/JavaVirtualMachines/jdk1.8.0_112.jdk/Contents/Home/bin/java and /Library/Java/JavaVirtualMachines/jdk1.8.0_112.jdk/Contents/Home/jre/lib/libinstrument.dylib. One of the two will be used. Which one is undefined.

=========premain方法执行========
premain的param:=HELLO1
hello world!!
this method sayHello cost:2002ms.
hello world2
this method sayHello2 cost:1002ms.