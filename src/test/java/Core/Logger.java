package Core;

import org.testng.Reporter;

public class Logger {


    public void logTestTitle(String message)
    {
        System.out.println(message);
        Reporter.log(  "<h1 style=\"font-size:20px\"> "+message+ "</h1></br>") ;
    }


    public void logStepMessage(String log) {
        System.out.println(log);
        Reporter.log(log + "<br>");
    }

    public void logStepResult(String result) {
        System.out.println("Result : " + result);
        if (result.equals("passed")) {
            Reporter.log("<h4 style=\"color:green;\">Passed</h4>");

        } else if (result.equals("failed"))
            Reporter.log("<h4 style=\"color:red;\">Failed</h4>");
        {

        }


    }

}
