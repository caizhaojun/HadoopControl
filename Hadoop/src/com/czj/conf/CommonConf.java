package com.czj.conf;

import org.apache.hadoop.conf.Configuration;

public class CommonConf extends Configuration{
	private static CommonConf conf=new CommonConf();
	
	static{
		addDefaultResource("basic-conf.xml");
	}
	
	public static CommonConf getConf(){
		return conf;
	}
	
}
