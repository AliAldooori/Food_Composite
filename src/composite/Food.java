package composite;

import java.util.ArrayList;

public class Food implements Component{
    String name ;
    int price ;
    ArrayList<Component> food = new ArrayList<>() ;
    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }


public void add  (Component c){
     this.food.add(c) ;
    }

    @Override
    public void menny_pris() {
        for (Component item :
                food) {
            item.menny_pris();
           item.total_pris();
        }
    }

    @Override
    public void total_pris() {
    System.out.println(this.price += price );

    }
}
