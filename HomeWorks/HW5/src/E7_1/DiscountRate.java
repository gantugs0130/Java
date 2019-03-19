package E7_1;

public class DiscountRate {
    private double serviceDiscountPremium = 0.2;
    private double serviceDiscountGold = 0.15;
    private double serviceDiscountSilver = 0.1;
    private double productDiscountPremium = 0.1;
    private double productDiscountGold = 0.1;
    private double productDiscountSilver = 0.1;
    public static double getServiceDiscountRate(String type){
        double a = 0;
        switch (type){
            case "Premium":
                a = 0.2;
                break;

            case "Gold":
                a = 0.15;
                break;
            case "Silver":
                a = 0.1;
                break;
        }
        return a;
    }

    public static double getProductDiscountRate(String type){
        double a = 0;
        switch (type){
            case "Premium":
                a = 0.1;
                break;

            case "Gold":
                a = 0.1;
                break;
            case "Silver":
                a = 0.1;
                break;
        }
        return a;
    }
}

