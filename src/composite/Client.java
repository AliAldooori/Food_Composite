package composite;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
     Facade facade = new Facade() ;
      facade.breakeFast.add(facade.ommlett);
      facade.breakeFast.add(facade.Ägg);
      facade.breakeFast.add(facade.ost);

      facade.Lunch.add(facade.Kykling);
      facade.Lunch.add(facade.beeft);

      facade.Dinner.add(facade.Fisk);
     facade.Dinner.add(facade.Hummos);
      facade.Dinner.add(facade.appetit);

      List<Food> Meny = new ArrayList<>() ;
      Meny.add(facade.breakeFast) ;
      Meny.add(facade.Lunch) ;
      Meny.add(facade.Dinner) ;

      facade.breakeFast.menny_pris();
      facade.breakeFast.total_pris();

      facade.Dinner.menny_pris();
      facade.Dinner.total_pris();


    }
    public void print_meny (ArrayList<Food>meny){
        for (Food item :
                meny) {
            System.out.println(item);

        }
    }
}
