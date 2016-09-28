package tretiak.labworks.theardLab;


public class MySumCount implements Runnable{
    private Integer startIndex;
    private Integer stopIndex;
    private Integer[] arr = new Integer[]{};
    private Long resultSum = new Long(0);

    public Long getResultSum() {
        return resultSum;
    }
    public Integer getStartIndex(){
        return startIndex;
    }
    public Integer getStopIndex(){
        return stopIndex;
    }
    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }
    public void setStopIndex(Integer stopIndex) {
        this.stopIndex = stopIndex;
    }
    public void setArr(Integer[] arr) {
        this.arr = arr;
    }
    @Override
    public void run(){
        if (startIndex == null){
            this.setStartIndex(0);
        }
        if (stopIndex == null){
            this.setStopIndex(arr.length);
        }
        for (int i = startIndex;i < stopIndex; i++){
            resultSum += new Long(arr[i]);
        }
        /*try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            return;
        }*/
    }
}
