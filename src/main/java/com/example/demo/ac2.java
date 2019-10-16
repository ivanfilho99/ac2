package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ac2 
{
	@RequestMapping(value = "/health", method = RequestMethod.GET)
	public String test() 
	{

		return "Sistema Drummond API ativo - " + new SimpleDateFormat("yyyyMM-dd HH:mm:ss").format(new Date());

	}
	
	@RequestMapping(value = "/ac2api4/{number}", method = RequestMethod.GET)
	public Integer ac2api4(@PathVariable Integer number) 
	{
		
		Integer result = null;
		
		if(number % 4 == 0)
		{
			result = number + 4;
			System.out.println(result);
			
		} 
		
		else 
		{
			result = -1;
					
		}
		return result;
		
	}

}
