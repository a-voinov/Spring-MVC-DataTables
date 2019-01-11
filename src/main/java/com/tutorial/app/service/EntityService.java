package com.tutorial.app.service;

import com.tutorial.app.entity.Payment;

import java.util.List;

public interface EntityService {
    int getRecordsCount();
    List<Payment> getAll(int startPos, int maxResults);
}
