import javax.swing.JOptionPane;
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int[] QtyOrdered = new int[MAX_NUMBERS_ORDERED];
    private int totalOrdered = 0;

    //add disc
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        int nextEmpty=0;
        if(totalOrdered<=MAX_NUMBERS_ORDERED){
            for(int i=0;i<20;i++){
                if(itemsOrdered[i]==null){
                    nextEmpty = i;
                    QtyOrdered[nextEmpty]++;
                    itemsOrdered[nextEmpty]=disc;
                    break;
                }
                else{
                    if(disc.equals(itemsOrdered[i])){
                        QtyOrdered[i]++;
                        break;
                    }
                }
            }
        }
    }

    //remove disc
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for(int i=0;i<MAX_NUMBERS_ORDERED;i++){
            if(disc.equals(itemsOrdered[i])){
                QtyOrdered[i]--;
            }
            if(itemsOrdered[i]==null){
                JOptionPane.showMessageDialog(null, "Item is not currently in your cart.","Fail to remove", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    //total cost of Cart
    public float totalCost(){
        float total=0f;
        float price;
        for(int i=0;i<MAX_NUMBERS_ORDERED;i++){
            if(itemsOrdered[i]==null) break;
            else{
                price = itemsOrdered[i].getCost();
                total+=price*QtyOrdered[i];
            }
        }
        return total;
    }

    //display cart list
    public void dispCart(){
        for(int i=0;i<MAX_NUMBERS_ORDERED;i++){
            if(itemsOrdered[i]!=null){
                System.out.println(itemsOrdered[i].getTitle() + ": " + QtyOrdered[i]);
            }
            else break;
        }
    }
}
