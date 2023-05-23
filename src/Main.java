import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static PersonService personService;
    public static void main(String[] args) throws InvalidNameException {

//try{
//    Person person =  personService.createPerson("w","q",-1);

//    List<Person> personList = personService.getAllPeople();
//    personService.printPerson(personList);
//} catch (InvalidNameException e){
//    System.out.println(e.getMessage());
//} catch (InvalidAgeException e){
//    System.out.println(e.getMessage());}
//}catch (Exception e){
//    System.out.println(e.getMessage());
//        }


      Media<String> books = new Media<>();
      books.addBook("Book1");
      books.addBook("Book2");
      books.addBook("Book3");

        System.out.println(books.getBook(0));


        Media<String> video = new Media<>();
        video.addVideo("vid1");
        video.addVideo("vid2");
        video.addVideo("vid3");

        video.getAllVideo();
        video.works();
    }
}
