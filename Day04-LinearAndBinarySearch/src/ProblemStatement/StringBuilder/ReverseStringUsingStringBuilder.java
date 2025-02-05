package ProblemStatement.StringBuilder;

public class ReverseStringUsingStringBuilder {
    public String reverse(){
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
      ReverseStringUsingStringBuilder reverseStringUsingStringBuilder = new ReverseStringUsingStringBuilder();
      String s = reverseStringUsingStringBuilder.reverse();
      System.out.println(s);
    }
}
