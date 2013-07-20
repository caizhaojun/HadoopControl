package com.czj.linux.shell;


import java.util.Collection;

import org.apache.hadoop.conf.Configuration;


import com.czj.conf.CommonConf;
import com.czj.conf.CommonConstants;

public class ShellCommand {
	
	private  Collection<String> HOSTNAME = CommonConf.getConf().getStringCollection(CommonConstants.HOSTNAMES);
	
	
	
	public static void main(String[] args) {
		ShellCommand sc=new ShellCommand();
		System.out.println(sc.HOSTNAME.toString());
	}

	
}
