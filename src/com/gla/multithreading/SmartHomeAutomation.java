package com.gla.multithreading;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Device implements Runnable {
    String deviceName;
    int intervalSeconds;
    int cycles;

    Device(String deviceName, int intervalSeconds, int cycles) {
        this.deviceName = deviceName;
        this.intervalSeconds = intervalSeconds;
        this.cycles = cycles;
    }

    public void run() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        for (int i = 1; i <= cycles; i++) {
            String time = LocalTime.now().format(formatter);
            System.out.println("[" + time + "] " + deviceName +
                    " | Priority: " + Thread.currentThread().getPriority() +
                    " | Cycle: " + i + "/" + cycles);
            try {
                Thread.sleep(intervalSeconds * 1000);
            } catch (InterruptedException e) {
                System.out.println(deviceName + " interrupted.");
            }
        }
        System.out.println(deviceName + " completed all cycles.");
    }
}

public class SmartHomeAutomation {
    public static void main(String[] args) {
        Thread temperatureSensor = new Thread(new Device("Temperature Sensor", 5, 5), "TempSensor");
        Thread securityCamera = new Thread(new Device("Security Camera", 3, 5), "SecurityCam");
        Thread lightController = new Thread(new Device("Light Controller", 4, 5), "LightCtrl");
        Thread doorLockMonitor = new Thread(new Device("Door Lock Monitor", 6, 5), "DoorLock");

        securityCamera.setPriority(10);
        temperatureSensor.setPriority(7);
        lightController.setPriority(5);
        doorLockMonitor.setPriority(5);

        temperatureSensor.start();
        securityCamera.start();
        lightController.start();
        doorLockMonitor.start();

        try {
            temperatureSensor.join();
            securityCamera.join();
            lightController.join();
            doorLockMonitor.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All smart home devices have completed their cycles.");
    }
}
