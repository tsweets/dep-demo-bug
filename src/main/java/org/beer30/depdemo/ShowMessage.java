package org.beer30.depdemo;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class ShowMessage {
    public String displayMessage() {
        String message = null;
        try {
            URL url = Resources.getResource("data.properties");
            message = Resources.toString(url, Charsets.UTF_8);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return message;
    }

    public String getGuavaVersion() {
        String version = null;
        try {
            URL url = Resources.getResource("META-INF/maven/com.google.guava/guava/pom.properties");
            Properties properties = new Properties();
            properties.load(url.openStream());
            version = properties.getProperty("version");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return version;
    }
}
