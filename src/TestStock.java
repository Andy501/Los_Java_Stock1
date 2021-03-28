/**
 * Annias Scott
 * March 25, 2021
 * Assignment 6
 *
 * Program creates a Stock object with fields that
 * determine Ticker Symbol, Company Name, Previous Stock Closing Price
 * and Current Stock Price.
 *
 * Returns a calculation of the percentage change between Previous Stock Closing Price and
 * Current  Stock Price.
 */


public class TestStock {
    public static void main(String[] args){
        Stock oracle = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
        System.out.println(oracle.getStocks());//returns Stock's name and Stocks symbol
        System.out.println("Previous Closing Price: "+oracle.getPreviousClosingPrice());
        System.out.println("Current Price: "+oracle.getCurrentPrice());
        System.out.println("Price Change: "+oracle.getPercentageChanged()+"%");
    }
}
