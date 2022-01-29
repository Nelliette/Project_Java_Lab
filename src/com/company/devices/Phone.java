package com.company.devices;

import com.company.Salleable;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Phone extends Devices
{
    static final String DEFAULT_SERVER_ADDRESS = "192.164.100.1";
    static final String DEFAULT_STORE_PROTOCOL = "https";
    static final String DEFAULT_VERSION_APP = "14.7";
    Double screenSize;
    String os;



    public List<String>appsInstalled = new ArrayList<>();
    public List<String>appServers = new ArrayList<>();
    String url;

    public Phone(String model, String producer, Integer yearOfProduction, Double screenSize, String os)
    {
        super(model, producer, yearOfProduction);
        this.screenSize = screenSize;
        this.os = os;
    }




    public  void turnOn()
    {
        System.out.println("Za chwilę telefon się uruchomi.");
    }

    public void installAnnApp(String appName)
    {
        this.url = "https://www.zedge.net/";
       this.appsInstalled.add(appName);
       this.appServers.add(url);

        System.out.println(appName+" w wersji " +DEFAULT_VERSION_APP+" została zainstalowana na Twoim urządzeniu z serwera  :"+DEFAULT_STORE_PROTOCOL+ " IP adress :"+DEFAULT_SERVER_ADDRESS);
    }
    public void installAnnApp(String appName,String version)
    {
        this.url="https://gopro.com/en/us/shop/quik-app-video-photo-editor";
        this.appsInstalled.add(appName);
        this.appServers.add(this.url);


        System.out.println(appName+" w wersji "+version+" Została zainstalowana na Twoim urządzeniu z serwera  :"+DEFAULT_STORE_PROTOCOL+ " IP adress to :"+DEFAULT_SERVER_ADDRESS);
    }
   public void installAnnApp(String appName,String version,String serverName)
    {

        this.url ="https://www.skype.com/pl/";
       this.appsInstalled.add(appName);
        this.appServers.add(this.url);

        System.out.println(appName+" o numerze "+version+" Została zainstalowana na Twoim urządzeniu z serwera :"+serverName);
    }

    public void installAnnApp(List<String>appsInstalled)
    {
        for(String appInstalled:appsInstalled)
        System.out.println("Udało Ci się zainstalować dodatkowe oprogramowanie "+appInstalled);
    }
     public void installAnnApp(URL url)
    {
                System.out.println("Zainstalowane aplikacje "+appsInstalled+   "pochodzi z : " + appServers + " serwer ip " + DEFAULT_SERVER_ADDRESS + "  wersja to:" + DEFAULT_VERSION_APP);

    }


    @Override
    public String toString()
    {
        return super.toString();

    }

}
