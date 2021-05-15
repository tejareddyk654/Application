package com.spring.CustomerLog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogModelController {

	@Autowired
	private LogModelService service;
	
	
    @GetMapping("/getAllLog")
	public List<LogModel> list(){
		return service.listAll();
	}
    
    @GetMapping("/checkIn")
    public List<LogModel> login(@RequestParam String name) {
    	return service.findByCheckIn(name, "IN");
    }
    
    @GetMapping("/checkOut")
    public List<LogModel> logout(@RequestParam String name) {
    	return service.findByCheckIn(name, "OUT");
    }
    
    @GetMapping("/getLog")
    public List<LogModel> listByDate(@RequestParam String Date){
    	 return service.findByDate(Date);
    }
    
}
