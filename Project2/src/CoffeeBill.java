public class CoffeeBill{
    String CoffeeName;
    int CoffeePrice;
    double CoffeeQuantity;

    public CoffeeBill(String name, int price, double quantity){
        this.CoffeeName = name;
        this.CoffeePrice = price;
        this.CoffeeQuantity = quantity;
    }

    public void printBill(){
        System.out.println(this.CoffeeName);
        System.out.printf("%4f x %6d = %8f\n", this.CoffeeQuantity, this.CoffeePrice, this.TotalBill());
        System.out.println("Arigatou Gozaimasu");
    }
    public double TotalBill(){
        return this.CoffeePrice*this.CoffeeQuantity;
    }

    public boolean CheckQuantity(double a){
        if(this.CoffeeQuantity>a) return true;
        else return false;
    }
    public boolean CheckBill(double a){
        if(this.TotalBill()>a) return true;
        else return false;
    }
}