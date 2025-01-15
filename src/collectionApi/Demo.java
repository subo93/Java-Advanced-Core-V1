package collectionApi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) throws IOException {

     List<Object> collection = new ArrayList<Object>();
     collection.add(3);
     collection.add("sdf");
     collection.add(2.2);


     //collection.
        System.out.println(collection.indexOf(2.2));
        System.out.println(collection.get(2));
       // collection.


//        for(Object ob : collection){
//            System.out.println(ob);
//        }


    }
}

