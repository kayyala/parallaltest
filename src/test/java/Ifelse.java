import org.testng.annotations.Test;

/**
 * Created by Sudhakar on 25/07/2017.
 */
public class Ifelse {
    @Test
    public void ifelseifDemo(){
        String Browser ="ie";
        if (Browser.equalsIgnoreCase("Firefox")){
            System.out.println("this will print firefox");

        }
        else if(Browser.equalsIgnoreCase("Chrome")) {
            System.out.println("this will start chrome");

        }
        else if (Browser.equalsIgnoreCase("IE")) {
            System.out.println("this will start IE");
        }
        else if(Browser.equalsIgnoreCase("IPHONE")) {
            System.out.println("this will start IPHONE");

        }else  {
            System.out.println("this will start nothing");

        }
        System.out.println("test is end");

    }
}
