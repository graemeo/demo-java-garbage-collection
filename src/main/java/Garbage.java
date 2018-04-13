import java.io.BufferedReader;
import java.io.FileReader;

public class Garbage
{
    public static void main(String[] args) throws Exception {
        System.out.println("This is garbage!");
 
        for (int i=0; i<10000; i++) {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            Thread.sleep(10);
        }

        System.out.println("Putting it to sleep");
        Thread.sleep(100000000);
    }
}
