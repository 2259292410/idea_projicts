package config;

//  我们希望 这个能够和properties 中的属性一一绑定

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:ds.properties")
public class DSEntity {

   // el 表达式
    @Value("${jdbc.user}")
    private String  user;

    @Value("${jdbc.password}")
    private String  password;

    @Value("${jdbc.url}")
    private String  url;

    @Value("${jdbc.driver}")
    private String  driver;


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
}
