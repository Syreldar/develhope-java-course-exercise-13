public class WhileLoop
{
    private static final int TOTAL_HELD_POUNDS = 10_000;
    private static final double MIN_EXCHANGE_RATE = 1.15;
    private static final int POUNDS_SOLD_PER_DAY = 1_000;

    public static void main(String[] args)
    {
        int currentlyHeldPounds = TOTAL_HELD_POUNDS;
        int elapsedDays = 0;

        while (currentlyHeldPounds > 0)
        {
            double todaysExchangeRate = 1 + (Math.random() * 0.2);
            if (todaysExchangeRate > MIN_EXCHANGE_RATE)
                currentlyHeldPounds -= POUNDS_SOLD_PER_DAY;

            elapsedDays++;
        }

        System.out.printf("It took %d days to all all the stored pounds.%n", elapsedDays);
    }
}
