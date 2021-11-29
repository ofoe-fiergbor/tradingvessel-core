package com.tradingvessel.core.persistence.repository;

import com.tradingvessel.core.persistence.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LogRepo extends JpaRepository<Log, Long> {
    List<Log> findFirst20ByOrderByTimestampCreateDesc();
}
