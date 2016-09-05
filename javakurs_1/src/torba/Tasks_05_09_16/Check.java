package torba.Tasks_05_09_16;

public class Check {

    private int length = 0;

    CheckRecord[] checkRecords = new CheckRecord[10];

    public void addCheckRecord(CheckRecord checkRecord) {
        checkRecords[length] = checkRecord;
        length = length + 1;
    }

}
