
import personen.Handwerker;
import personen.Person;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Nr4 {

    public static void main(String[] args) {

        Stream.Builder<Person> list = Stream.builder();

        for (int j = 0; j < 5; j++) {
            if(j < 3){
                list.add(new Person("Peron mit Namen",60+j));
            }else {
                list.add(new Handwerker("Gursula Gans ",18+j,"HRZ5"));
            }
        }
/*
        Supplier<Stream<Person>> sup = () -> list.build()
                .filter(a -> a instanceof  Handwerker);
*/

        System.out.println(list.build().filter(s -> s instanceof Handwerker).count());


       // sup.get().forEach(System.out::println);

    }



}