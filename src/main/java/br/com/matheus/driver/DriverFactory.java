package br.com.matheus.driver;

import org.openqa.selenium.remote.RemoteWebDriver;

public abstract class DriverFactory {

   public abstract RemoteWebDriver createDriver(String browser);
}