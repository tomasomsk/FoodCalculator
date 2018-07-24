package properties;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Props {

    private static Properties properties;

    private static void initializeProperties() {

        String sConfigFile = "properties.properties";
        properties = new Properties();

        try {
            InputStream streamFromResources = Props.class.getClassLoader().getResourceAsStream(sConfigFile);
            Throwable var2 = null;

            try {
                InputStreamReader isr = new InputStreamReader(streamFromResources, "UTF-8");
                properties.load(isr);
            } catch (Throwable var12) {
                var2 = var12;
                throw var12;
            } finally {
                if (streamFromResources != null) {
                    if (var2 != null) {
                        try {
                            streamFromResources.close();
                        } catch (Throwable var11) {
                            var2.addSuppressed(var11);
                        }
                    } else {
                        streamFromResources.close();
                    }
                }
            }
        } catch (NullPointerException | IOException var14) {
            throw new RuntimeException("Failed to access properties file", var14);
        }
    }

    public String getProperty(String propertyName) {
        initializeProperties();
        return properties.getProperty(propertyName);
    }
}
