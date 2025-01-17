package com.Freebies.BackendCode.Config;

import com.Freebies.BackendCode.Enum.Links;
import com.Freebies.BackendCode.Service.Scraper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.MalformedURLException;
import java.net.URL;

@Configuration
public class Config {
    @Bean
    public RemoteWebDriver driver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("firefox");
        String remoteUrl = "http://localhost:4444";
        FirefoxOptions optionsf = new FirefoxOptions();
        optionsf.addArguments("--ignore-ssl-errors=yes");
        optionsf.addArguments("--ignore-certificate-errors");
        return new RemoteWebDriver(new URL(remoteUrl), optionsf);

    }
}
