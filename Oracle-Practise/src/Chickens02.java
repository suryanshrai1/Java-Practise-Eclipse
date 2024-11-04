public class Chickens02 {
    public static void main(String[] args) {
    	 // Daily egg collection
        int eggsMonday = 100;
        int eggsTuesday = 121;
        int eggsWednesday = 117;

        // Calculate total eggs collected
        int totalEggs = eggsMonday + eggsTuesday + eggsWednesday;

        // Calculate daily average
        double dailyAverage = totalEggs / 3.0;

        // Calculate expected monthly average for 30 days
        double monthlyAverage = dailyAverage * 30;

        // Calculate monthly profit at $0.18 per egg
        double profitPerEgg = 0.18;
        double monthlyProfit = monthlyAverage * profitPerEgg;

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
