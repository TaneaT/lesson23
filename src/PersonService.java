import java.util.ArrayList;
import java.util.List;

public class PersonService {

public Person createPerson(String firstName, String lastName, int age){
    Person person = null;

    try{
        person = new Person(firstName,lastName, age);

    } catch(InvalidNameException e) {
        System.out.println(e.getMessage());
    } catch (InvalidAgeException e) {
        System.out.println(e.getMessage());
    } catch (Exception e){
        System.out.println(e.getMessage());
    }
   return person;
}

public List<Person> getAllPeople() throws InvalidNameException{
    List<Person> person = null;

    try{
        person = new ArrayList<>();
        person.add(new Person("Ion","Jalba", -1));
        person.add(new Person("Vasile","Popa", 21));
        person.add(new Person("Mihail","Rotaru", 32));
        person.add(new Person("Lena","Nedelcu", 29));
    }catch (InvalidNameException e){
        System.out.println(e.getMessage());
    } catch (InvalidAgeException e){
        System.out.println(e.getMessage());
    } catch (Exception e){
        System.out.println(e.getMessage());
    }
    return person;
}


public void printPerson(List<Person> person){
    for (Person p : person){
        System.out.println(p);
    }
}


}
