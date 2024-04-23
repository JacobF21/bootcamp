import java.util.Arrays;

public class String1 {

  //Attributes
  private char[] characters;

  //Constructor
  //Empty Constructor (Implicitly exists)
  public String1(){
    this.characters = new char[0];
  };

  public String1(String s){
    this.characters = new char[s.length()];
    for(int i=0;i<s.length();i++){
      this.characters[i] = s.charAt(i);
    }
  };

  public void clear(){
    this.characters = new char[0];
  }

  public String concat(String s){
    char[] newArr = new char[s.length()+this.characters.length];
    int idx =0;
    for(int i = 0;i<this.characters.length;i++){
          newArr[idx++]=this.characters[i];
    }
    for(int j=0;j<s.length();j++){
      newArr[idx++]=s.charAt(j);
  
    }
    return String.valueOf(newArr);
  }

  public void concat2(String s){
    char[] copy =this.characters;
    this.characters = new char[s.length()+this.characters.length];
    for(int i = 0;i<this.characters.length;i++){
        if(i<this.characters.length-s.length()){
          this.characters[i]=copy[i];
          //System.out.println(characters[i]);
        } else if(i<this.characters.length){
          this.characters[i]=s.charAt(i-this.characters.length+s.length());
          //System.out.println(characters[i]);
        } 

    }



  }


  //setter (Instance method)
  //public void setValue(String s){
      //this.characters =new char[s.length()];
      //for(int i=0;i<s.length();i++){
        //this.characters[i] = s.charAt(i);
      //}
  //}
  //getter (instance method)
  public String getValue(){
    //return this.characters;
    String s="";
    for(int i =0;i<this.characters.length;i++){
      //temp+=this.characters[i];
      s=s.concat(String.valueOf(this.characters[i]));
    }
    return s;
  }

  Integer b;
  public String toString(){
    String s="";
    for(int i =0;i<this.characters.length;i++){
      //temp+=this.characters[i];
      s=s.concat(String.valueOf(this.characters[i]));
    }
    return s;
  }

  public static void main(String[] args){
    String1 str = new String1();
    char[] arr = new char[]{'c', 'd', 'e'};
    //str.setValue("cde");
    System.out.println(str.getValue());
    String1 str2 = new String1("hello");
    //System.out.println(str2); // str2.toString
    //System.out.println(str2.concat(" World"));
    System.out.println(str2);
    str2.concat2(" World");
    System.out.println(str2);

  }

}
