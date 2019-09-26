kerven-han:
这个我们可以直接来编译 *.proto 文件。非常的方便。

#使用方式：**  
##step1:  
给你的idea安装proto插件  
##step2:  
pom.xml配齐，按照我这来就ok  
你不需要去在本地或者集群安装protobuf  
##step3:  
在你的maven插件里找到，protobuf,然后运行：protobuf:compile  
一般来说idea去找你的右侧的，maven->Plugins就可以找到了。
##step4:  
编译完毕之后去你的target目录下去找   target -> generated-sources,就可以看到了

##FBIWARNING:  
把文件放到src的目录下：否则的话你编译个毛线。
