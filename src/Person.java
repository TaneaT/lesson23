public class Person {


    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) throws InvalidNameException {
        if(firstName!=null || lastName != null){
        this.firstName = firstName;
        this.lastName = lastName;
        } else throw new InvalidNameException("Write your name!");
        if (age > 0){
        this.age = age;
        } else throw new InvalidAgeException("Invalid age!");
    }

//    public void checkName()  {
//        if (getFirstName()==null || getLastName()==null){
//            try {
//                throw new InvalidNameException("Please write you name!");
//            } catch (InvalidNameException e){
//                e.getMessage();
//            }
//        }
//    }

//    public void tryCheckName(){
//        try{
//            checkName();
//        } catch (InvalidNameException e){
//            e.getMessage();
//        }
//    }

//    public void checkAge(){
//        if (getAge() < 0) {
//            try{
//            throw new InvalidAgeException("Invalid age!");
//            } catch (InvalidAgeException e){
//                e.getMessage();
//            }
//        }
//    }

//    public void tryCheckAge(){
//        try{
//            checkAge();
//        } catch (InvalidAgeException e){
//            e.getMessage();
//        }
//    }

    @Override
    public String toString() {
        return " Name: " + firstName + " " + lastName + "\n" +
                " Age: " + age + "\n";
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
