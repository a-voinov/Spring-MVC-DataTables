package com.tutorial.app.service;

import com.tutorial.app.dao.PaymentHome;
import com.tutorial.app.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PaymentService implements EntityService {

    @Autowired
    private PaymentHome paymentDAO;

    @Override
    public int getRecordsCount() {
        return paymentDAO.getRecordsCount();
    }

    @Override
    public List<Payment> getAll(int startPos, int maxResults){
        return paymentDAO.getAll(startPos, maxResults);
    }

}
