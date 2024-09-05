/**
 *
 * @author Rakhuzhuwo Sapruna(A00455075)
 */
public class MonthlyPrecipitation {
    public static final int DEF_NUM_DAYS = 31;
    
    //instance variale
    private String monthName;
    private double [] pctVals;
    public MonthlyPrecipitation(String month, double[] precipitation){
        monthName = month;
        if (precipitation.length < DEF_NUM_DAYS){
            for(int i = 0; i < DEF_NUM_DAYS; i++){
                this.pctVals[i] = precipitation[i];
            }
        }    
        for(int i = 0; i < DEF_NUM_DAYS; i++){
            this.pctVals[i] = precipitation[i];
        }
    }
    public MonthlyPrecipitation(String month){
        monthName = month;
        this.pctVals = new double[DEF_NUM_DAYS];
        //pctVals = Double.NaN
    }
}

    