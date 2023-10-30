package org.onlineshoppingportal.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND,reason=" No Order Found",
code=HttpStatus.TEMPORARY_REDIRECT)
public class NoOrderFoundException extends RuntimeException{
	public NoOrderFoundException()
	{
		super("NoOrderFound");
	}
	

}
