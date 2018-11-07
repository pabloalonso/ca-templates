package com.ca.actorFilter;

import org.bonitasoft.engine.filter.AbstractUserFilter;
import org.bonitasoft.engine.connector.ConnectorValidationException;

public abstract class AbstractAssignToOneOrToAllImpl extends AbstractUserFilter {

	protected final static String USERTOASSIGN_INPUT_PARAMETER = "userToAssign";

	protected final java.lang.Long getUserToAssign() {
		return (java.lang.Long) getInputParameter(USERTOASSIGN_INPUT_PARAMETER);
	}

	@Override
	public void validateInputParameters() throws ConnectorValidationException {
		try {
			getUserToAssign();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("userToAssign type is invalid");
		}

	}

}
