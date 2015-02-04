#!/bin/bash
# Command line wrapper to launch the EML-POSTer Java app
cd `dirname $0`
SOURCE_DIR=$1
SYSMETA_FILENAME=$2
EML_FILENAME=$3
USAGE_MSG="  Usage: $0 <source-dir> <sysmeta filename> <eml filename>"
EXAMPLE_MSG="  Example: $0 /tmp sysmeta.xml eml.xml"
LOGS_DIR=logs
UNIQUE_ID=`date +%Y%m%d_%H%M`
if [ -z "$SOURCE_DIR" ];then
  echo "Startup error: you need to pass the source directory that the files live in as the first arg" 
  printf $USAGE_MSG
  exit 1
fi
if [ -z "$SYSMETA_FILENAME" ];then
  echo "Startup error: you need to pass the filename of the sysmeta (System Metadata) file as the second arg" 
  echo $USAGE_MSG
  exit 1
fi
if [ -z "$EML_FILENAME" ];then
  echo "Startup error: you need to pass the filename of the EML file as the third arg" 
  echo $USAGE_MSG
  exit 1
fi
mkdir -p $LOGS_DIR
PROG_ARGS="--eml-poster.source.dir=$SOURCE_DIR"
PROG_ARGS="$PROG_ARGS --eml-poster.file.eml=$EML_FILENAME"
PROG_ARGS="$PROG_ARGS --eml-poster.file.sysmeta=$SYSMETA_FILENAME"

java -Xms256m -Xmx5G -XX:MaxPermSize=256m -XX:+HeapDumpOnOutOfMemoryError -noverify \
-cp target/eml-poster-1.0-SNAPSHOT.jar:target/eml-poster-dependencies-1.0-SNAPSHOT.jar \
au.org.ecoinformatics.eml.poster.EcoinformaticsEmlPosterApplication \
$PROG_ARGS 2>&1 | tee $LOGS_DIR/eml-poster_$UNIQUE_ID-$PART_NAME.log
