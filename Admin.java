
/**
 * Admin Class describing key attributes of a customer.
 */
public class Admin extends User
{
   String firstName;
   String lastName;
   String emailAddress;
   String phoneNumber;
   String Password;
   String user;
   public Admin(String firstName,String lastName,String emailAddress, String phoneNumber){
        //super(firstName,lastName,emailAddress,phoneNumber);
        this.firstName=firstName;
        this.lastName=lastName;
        this.emailAddress=emailAddress;
        this.phoneNumber=phoneNumber;
        this.user="ADMIN";
   }
   
   
   /**
    * Get customer first name
    * @return    the firstname of customer
   */
    public String getFname(){
        return firstName;
    }
   
   /**
    * Get customer last name
    * @return    the firstname of customer
   */
   public String getLname(){
        return lastName;
   }
   
   
   /**
    * Get admin email address
    * @return    the firstname of customer
   */
   public String emailAddress(){
        return emailAddress;
   }
   
   /**
    * Get admin phone number
    * @return    the firstname of customer
   */
   public String getPhoneNum(){
        return phoneNumber;
   }
   
   public void setPassword(String pass){
        this.password=pass;
   }
   
   public String getUserType(){
       return user;
   }
    
}
