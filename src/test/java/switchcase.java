import org.testng.annotations.Test;

/**
 * Created by Sudhakar on 25/07/2017.
 */
public class switchcase {
    @Test
    public  void main() {

        String Browser = "ravi";
        switch (Browser) {
            case "sudhakar":
                System.out.println("PRINT SUDHAR");
                break;
            case "ravi":
                System.out.println("PRINT ravi");
                break;
            case "manu":
                System.out.println("PRINT manu");
                break;
default:
    System.out.println("PRINT nothing");

        }
    }
}
