package ProblemStatement.StringBuffer;

public class ConcateStringUsingStringBuffer {
    public String concateString(String[] array){
        StringBuffer stringBuffer = new StringBuffer("Sanjay");
        stringBuffer.append(" ");
        for(String s : array){
            stringBuffer.append(s);
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        ConcateStringUsingStringBuffer concateStringUsingStringBuffer = new ConcateStringUsingStringBuffer();
        String[] array = {"Rajpoot"};
        String store = concateStringUsingStringBuffer.concateString(array);
        System.out.println(store);

    }
}
