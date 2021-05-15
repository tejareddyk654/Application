package com.spring.CustomerLog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogModelService {

	@Autowired
	private LogModelRepository repo;
	
	public List<LogModel> listAll(){
		return repo.findAll();
	}
	
	public void save(LogModel logmodel) {
		repo.save(logmodel);
	}
	
	public LogModel get(String id) {
		return repo.findById(id).get();
	}
	
	public void delete(String id) {
		repo.deleteById(id);
	}
	
	public List<LogModel> findByCheckIn(String name, String log_type){
		return repo.findByCheckIn(name, log_type);
	}
	public List<LogModel> findByDate(String date){
		return repo.findbydate(date);
	}
}
