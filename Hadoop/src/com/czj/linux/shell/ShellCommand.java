package com.czj.linux.shell;


import org.apache.hadoop.conf.Configuration;


import com.czj.conf.CommonConf;
import com.czj.conf.CommonConstants;

public class ShellCommand {
	
	private  String HOSTNAME = CommonConf.getConf().get
	
	
	
	public static void main(String[] args) {
		ShellCommand sc=new ShellCommand();
		System.out.println(sc.HOSTNAME.toString());
	}

	
}
