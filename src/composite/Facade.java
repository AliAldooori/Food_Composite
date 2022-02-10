package composite;

public class Facade {
    Food food ;
    Appetit appetit ;

    Appetit Hummos = new Appetit("Hummos", 40 ) ;
    Appetit Tabola  = new Appetit("Tabola", 45 ) ;
    Appetit BabaGanoge = new Appetit("BabaGanoge", 30 ) ;
    Appetit Salad = new Appetit("Salad", 35 ) ;
    Appetit ommlett = new Appetit("ommlett" , 90) ;
    Appetit Ägg = new Appetit("Ägg" , 70) ;
    Appetit ost = new Appetit("ost" , 55) ;
    Appetit beeft = new Appetit("Beef" , 155) ;
    Appetit Kykling = new Appetit("Kykling" , 125) ;
    Appetit Fisk = new Appetit("Fisk" , 145) ;


    Food breakeFast = new Food("BreakeFast " , 150) ;
    Food Lunch = new Food("Lunch " , 250) ;
    Food Dinner  = new Food("Dinner " , 200) ;




}
