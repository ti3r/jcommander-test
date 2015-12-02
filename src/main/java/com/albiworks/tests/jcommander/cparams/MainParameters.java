package com.albiworks.tests.jcommander.cparams;

import com.beust.jcommander.Parameter;

/**
 * Class to hold the main parameters of the application
 * @author Alexandro Blanco <alex@albiworks.com>
 */
public class MainParameters {
	
	@Parameter(names={"--verbose","-v"}, arity=0
			,description="The option to display a verbose message after hello world")
	Boolean verbose;
	
	@Parameter(names={"--name","-n"}, required=true,
			description="The name to be displayed in the hello wold message")
	String name;

	public Boolean getVerbose() {
		return verbose;
	}

	public void setVerbose(Boolean verbose) {
		this.verbose = verbose;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	/**
	 * This method check if the required parameters have been set
	 * correctly for the program execution. If not usage should be
	 * called in the main program
	 * @return Boolean value if the params are correct
	 */
	public Boolean invalidParams(){
		return (name == null);
	}
	
}
