package com.fdmgroup.Inheritence.Interface;

public class Runner {
    public static void main(String[] args) {
        Tablet tablet = new Tablet();
        Speaker speaker = new Speaker();
        Mobile mobile = new Mobile();
        USBCharger usbCharger = new USBCharger(3.5);

        usbCharger.supplyPower(tablet);
        usbCharger.supplyPower(speaker);
        usbCharger.supplyPower(mobile);

        System.out.println(Chargable.IMPEDANCE);

        System.out.println(Chargable.calculateWatts(2,2.25));

        tablet.connectToUSB();
        speaker.connectToUSB();
        mobile.connectToUSB();

        PortableLamp PL = new PortableLamp();

        usbCharger.supplyPower(PL);
        PL.produceLight();

    }
}
