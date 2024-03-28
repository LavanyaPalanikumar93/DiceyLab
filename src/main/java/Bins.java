
public class Bins {
int min;
int max;
int[] results;
public Bins(int min,int max){
    this.min=min;
    this.max=max;
    results=new int[max-min+1];
}
    public Integer getBin(int binNum){
    return this.results[binNum-this.min];
    }
    public void incrementBins(int binNum){
    this.results[binNum-this.min]++;
    }

}
