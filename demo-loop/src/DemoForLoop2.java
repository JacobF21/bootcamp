public class DemoForLoop2 {
  public static void main(String[] args){
    //Single Loop
    for(int i =0;i<5;i++){
      //System.out.print("*");
    }

    //Nest Loop
    for(int i=0; i<3;i++){
      for(int j=0; j<2; j++){
        //System.out.println("i="+i+", j="+j);
      }
    }

    //*****
    //****
    //***
    //**
    //*
    int n =5;
    for(int i=n;i>0;i--){
      String temp="";
      for(int j =0;j<n;j++){
        temp+="*";
      }
      n--;
      System.out.println(temp);
    }
    //Homework
    //.....*
    //....***
    //...*****
    //..*******
    // *********
    //..*******
    //...*****
    //....***
    //.....*
    int number = 5;


    //Searching
    String str2 ="abcdfeg hello world!";
    //Find the index of the second of space space characher.If exist, print the index, if no, print N/A
    int count=0;
    for(int i =0;i<str2.length();i++){
      if(str2.charAt(i)==' ' && ++count == 2){
        //count++;
          System.out.println("2nd space exist, is at index: "+i);
          break;
      }
    }
    if(count<2){
      System.out.println("N/A");
    }


      //break;
      for (int i=0;i<10;i++){
        if(i>3){
          break;
        }
        //System.out.println("hello");
      }

    //continue
    for(int i =0;i<10;i++){
      System.out.println("abc");
      if(i<3){
        continue;
      }
      System.out.println("hello");
    }

  }
}
