
import javax.swing.JOptionPane;

// Tyler Coatsworth 12/6/2013
public class eight_two {

    public static void main(String[] args) {

        String stockSymStr1 = JOptionPane.showInputDialog("Enter in the symbol of stock1: ");

        String stockNameStr1 = JOptionPane.showInputDialog("Enter in the name of stock1: ");

        JOptionPane.showMessageDialog(null, "stock1: " + stockSymStr1 + "   " + stockNameStr1);

        String stockSymStr2 = JOptionPane.showInputDialog("Enter in the symbol of stock2: ");

        String stockName2 = JOptionPane.showInputDialog("Enter in the name of stock2: ");

        JOptionPane.showMessageDialog(null, "stock2: " + stockSymStr2 + "   " + stockName2);

        String stockSymStr3 = JOptionPane.showInputDialog("Enter in the symbol of stock3: ");

        String stockName3 = JOptionPane.showInputDialog("Enter in the name of stock3: ");

        JOptionPane.showMessageDialog(null, "stock3: " + stockSymStr3 + "   " + stockName3);


        Stock stock1 = new Stock(stockSymStr1, stockNameStr1);
        Stock stock2 = new Stock(stockSymStr2, stockName2);
        Stock stock3 = new Stock(stockSymStr3, stockName3);

        String pcp1Str = JOptionPane.showInputDialog("what is the previous closing price for: " + stockNameStr1);
        stock1.setPreviousClosingPrice(Double.parseDouble(pcp1Str));// = Double.parseDouble(pcp1Str);
        String cp1Str = JOptionPane.showInputDialog("what is the current price for: " + stockNameStr1);
        stock1.setCurrentPrice(Double.parseDouble(cp1Str));

        String pcp2Str = JOptionPane.showInputDialog("what is the previous closing price for: " + stockName2);
        stock2.setPreviousClosingPrice(Double.parseDouble(pcp2Str));
        String cp2Str = JOptionPane.showInputDialog("what is the current price for: " + stockName2);
        stock2.setCurrentPrice(Double.parseDouble(cp2Str));

        String pcp3Str = JOptionPane.showInputDialog("what is the previous closing price for: " + stockName3);
        stock3.setPreviousClosingPrice(Double.parseDouble(pcp3Str));
        String cp3Str = JOptionPane.showInputDialog("what is the current price for: " + stockName3);
        stock3.setCurrentPrice(Double.parseDouble(cp3Str));

        JOptionPane.showMessageDialog(null, stockNameStr1 + ": \n" + "Previous closing price: " + stock1.getPreviousClosingPrice() + "\n" + "Current price: " + stock1.getCurrentPrice() + "\n" + "Percent change: " + stock1.getChangePercent() + "%");

        JOptionPane.showMessageDialog(null, stockName2 + ": \n" + "Previous closing price: " + stock2.getPreviousClosingPrice() + "\n" + "Current price: " + stock2.getCurrentPrice() + "\n" + "Percent change: " + stock2.getChangePercent() + "%");

        JOptionPane.showMessageDialog(null, stockName3 + ": \n" + "Previous closing price: " + stock3.getPreviousClosingPrice() + "\n" + "Current price: " + stock3.getCurrentPrice() + "\n" + "Percent change: " + stock3.getChangePercent() + "%");

    } // end of the main method
}
