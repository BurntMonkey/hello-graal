export GRAAL_HOME=$JAVA_HOME
export GRAAL_LLVM_TOOLCHAIN=$($GRAAL_HOME/bin/lli --print-toolchain-path)
export TARGET_DIR=./src/main/resources/lib
mkdir -p $TARGET_DIR
$GRAAL_LLVM_TOOLCHAIN/clang -shared ./src/main/c/NativeApp.c -lgraalvm-llvm -o $TARGET_DIR/NativeApp.so
