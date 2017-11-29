
/**
 * Write a description of class User here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class User
{
   protected String firstName;
   protected String lastName;
   protected String emailAddress;
   protected String phoneNumber;
   protected String password;
   
   public void Customer(String firstName,String lastName,String emailAddress, String phoneNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.emailAddress=emailAddress;
        this.phoneNumber=phoneNumber;
   }
   
   public abstract void setPassword(String password);
   
   public abstract String getUserType();
   
}
