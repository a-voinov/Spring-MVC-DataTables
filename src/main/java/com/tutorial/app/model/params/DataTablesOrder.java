package com.tutorial.app.model.params;

import lombok.Getter;
import lombok.Setter;

/**
 * DataTables sent order parameters
 */
@Getter
@Setter
public class DataTablesOrder {
    /**
     * Column to which ordering should be applied. This is an index reference to the columns array of information that is also submitted to the server.
     */
    private int column;
    /**
     * Ordering direction for this column. It will be <code>asc</code> or <code>desc</code> to indicate ascending ordering or descending ordering,
     * respectively.
     */
    private String dir;
}
