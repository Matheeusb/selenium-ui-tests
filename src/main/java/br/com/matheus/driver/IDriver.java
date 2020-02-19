package br.com.matheus.driver;

import org.openqa.selenium.remote.RemoteWebDriver;

public interface IDriver {

    RemoteWebDriver createSession(String browser);
}