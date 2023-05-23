public class Person {
    
    String name;
    String lastName;
    boolean isMurdered;

    public Person(){
         name = null;
         lastName = null;
        isMurdered = false;
    }

    public Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
        this.isMurdered = false;
    }


    public String getFullName(){
        return name + " " + lastName;
    }

}
