package com.tutorial.app.model.params;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * DataTables sent parameters
 */
@Getter
@Setter
public class DataTablesParams {
    private int draw;
    private int start;
    private int length;
    private DataTablesSearch search;
    private List<DataTablesOrder> order;
    private List<DataTablesColumn> columns;
}
