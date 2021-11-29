package com.tradingvessel.core.persistence.demo_data;

import com.tradingvessel.core.business.service.LogSvc;
import com.tradingvessel.core.persistence.model.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DemoDataLoader {

    @Autowired
    private LogSvc logSvc;

    public void createDemoData() {
        logSvc.write("This is a log entry");

        List<Log> recentLogList = logSvc.getAll();

        for(Log log: recentLogList) {
            System.err.println(log.getMessage());
        }
    }
}
