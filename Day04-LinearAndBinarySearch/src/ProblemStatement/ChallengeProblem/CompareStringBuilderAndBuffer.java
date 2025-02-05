package ProblemStatement.ChallengeProblem;

public class CompareStringBuilderAndBuffer {
    public static void main(String[] args) {

        String[] strings = {"Hi!", "I am", "Sanjay", "I am", "Sanjay"};

        // Number of iterations for concatenation
        int iterations = 1_000_000;

        // Measure time for StringBuilder
        long startTimeStringBuilder = System.currentTimeMillis();
        concatenateWithStringBuilder(strings, iterations);
        long endTimeStringBuilder = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (endTimeStringBuilder - startTimeStringBuilder) + " ms");

        // Measure time for StringBuffer
        long startTimeStringBuffer = System.currentTimeMillis();
        concatenateWithStringBuffer(strings, iterations);
        long endTimeStringBuffer = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (endTimeStringBuffer - startTimeStringBuffer) + " ms");
    }

    // Method to concatenate strings using StringBuilder
    private static void concatenateWithStringBuilder(String[] strings, int iterations) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            for (String str : strings) {
                sb.append(str);
            }
        }
    }

    // Method to concatenate strings using StringBuffer
    private static void concatenateWithStringBuffer(String[] strings, int iterations) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            for (String str : strings) {
                buffer.append(str);
            }
        }
    }
}
