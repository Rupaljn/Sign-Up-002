package com.rakuten.exceptions;

import com.rakuten.dto.Student;

public class DataInvalidException extends RuntimeException{
public DataInvalidException(String msg){
	super(msg);
}
}
