package composite;

public class Appetit implements Component {

   String name ;
   int price ;
 public Appetit(String name, int price) {
  this.name = name;
  this.price = price;
 }



    @Override
    public void menny_pris() {
   System.out.println("the price for "+this.name + " is " + this.price);
    }

    @Override
    public void total_pris() {
        price += price ;

    }
}
