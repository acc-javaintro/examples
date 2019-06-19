/**
    Write a Java program called CoinToss to simulate, say, 10,000 flips of a coin,
    and display the results. Run the program a few times to make sure that the number
    of heads and tails are about even overall. Otherwise, we can't trust the random
    number generator.
    
    To generate a random number, consider Math.random(), which returns a number between
    0.0 inclusive and 1.0 exclusive. That means it could be zero exactly and really
    close to but never one.

    To scale the number to a specific consecutive range, multiply by the upper bounds
    you desire and add the lower bounds. For instance, to get a number between 1 and 20,

    1 + (int)(Math.random() * 20)
    The multiplier gets you a double between 0.0 and 19.999999. The cast to integer
    truncates the floating-point portion, leaving 0 to 19. Adding 1 gives us 1 to 20.
 */
public class CoinToss {

    public static void main(String[] args) {
        int heads = 0, tails = 0;

        for (int flips = 0; flips < 10_000; flips++) {
            int flip = (int) (Math.random() * 2);
            if (flip == 0) {
                heads++;
            } else {
                tails++;
            }
        }

        System.out.printf("heads: %d\ntails: %d\n", heads, tails);
    }
    
}
