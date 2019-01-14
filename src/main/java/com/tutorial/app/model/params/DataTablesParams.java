package com.tutorial.app.model.params;

import java.util.List;

/**
 * DataTables sent parameters
 */
public class DataTablesParams {

    private int draw;
    private int start;
    private int length;
    private DataTablesSearch search;
    private List<DataTablesOrder> order;
    private List<DataTablesColumn> columns;

    public DataTablesParams(int start, int length) {
        this.start = start;
        this.length = length;
    }

    public DataTablesParams() {
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public DataTablesSearch getSearch() {
        return search;
    }

    public void setSearch(DataTablesSearch search) {
        this.search = search;
    }

    public List<DataTablesOrder> getOrder() {
        return order;
    }

    public void setOrder(List<DataTablesOrder> order) {
        this.order = order;
    }

    public List<DataTablesColumn> getColumns() {
        return columns;
    }

    public void setColumns(List<DataTablesColumn> columns) {
        this.columns = columns;
    }
}
