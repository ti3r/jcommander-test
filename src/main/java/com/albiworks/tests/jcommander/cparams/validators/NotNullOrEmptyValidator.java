package com.albiworks.tests.jcommander.cparams.validators;

import com.beust.jcommander.IValueValidator;
import com.beust.jcommander.ParameterException;

/**
 * Validate that the parameter is present 
 * @author alexblanco
 *
 */
public class NotNullOrEmptyValidator implements IValueValidator<String> {

	@Override
	public void validate(String name, String value) throws ParameterException {
		//Check that the value is not null
		if ("-n".equalsIgnoreCase(name) || "--name".equalsIgnoreCase(name)){
			if ((null != value) && ("" != value))
				return;
			
			throw new ParameterException("Name parameter can't be null or empty");
		}
	}

}
