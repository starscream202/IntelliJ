package class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropFileHandle {
    public static void main(String[] args) throws IOException {
        //Printing out your baseAddress of my projects
        String baseAddress= System.getProperty("user.dir");
        String fileAddress=System.getProperty("user.dir")+"\\"+"ConfigData.properties";
        System.out.println(baseAddress);
        System.out.println(fileAddress);
        FileInputStream fis= new FileInputStream(fileAddress);
        Properties properties=new Properties();
        //properties.load(fis);
        String username= properties.getProperty("Username");
        System.out.println(username);
        FileOutputStream fos= new FileOutputStream(fileAddress);
        properties.setProperty("Phone Number","%)$&*())^");
        properties.setProperty("Username","2TonydaPony");
        properties.store(fos,"I just jizzed my pants");

    }
}
