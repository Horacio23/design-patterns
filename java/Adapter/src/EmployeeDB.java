/**
 * Created by Horacio on 7/16/2016.
 */
public class EmployeeDB implements Employee{
    private String id;
    private String firstName;
    private String lastName;
    private String email;

    public EmployeeDB(String id, String firstName, String lastName, String email){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    public String getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public String getEmail() {
        return email;
    }

    @Override
    public String toString(){
        return "ID: "+id+ " First name: "+firstName+" Last name: "+lastName+" Email: "+email;
    }
}
