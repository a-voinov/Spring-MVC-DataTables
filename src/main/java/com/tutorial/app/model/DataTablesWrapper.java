package com.tutorial.app.model;

import java.util.List;

/**
 * Wrapper object formatting Entities for DataTables
 * https://datatables.net/manual/server-side
 */
public class DataTablesWrapper<T> {

    /**
     * The draw counter that this object is a response to - from the draw parameter
     * sent as part of the data request. Note that it is strongly recommended for
     * security reasons that you cast this parameter to an integer, rather than simply
     * echoing back to the client what it sent in the draw parameter, in order to prevent Cross Site Scripting (XSS) attacks.
     */
    private int draw;
    /**
     * 	Total records, before filtering
     * 	(i.e. the total number of records in the database)
     */
    private int recordsTotal;
    /**
     * Total records, after filtering (i.e. the total number of records after filtering
     * has been applied - not just the number of records being returned for this page
     * of data).
     */
    private int recordsFiltered;
    /**
     * The data to be displayed in the table. This is an array of data source objects,
     * one for each row, which will be used by DataTables.
     */
    private List<T> data;

    public DataTablesWrapper(int draw, int recordsTotal, int recordsFiltered, List<T> data) {
        this.draw = draw;
        this.recordsTotal = recordsTotal;
        this.recordsFiltered = recordsFiltered;
        this.data = data;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public int getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(int recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
