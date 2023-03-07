# hello-graal
A simple project calling c from java (linux only at the moment)

mvn install works with $JAVA_HOME set to a Graal JDK (tested with 22.3).

native-image works with the current development build (23.0.0), but bugs out with the current release version.

I used the following command to build the binary:

	$JAVA_HOME/bin/native-image -H:IncludeResources="lib/.+" --language:llvm -jar hellograal-1.0.jar


