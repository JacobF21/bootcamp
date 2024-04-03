public class readingChallenge {
    public static void main(String[] args) {
      String name ="VenturenixLAB, Java";
      System.out.println(name.charAt(0));// "V"
      System.out.println(name.charAt(2));//"n"

      System.out.println(name.indexOf('V'));//0
      System.out.println(name.indexOf("r"));//5
      System.out.println(name.indexOf("LAB"));//10

      System.out.println("    ab c     ".trim());//"ab c"

      System.out.println(name.replace("Java","Develpoper"));//"VenturenixLAB, Developer"
      System.out.println(name.length()); //19

      System.out.println(name.substring(2, 4));//"nt"

      System.out.println(name.toLowerCase());//"venturenixlab, java"
      System.out.println(name.toUpperCase());//"VENTURENIXLAB, JAVA"

      System.out.println(name.replaceAll("E", "*").toUpperCase().concat("!!!"));//"VENTURENIXLAB, JAVA!!!"
    }
}
