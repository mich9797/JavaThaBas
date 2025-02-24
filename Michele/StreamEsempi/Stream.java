import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class Stream{
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        List<Integer> evenNumbers = numbers.stream()
                                .filter(n -> n % 2 == 0)  // filtro per numeri pari
                                .collect(Collectors.toList());   // colleziono il risultato in una lista

        System.out.println(evenNumbers);

//----------------------------------------------------------------------------------------------------------

        List<String> names = Arrays.asList("Alice","Bob","Charlie");

        List<Integer> nameLength = names.stream()
                                .map(String::length)  //applica il metodo string.length() sul contenuto dello stream
                                .collect(Collectors.toList());

        System.out.println(nameLength);

//----------------------------------------------------------------------------------------------------------

        // List listNumbers = Arrays.asList(
        //     Arrays.asList(1,2),
        //     Arrays.asList(3,4,5),
        //     Arrays.asList(6)
        // );

        // List flatList = listNumbers.stream()
        //                         .flatMap(List::stream)
        //                         .collect(Collectors.toList());

        // System.out.println(flatList);

//----------------------------------------------------------------------------------------------------------

        List<String> words = Arrays.asList("ciao","come","stai");

        String concatenata = words.stream()
                                .collect(Collectors.joining(" "));  //uniscce gli elementi dello stream e li separa da uno spazio ( in questo caso )
        
        System.out.println(concatenata);
    
//----------------------------------------------------------------------------------------------------------

        List numeri = Arrays.asList(1,2,3,4);

        numbers.stream()
                .forEach(num -> System.out.print(num + " "));  // operazione terminale. per ogni elemento stampo elemento stesso seguito da spazio
        
        System.out.println();

//----------------------------------------------------------------------------------------------------------

        List<Integer> num = Arrays.asList(1,2,3,4,5);

        int somma = num.stream()
                        .reduce(0, (a,b) -> a + b);  //reduce prende gli elementi in coppia e ci applica la formula che vogliamo noi ( in questo caso sommo due elementi )
                                                    // lo 0 è il punto di partenza per la nostra somma

        System.out.println(somma);

//----------------------------------------------------------------------------------------------------------

        List<String> nomi = Arrays.asList("Alice","Charlie","Bob");

        List nomiOrdinati = nomi.stream()
                                .sorted()          // ordina in ordine naturale gli elementi dello stream
                                .collect(Collectors.toList());

        System.out.println(nomiOrdinati);

//----------------------------------------------------------------------------------------------------------

        List<Integer> altriNumeri = Arrays.asList(1,2,3,3,4,5);

        List distinctNumeri = altriNumeri.stream()
                                    .distinct()   // legge tutti gli elementi di stream ma tiene solo un elementi nel caso trovasse doppioni dello stesso
                                    .collect(Collectors.toList());

        System.out.println(distinctNumeri);

//----------------------------------------------------------------------------------------------------------

        List altriNomi = Arrays.asList("Alice","Bob","Charlie");

        long conta = altriNomi.stream()
                            .count(); //conta gli elementi di stream. è un'operazione terminale

        System.out.println(conta);

//----------------------------------------------------------------------------------------------------------

        List<Integer> nume = Arrays.asList(5,4,3,8,1);

        Optional max = nume.stream()  //uso optional perchè c'è la possibilità che non torni nessun elementi.   cosi evito di trattare il caso di nessun elemento trovato
                    .max(Integer::compareTo);  //trova il massimo tra gli elementi 
                                            // mini()  per trovare il minimo
        System.out.println(max);

//----------------------------------------------------------------------------------------------------------

        List<Integer> numer = Arrays.asList(1,2,3,4,5);

        boolean any = numer.stream().anyMatch(n -> n % 2 == 0);  //true    almeno un elemento corrisponde alla ricerca   (c'è uno pari)
        boolean all = numer.stream().allMatch(n -> n % 2 == 0);  //false   tuttgli gli elementi corrispondono alla ricerca  (tutti sono pari -- non è vero)
        boolean none = numer.stream().noneMatch(n -> n % 2 == 0);//false   nessun elemento corrisponde alla ricerca   (nessuno è pari -- non è vero)

        System.out.println(any + " " + all + " " + none);

//----------------------------------------------------------------------------------------------------------

        List<Integer> numnum = Arrays.asList(1,2,3,4,5);

        Optional first = numnum.stream()
                                .filter(n -> n % 2 == 0) 
                                .findFirst();    //ritorna il primo elemento trovato dopo che ho applicato il filtro
        
        System.out.println(first);

        Optional anyNum = numnum.stream()
                                .filter(n -> n % 2 == 0)
                                .findAny();  //ritorna un elemento trovato dopo che ho apllicato il filtro.     non mi torna tutti gli elementi

        System.out.println(anyNum);

//----------------------------------------------------------------------------------------------------------

        List<Integer> meri = Arrays.asList(1,2,3,4,5);

        List limited = meri.stream()
                            .limit(3)   // imposto un limite di elementi che volgio raccogliere
                            .collect(Collectors.toList());

        System.out.println(limited);


        List skipped = meri.stream()
                            .skip(2)   // scelgo quanti elementi voglio skippare.   in questo caso perdo i primi due elementi dello stream
                            .collect(Collectors.toList());

        System.out.println(skipped);

//----------------------------------------------------------------------------------------------------------

        // List<Person> people = Arrays.asList(
        //     new Person("Alice", 25),
        //     new Person("Bob", 30),
        //     new Person("charlie",25),
        //     new Person("David", 30)
        // );

        // List peopleAge = people.stream()
        //                         .collect(Collectors.groupingBy(Person::getAge));

        // System.out.println(peopleAge);

//----------------------------------------------------------------------------------------------------------

        

    }

    static class Person {
        private String name;
        private int age;
    
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    
        public String getName() {
            return name;
        }
    
        public int getAge() {
            return age;
        }
    }
}