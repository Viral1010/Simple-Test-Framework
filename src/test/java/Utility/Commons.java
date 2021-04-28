package Utility;

import org.testng.Reporter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Commons {


    public Properties readConfigFile(String configFile) {
        Properties prop = null;

        try (InputStream input = new FileInputStream(new File("src/test/java/Config/" + configFile + ".properties").getAbsolutePath())) {

            prop = new Properties();

            prop.load(input);


        } catch (IOException ex) {
            ex.printStackTrace();
        }


        return prop;
    }

    public static void pause(int sec) {
        try {
            Thread.sleep(1000 * sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



}
