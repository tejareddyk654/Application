package com.spring.CustomerLog;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LogModelRepository extends JpaRepository<LogModel, String> {

	@Query("SELECT l from LogModel l where l.date=?1")
	public List<LogModel> findbydate(String date);
	
	@Query("SELECT l from LogModel l where l.name=?1 AND l.logType=?2")
	public List<LogModel> findByCheckIn(String name,String logtype);
}
