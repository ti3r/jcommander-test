package com.albiworks.tests.jcommander.cparams.commands;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.albiworks.tests.jcommander.cparams.validators.NotNullOrEmptyValidator;
/**
 * The Class to hold the parameters for the fuck Command
 * The hello world can receive a command fuck to send a 
 * fuck message to someone
 * @author Alexandro Blanco <alex@albiworks.com>
 *
 */
@Parameters(separators = " ", commandDescription="Sends a Hola message to someone")
public class HolaCommandParams {

	@Parameter(names={"-n","--name"}, required=true , validateValueWith=NotNullOrEmptyValidator.class)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
