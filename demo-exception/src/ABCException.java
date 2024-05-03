public class ABCException extends RuntimeException {
  //extends Runtime Exception implies ABCException is a run-time Exception
  // compiler would not check if you have handled the exception
  public static void main(String[] args) {
    checkName("Vincent", "Vincent");
  }
  
  public static String checkName(String firstName, String lastName){
    if(firstName != null || lastName !=null){
      throw new IllegalArgumentException();
    } if(firstName.length() + lastName.length() > 10){
      throw new ABCException();
    }
    return firstName.concat(" ").concat(lastName);
  }
}
