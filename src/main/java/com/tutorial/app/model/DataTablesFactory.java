package com.tutorial.app.model;

import com.tutorial.app.model.params.DataTablesParams;
import com.tutorial.app.service.EntityService;

/**
 *  Factory retrieves Entity data wrapped with DataTables data
 */
public class DataTablesFactory {
    public static DataTablesWrapper getAll(EntityService service, DataTablesParams params){
        //return wrapped data
        return new DataTablesWrapper<>(
                params.getDraw() + 1, //increase draw count for data consistency
                service.getRecordsCount(), //total count
                service.getFilteredCount(params), //filtered count
                service.getAll(params) //data
        );
    }
}
