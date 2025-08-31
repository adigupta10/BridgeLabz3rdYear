package Level1;
public class Question4 {
    public static void main(String[] args) {
        double costprice=129;
        double sellingprice=191;
        double profit=sellingprice-costprice;
        double profitpercentage=(profit/costprice)*100;
        System.out.print("The Cost Price is INR " + costprice + " and Selling Price is INR " + sellingprice + "\n" +
            "The Profit is INR " + profit + " and the Profit Percentage is " + profitpercentage + "%");
    }
}
