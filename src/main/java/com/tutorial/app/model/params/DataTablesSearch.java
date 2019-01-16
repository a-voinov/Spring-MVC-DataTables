package com.tutorial.app.model.params;


import lombok.Getter;
import lombok.Setter;

/**
 * DataTables sent search parameters
 */
@Getter
@Setter
public class DataTablesSearch {
    /**
     * Global search value. To be applied to all columns which have searchable as true.
     */
    private String value;
    /**
     * if the global filter should be treated as a regular expression for advanced searching, false otherwise. Note that normally server-side
     * processing scripts will not perform regular expression searching for performance reasons on large data sets, but it is technically possible and at the
     * discretion of your script.
     */
    private boolean regex;
}
