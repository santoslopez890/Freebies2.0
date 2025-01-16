package com.Freebies.BackendCode.Service;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Scraper {
    static RemoteWebDriver driver;

    private String webElement;

    public void testGrid(String bs) throws MalformedURLException{
        String browser="";
        String remoteUrl="http://localhost:4444";
        FirefoxOptions optionsf=new FirefoxOptions();
        optionsf.addArguments("--ignore-ssl-errors=yes");
        optionsf.addArguments("--ignore-certificate-errors");
        try {
            driver = new RemoteWebDriver(new URL(remoteUrl), optionsf);
        }catch (MalformedURLException e){

        }
    }


}
