
import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Nr5 {


    public static void main(String[] args) {


        Supplier<IntStream> intStreamSupplier =() -> IntStream.range(100,200).filter(x -> x%2 == 0 );

        intStreamSupplier.get().sum(System.out::println);







    }
}
