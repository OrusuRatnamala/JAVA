package org.onlineshoppingportal.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND,reason=" Product Out Of Stock",
code=HttpStatus.TEMPORARY_REDIRECT)
public class ProductOutOfStockException extends RuntimeException{
	public ProductOutOfStockException()
	{
		super("Product Out Of Stock");
	}
	


}
