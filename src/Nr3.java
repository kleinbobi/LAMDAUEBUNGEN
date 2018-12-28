import personen.Handwerker;
import personen.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Nr3 {
    public static void main(String[] args) {
        List<Person> list = new LinkedList<Person>();

        for (int j = 0; j < 5; j++) {
            if(j < 3){
                list.add(new Person("BOB MemeLOrd",60+j));
            }else {
                list.add(new Handwerker("Gursula Gans ",18+j,"HRZ5"));
            }
        }

        list.stream()
                .filter(s -> s instanceof  Handwerker)
                .forEach(System.out::println);









    }






}
