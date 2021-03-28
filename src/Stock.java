public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;



    //Constructor method for Stock object
    public Stock(String sym, String nme, double preClose, double curPr){
        symbol=sym;
        name = nme;
        previousClosingPrice = preClose;
        currentPrice = curPr;

    }


    public String getStocks(){
        return "Stock Ticker: "+ symbol.toUpperCase() + "\nCompany Name: " + name;
    }

    public double getPreviousClosingPrice(){

        return previousClosingPrice;
    }

    public double getCurrentPrice(){
        return currentPrice;
    }

    /**
     * method calculates percentage change in price of @previousClosingPrice vs @currentPrice
     */
    public double getPercentageChanged(){

        return 100*((currentPrice-previousClosingPrice)/previousClosingPrice);
    }

}



