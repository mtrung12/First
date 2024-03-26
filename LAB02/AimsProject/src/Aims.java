public class Aims{
    public static void main(String[] args){
        //create a new order
    Cart order = new Cart();

    //Create new dvd objects and add them to the cart
    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
    order.addDigitalVideoDisc(dvd1);
    order.addDigitalVideoDisc(dvd1);
    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
    order.addDigitalVideoDisc(dvd2);
    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
    order.addDigitalVideoDisc(dvd3);
    System.out.println("Total Cost is: ");
    System.out.println(order.totalCost());
    order.dispCart();
    }
}
