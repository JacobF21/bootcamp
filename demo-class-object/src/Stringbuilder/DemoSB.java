package Stringbuilder;

public class DemoSB {
  public static void main(String[] args) {
    
  String s1="abc";
  String s2="def";
  String result =s1 +s2;
  String result2 =s1.concat(s2); //concat() -> return new String

  StringBuilder sb1=new StringBuilder();//""
  System.out.println(sb1.toString());//

  StringBuilder sb2 = new StringBuilder("Hello");
  System.out.println(sb2.toString());

  StringBuilder sb3=sb2.append(" world");
  System.out.println("sb2=" + sb2.toString());
  System.out.println("sb3=" + sb3.toString());

  sb2.append("!!!");
  System.out.println(sb2.toString());

  String[] strings =new String[] {"aaa","bbb","ccc"};
  StringBuilder sbDemo = new StringBuilder();
  //for(int i=0;i<string2.length;i++){
  //  sbDemo.append(string2[i]);
  //}
  for(String s:strings){
    sbDemo.append(s);
  }
  System.out.println(sbDemo.toString());//aaabbbccc
  //insert
  sbDemo.insert(6,"ddd");
  System.out.println(sbDemo);
  System.out.println(sbDemo.replace(0,3,"hhh").append("aaa")); //chain method

  //sbDemo.deleteCharAt(3);
  System.out.println(sbDemo);
  sbDemo.setCharAt(2, 'G');
  System.out.println(sbDemo);
  sbDemo.replace(0, 3, "!!");
  System.out.println(sbDemo);
  String result10 = sbDemo.toString().replace("!","?");

  StringBuilder sb5= new StringBuilder("mmm");
  StringBuilder sb6 = new StringBuilder("mmm");
  String s ="mmm";
  if(sb5.compareTo(sb6)==0){
    System.out.println("they are equal");
  }

  if(sb5.toString().equals(s)){
    System.out.println("they are equal");
  }

  }
}
