import java.util.ArrayList;

public class AverageDoubleLists {

    // write out these too
    public int count(ArrayList<Double> aa) {
        return aa.size();
    }
    public Double sum(ArrayList<Double> aa) {
        double sum = 0;
        for (int i = 0; i < aa.size(); i++){
            sum += aa.get(i);
        }

        return sum;
    }
    public Double average(ArrayList<Double> aa) {
        double sum = 0.0;

        if(aa.size() != 0){
            for(int i = 0; i < aa.size(); i++){
                sum += aa.get(i);
            }
            return Math.round((sum/aa.size()) * 10.0)/10.0;
        }

        return 0.0;
    }

}
