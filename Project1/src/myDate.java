public class myDate {
    private int day;
    private int month;
    private int year;

    //constructor
    public myDate(int d, int m, int y){
        this.day=d;
        this.month=m;
        this.year=y;
    }

    public void setDate(int d, int m, int y){
        this.day=d;
        this.month=m;
        this.year=y;
    }
    
    public void printDate(){
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }
}
