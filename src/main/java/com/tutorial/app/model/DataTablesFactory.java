package com.tutorial.app.model;

import com.tutorial.app.service.EntityService;

import java.util.List;

public class DataTablesFactory {
    public static DataTablesWrapper getAll(
            EntityService service, int draw, int length, int start){
        //retrieve data from service
        List<?> data = service.getAll(start, length);
        //get total size of table from db
        int size = service.getRecordsCount();
        //return wrapped data
        return new DataTablesWrapper<>(
                ++draw, //increase draw count for data consistency
                data.size(),
                size,
                data);
    }
}
