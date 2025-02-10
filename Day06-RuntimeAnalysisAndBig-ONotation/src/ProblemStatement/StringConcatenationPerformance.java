package ProblemStatement;

public class StringConcatenationPerformance {
    public String stringConcatenation(String str, int size){
        for(int i = 0; i < size; i++){
            str += "Hello";
        }
        return str;
    }

    public String stringBuilder(String str, int size){
        StringBuilder stringBuilder = new StringBuilder(str);
        for(int i = 0; i < size; i++) {
            stringBuilder.append("Hello");
        }
        return stringBuilder.toString();
    }

    public String stringBuffer(String str, int size) {
        StringBuffer stringBuffer = new StringBuffer(str);
        for (int i = 0; i < size; i++) {
            stringBuffer.append("Hello");
        }
        return stringBuffer.toString();
    }


    public static void main(String[] args) {
        StringConcatenationPerformance scp = new StringConcatenationPerformance();
        String str = "Hello";
        long sTime,eTime,result;

        // For one thousand data.
        sTime = System.nanoTime();
        scp.stringConcatenation(str,1000);
        eTime = System.nanoTime();
        result = (eTime - sTime)/1000000;
        System.out.println("Total time "+ result +" ms taken by string while concatenating "+1000);


        sTime = System.nanoTime();
        scp.stringBuilder(str,1000);
        eTime = System.nanoTime();
        result = (eTime - sTime)/1000000;
        System.out.println("Total time "+ result +" ms taken by stringBuilder while concatenating "+1000);

        sTime = System.nanoTime();
        scp.stringBuffer(str,1000);
        eTime = System.nanoTime();
        result = (eTime - sTime)/1000000;
        System.out.println("Total time "+ result +" ms taken by stringBuffer while concatenating "+1000);
        System.out.println();

        // For ten thousand data.
        sTime = System.nanoTime();
        scp.stringConcatenation(str,10000);
        eTime = System.nanoTime();
        result = (eTime - sTime)/1000000;
        System.out.println("Total time "+ result +" ms taken by string while concatenating "+10000);

        sTime = System.nanoTime();
        scp.stringBuilder(str,1000);
        eTime = System.nanoTime();
        result = (eTime - sTime)/1000000;
        System.out.println("Total time "+ result +" ms taken by stringBuffer while concatenating "+10000);

        sTime = System.nanoTime();
        scp.stringBuffer(str,10000);
        eTime = System.nanoTime();
        result = (eTime - sTime)/1000000;
        System.out.println("Total time "+ result +" ms taken by stringBuilder while concatenating "+10000);
        System.out.println();

        // For one lakh data.
        sTime = System.nanoTime();
        scp.stringConcatenation(str,100000);
        eTime = System.nanoTime();
        result = (eTime - sTime)/1000000;
        System.out.println("Total time "+ result +" ms taken by string while concatenating "+100000);

        sTime = System.nanoTime();
        scp.stringBuilder(str,100000);
        eTime = System.nanoTime();
        result = (eTime - sTime)/1000000;
        System.out.println("Total time "+ result +" ms taken by stringBuilder while concatenating "+100000);

        sTime = System.nanoTime();
        scp.stringBuffer(str,100000);
        eTime = System.nanoTime();
        result = (eTime - sTime)/1000000;
        System.out.println("Total time "+ result +" ms taken by stringBuffer while concatenating "+100000);

    }
}
