#!/bin/sh
# ~/Downloads/SnowLeopard_Lion_Mountain_Lion_Mavericks_Yosemite_04/ffmpeg -i IPZ-559.mp4
# -c:a copy -c:v libx265 IPZ-559_h265.mp4
# find . -name "*.c" -o -name "*.cpp" -o -name "*.h"
#FFMPEG=~/Downloads/SnowLeopard_Lion_Mountain_Lion_Mavericks_Yosemite_04/ffmpeg
#echo "Input file name: $1"
#filename=`echo $1|awk -F . '{print $1}'`
#echo "Output file name: "$filename"_h265.mp4"
#time $FFMPEG -i $1 -c:a copy -c:v libx265 -x265-params crf=25 $filename"_h265.mp4"
# default 28
# -x265-params crf=24
#echo "thisfile.txt"|awk -F . '{print $NF}'
#echo "thisfile.txt"|awk -F . '{print $1}'
#ubntPid=`adb shell ps | grep "com.ubnt.unifi.home" | awk '{print $2}'`
#echo "com.ubnt PID is $ubntPid"
#adb logcat -v time | grep $ubntPid

CURRENT=`pwd`
#for video in $CURRENT/*.mp4; do
for video in ./*.mp4; do
    echo "Get frame of video:$video"
    filename=`echo $video|awk -F . '{print $2}'`
    echo "filename:$filename"
    ~/Tools/ffmpeg -i $video -ss 00:00:00.500 -vframes 1 "."$filename".png"
done

