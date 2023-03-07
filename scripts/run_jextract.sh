set -e -x

JEXTRACT_DIR=/Users/mlevental/dev_projects/kotlin-jni/scripts/jextract-19
LLVM_INSTALL_DIR=/Users/mlevental/dev_projects/loopy/llvm_install
OUTPUT_PATH=/Users/mlevental/dev_projects/kotlin-jni/src/main/java

sudo xattr -r -d com.apple.quarantine $JEXTRACT_DIR/bin/jextract

python header_utils.py $LLVM_INSTALL_DIR/include --dry-run

export PATH=${JEXTRACT_DIR}/bin:$PATH
jextract --source \
  -t org.mlir all_includes.h \
  --header-class-name Bindings \
  -I$LLVM_INSTALL_DIR/include \
  -I/usr/include/python3.10 \
  -I/Library/Developer/CommandLineTools/SDKs/MacOSX11.3.sdk/usr/include/ \
  --output $OUTPUT_PATH
