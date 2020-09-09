//I worked on the homework assignment alone, using only course materials.

public class StringOperations{
  public static void main(String args[]) {
    String str = "Rohit Arunachalam";
    System.out.println(str);
    str = "A" + str.substring(1,str.length());
    str = str.substring(0,str.length()-1)+"Z";
    System.out.println(str);
    String url = "www.gatech.edu";
    System.out.println(url);
    String array[] = url.split("\\.");
    System.out.println(array[1].concat("1331"));
  }
}
