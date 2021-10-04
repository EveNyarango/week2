
public abstract class Trade {
    int dividend;
    int[] values = new int[5];
    char[] array = {'a', 'b', 'c','d','e'};


    public Trade(int dividend){
        this.dividend = dividend;
    }

    abstract void calcDividend();

    
}

 class BondsTrade extends Trade {

     public BondsTrade(int dividend) {
         super(dividend);
     }

     @Override
     void calcDividend() {

     }


 }


 class  FundTrade extends Trade {

     public FundTrade(int dividend) {
         super(dividend);
     }

     @Override
     void calcDividend() {

     }
 }


