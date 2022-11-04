public class AverageDoubleArrays {


// Complete these methods

    public int count(double[] aa) {
        return aa.length;
    }

    public double sum(double[] aa) {
        double sum = 0;

        for(int i = 0; i < aa.length; i++){
            sum += aa[i];
        }

        return sum;
    }

    public double average(double[] aa) {
        double sum = 0;

        if(aa.length != 0){
            for(int i = 0; i < aa.length; i++){
                sum += aa[i];
            }
            return sum/aa.length;
        }
        return 0;
    }

}
