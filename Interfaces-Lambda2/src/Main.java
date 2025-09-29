<<<<<<< HEAD
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws Exception {

        List<User> users = List.of( new User("Maria", 21),
                                    new User("João", 32),
                                    new User("Eduardo", 40),
                                    new User("Ana", 19)
        );
        // Primeiro método
        //users.forEach(System.out::println);

        // Segundo método
        printStringValue(Record::toString, users);
        
    }

    // Parte do segundo método
    private static void printStringValue(Function<User, String> callback, List<User> users){
        users.forEach(u -> System.out.println(callback.apply(u)));            
    }
}
=======
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws Exception {

        List<User> users = List.of( new User("Maria", 21),
                                    new User("João", 32),
                                    new User("Eduardo", 40),
                                    new User("Ana", 19)
        );
        // Primeiro método
        //users.forEach(System.out::println);

        // Segundo método
        printStringValue(Record::toString, users);
        
    }

    // Parte do segundo método
    private static void printStringValue(Function<User, String> callback, List<User> users){
        users.forEach(u -> System.out.println(callback.apply(u)));            
    }
}
>>>>>>> 00ab5e22d02e22bf2f71b1d816f58ab1ea308ca1
