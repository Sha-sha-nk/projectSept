package com.pod1.loggingToDBMS.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pod1.loggingToDBMS.model.Logs;

@Repository
public interface LoggingToDbmsDTO extends CrudRepository<Logs,Integer>{
    
}
