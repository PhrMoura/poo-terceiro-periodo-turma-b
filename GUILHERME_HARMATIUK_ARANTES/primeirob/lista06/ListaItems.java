package primeirob.lista06;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import primeirob.lista06.models.Item;

public class ListaItems {
    public static List<Item> retriveListaItems () {
        List<Item> items = new ArrayList<Item>();


        Item item01 = new Item();
        item01.easyGenerate(1l, "Item01", "Bebida", new BigDecimal(3.00));
    
        Item item02 = new Item();
        item02.easyGenerate(2l, "Item02", "Carro", new BigDecimal(10000.00));
    
        Item item03 = new Item();
        item03.easyGenerate(3l, "Item03", "Comida", new BigDecimal(7.50));
        
        items.add(item01);
        items.add(item02);
        items.add(item03);

        return items;
    } 
}
