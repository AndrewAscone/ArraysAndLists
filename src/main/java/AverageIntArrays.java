public class AverageIntArrays {

// Complete these methods

    public int count(int[] aa) {
        return aa.length;
    }

    public int sum(int[] aa) {
        int sum = 0;
        for(int i = 0; i < aa.length; i++){
            sum += aa[i];
        }
        return sum;
    }

    public int average(int[] aa) {
        int sum = 0;
        int average = 0;

        if(aa.length != 0) {
            for (int i = 0; i < aa.length; i++) {
                sum += aa[i];
            }
            return sum/aa.length;
        }
        return 0;
    }

}
