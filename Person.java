public class Person {
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String gender;
    
    public Person(String f, String m, String l, String g){
        firstName = f;
        middleInitial = m;
        lastName = l;
        gender = g;
    }
    
    public String toString(){
        return String.format("%s %s %s %s", firstName, middleInitial, lastName, gender);
    }
}