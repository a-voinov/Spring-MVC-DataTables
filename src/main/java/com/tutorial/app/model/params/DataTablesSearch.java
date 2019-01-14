package com.tutorial.app.model.params;


/**
 * DataTables sent search parameters
 */
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

    public DataTablesSearch() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isRegex() {
        return regex;
    }

    public void setRegex(boolean regex) {
        this.regex = regex;
    }
}
