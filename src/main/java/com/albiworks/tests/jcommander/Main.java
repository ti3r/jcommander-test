package com.albiworks.tests.jcommander;

import com.albiworks.tests.jcommander.cparams.MainParameters;
import com.albiworks.tests.jcommander.cparams.commands.HolaCommandParams;
import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;

/**
 * Main class of the application
 * @author Alexandro Blanco <alex@albiworks.com>
 *
 */
public class Main {

	public static void main(String args[]){
		MainParameters params = new MainParameters();
		HolaCommandParams fuckParams = new HolaCommandParams();
		
		JCommander jc = new JCommander(params);
		jc.addCommand("hola", fuckParams);
		
		try{
			jc.parse(args);
		}catch(ParameterException ex){
			System.out.println(ex.getMessage());
			jc.usage();
			return;
		}
		
		if (fuckParams.getName() != null){
			sayHola(fuckParams);
		}else{
			sayHelloWorld(params);
		}
	}

	private static void sayHelloWorld(MainParameters params) {
		StringBuilder greeting = new StringBuilder("Hello ");
		greeting.append(params.getName());
		
		if (Boolean.TRUE.equals(params.getVerbose()))
			greeting.append(". I hope you have a great day today!!!");
		
		
		System.out.println(greeting);
	}

	private static void sayHola(HolaCommandParams holaParams) {
		StringBuilder hola = new StringBuilder("Hola ");
		hola.append(holaParams.getName());
		
		System.out.println(hola);
	}
	
}
