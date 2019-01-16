package com.tutorial.app.model.params;

import lombok.Getter;
import lombok.Setter;

/**
 * DataTables sent columns parameters
 */
@Getter
@Setter
public class DataTablesColumn {
    private String data;
    private String name;
    private boolean orderable;
    private DataTablesSearch search;
    private boolean searchable;
}
