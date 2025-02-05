package ProblemStatement.StringBuffer;

public class CompareStringBufferAndBuilder {
    public void comparePerformance(){
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        long sTime, eTime,totalTime;

        sTime = System.nanoTime();
        for(int i = 0; i < 1000000; i++){
            stringBuilder.append("Hello");
        }
        eTime = System.nanoTime();

        totalTime = eTime - sTime;
        System.out.println("StringBuilder performance while adding string: "+totalTime);

        sTime = System.nanoTime();
        for(int i = 0; i < 1000000; i++){
            stringBuffer.append("Hello");
        }
       eTime = System.nanoTime();

        totalTime = eTime - sTime;
        System.out.println("StringBuffer performance while adding string: "+totalTime);

    }
    public static void main(String[] args) {
        CompareStringBufferAndBuilder compareStringBufferAndBuilder = new CompareStringBufferAndBuilder();
        compareStringBufferAndBuilder.comparePerformance();
    }
}
