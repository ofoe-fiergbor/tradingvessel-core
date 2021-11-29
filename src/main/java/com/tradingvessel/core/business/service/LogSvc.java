package com.tradingvessel.core.business.service;

import com.tradingvessel.core.persistence.model.Log;
import com.tradingvessel.core.persistence.repository.LogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogSvc {

    @Autowired
    private LogRepo logRepo;

    public void write(String msg) {
        Log log = new Log(msg);
        logRepo.save(log);
    }

    public List<Log> getAll() {
        return logRepo.findAll();
    }
    public List<Log> getRecentEntries() {
        return logRepo.findFirst20ByOrderByTimestampCreateDesc();
    }
}
