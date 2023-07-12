public class test {

    public static void generatePowerSet(String str) {
        int n = str.length();
        double x=n;
        int totalSubsets = (int) Math.pow(2,x); // Calculate the total number of subsets (2^n)
        System.out.println(totalSubsets);

        for (int i = 0; i < totalSubsets; i++) {
            StringBuilder subset = new StringBuilder();

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.append(str.charAt(j));
                }
            }

            System.out.println(subset.toString());
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Power Set:");
        generatePowerSet(str);
    }
}
