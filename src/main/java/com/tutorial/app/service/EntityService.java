package com.tutorial.app.service;

import com.tutorial.app.entity.Payment;
import com.tutorial.app.model.params.DataTablesParams;

import java.util.List;

public interface EntityService {
    int getRecordsCount();
    int getFilteredCount(DataTablesParams params);
    List<Payment> getAll(DataTablesParams params);
}
