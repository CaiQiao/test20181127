package com.jt.common.util;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperUtils {
	private static final ObjectMapper mapper=new ObjectMapper();
	
	public static ObjectMapper getMapper(){
		return mapper;
	}

}
