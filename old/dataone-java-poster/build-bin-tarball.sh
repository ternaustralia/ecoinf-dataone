#!/bin/bash
# Creates a tarball with everything required to run standalone. Useful for pushing to a remote box to run
cd `dirname $0`
mvn clean package -Pshade
if [ "$?" != "0" ]; then
  exit $?
fi
OUTPUT_FILE=target/dataone-java-poster.tar.gz
tar czf $OUTPUT_FILE --transform 's,^,dataone-java-poster/,' \
  target/dataone-java-poster-dependencies-1.0-SNAPSHOT.jar \
  target/dataone-java-poster-1.0-SNAPSHOT.jar \
  launch-dataone-poster.sh \
  trust-dataone-cert.sh \
  build-certificate.sh \
  create-x509-cert.txt
if [ "$?" != "0" ]; then
  exit $?
fi
echo "Created archive at `pwd`/$OUTPUT_FILE"