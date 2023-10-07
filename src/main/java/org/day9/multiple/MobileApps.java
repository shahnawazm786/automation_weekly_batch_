package org.day9.multiple;



public class MobileApps extends ElectroniceDevice implements IAndroidMobile{

    @Override
    public void deviceDetails() {

        System.out.println("Device Os version"+versionOS);
        System.out.println("Device model"+modelNo);

    }
}
