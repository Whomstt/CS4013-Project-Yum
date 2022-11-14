public class Table {
    private String tableNo;
    private int tableCapacity;

    public Table(String tableNo, int tableCapacity) {
        this.tableNo = tableNo;
        this.tableCapacity = tableCapacity;
    }

    public String getTableID() {
        return tableNo;
    }

    public void setTableID(String tableID) {
        this.tableNo = tableID;
    }

    public int getTableCapacity() {
        return tableCapacity;
    }

    public void setTableCapacity(int tableCapacity) {
        this.tableCapacity = tableCapacity;
    }
}
