/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.reestrFermerov;

import com.liferay.portal.NoSuchModelException;

/**
 * @author liza
 */
public class NoSuchFermerException extends NoSuchModelException {

	public NoSuchFermerException() {
		super();
	}

	public NoSuchFermerException(String msg) {
		super(msg);
	}

	public NoSuchFermerException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchFermerException(Throwable cause) {
		super(cause);
	}

}