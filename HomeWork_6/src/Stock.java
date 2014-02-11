
public class Stock {

    private String symbol = "";
    private String name = "";
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(){
    
        }
    
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    
    public void setPreviousClosingPrice(double previousClosingPrice){
        this.previousClosingPrice = previousClosingPrice;
    }
        public double getPreviousClosingPrice(){
        return this.previousClosingPrice;
    }
    
    public void setCurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }
    
    public double getCurrentPrice(){
        return this.currentPrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public double getChangePercent(){
       double percentChange = 100 * (currentPrice / previousClosingPrice) - 100;
       return percentChange;
    }
    
    
} // end of Stock class
