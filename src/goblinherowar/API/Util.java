
package goblinherowar.API;

public class Util {
    private int a;
    public static void wait(double t){
        try {
            long ms = (long)t*1000;
            Thread.sleep(ms);
            return;
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
}
