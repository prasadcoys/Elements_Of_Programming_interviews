package C_0;

public class StockAdvice
{

    private  int buyPrice;
    private  int sellPrice;

    public StockAdvice(int buyPrice, int sellPrice)
    {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public int getBuyPrice()
    {
        return buyPrice;
    }

    public int getSellPrice()
    {
        return sellPrice;
    }
}
