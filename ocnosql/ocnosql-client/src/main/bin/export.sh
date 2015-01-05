jarPath=../lib/ocnosql.tools-2.0.jar
tableName=dr_query20131121
#字段分隔符，默认为制表符
seperator=";"
#输出字段分隔符，默认为制表符
out_seperator="-"
#rowkey从第几位开始截取，去掉rowkey前面hash
position=3
#输出目录，可以为HDFS或本地文件系统
output=/export/GPRS/20131121
#output=file:///home/ocnosql/export/GPRS/20131121
#压缩类型
compress=com.ailk.ocnosql.core.compress.impl.HbaseCompressImpl
#将rowkey插入到第几个字段，从0开始，超出最大范围rowkey会放到数据最后。rowkeyIndex=-1表示不插入rowkey
rowkeyIndex=2
#reduce个数，即最终生成文件个数
reduceNum=5


HADOOP_HOME=~/app/zhejiang/hadoop/

HADOOP_CLASSPATH=`~/app/zhejiang/hbase/bin/hbase classpath`

for i in ../lib/*.jar; do
    HADOOP_CLASSPATH=$HADOOP_CLASSPATH:$i
done

export HADOOP_CLASSPATH

~/app/zhejiang/hadoop/bin/hadoop jar ${jarPath} "export" -t $tableName -o $output  -pos $position -sep $seperator -osep ${out_seperator} -c $compress -ri $rowkeyIndex -rn $reduceNum