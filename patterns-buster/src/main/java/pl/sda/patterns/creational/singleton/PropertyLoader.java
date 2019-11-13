package pl.sda.patterns.creational.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


class PropertyLoader {

    private Properties properties = new Properties();

    public void init() {
        if (properties.isEmpty()) {
            InputStream stream = this
                    .getClass().getClassLoader().getResourceAsStream("connection.properties");
            try {
                properties.load(stream);
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String getDb() {
        return properties.getProperty("db");
    }

    public String getPassword() {
        return properties.getProperty("password");
    }

    public String getUser() {
        return properties.getProperty("user");
    }

    public String getAddress() {
        return properties.getProperty("address");
    }
}
