public class Chickens01 {
    public static void main(String[] args) {
    	 // First scenario
        int eggsPerChicken = 5;
        int chickenCount = 3;
        int totalEggs = 0;

        // Monday
        totalEggs += eggsPerChicken * chickenCount;

        // Tuesday (gains 1 chicken)
        chickenCount += 1;
        totalEggs += eggsPerChicken * chickenCount;

        // Wednesday (wild beast eats half the chickens)
        chickenCount /= 2;
        totalEggs += eggsPerChicken * chickenCount;

        // Print the result for the first scenario
        System.out.println(totalEggs);

        // Second scenario
        eggsPerChicken = 4;
        chickenCount = 8;
        totalEggs = 0;

        // Monday
        totalEggs += eggsPerChicken * chickenCount;

        // Tuesday (gains 1 chicken)
        chickenCount += 1;
        totalEggs += eggsPerChicken * chickenCount;

        // Wednesday (wild beast eats half the chickens)
        chickenCount /= 2;
        totalEggs += eggsPerChicken * chickenCount;

        System.out.println(totalEggs);
    }   
}
