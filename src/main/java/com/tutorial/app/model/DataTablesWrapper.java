package com.tutorial.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Wrapper object formatting Entities for DataTables
 * https://datatables.net/manual/server-side
 */
@Getter
@Setter
@AllArgsConstructor
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
}
