package com.gla.multithreading;

class ExamActivity implements Runnable {
    String activityName;
    int startDelaySecs;
    int durationSecs;

    ExamActivity(String activityName, int startDelaySecs, int durationSecs) {
        this.activityName = activityName;
        this.startDelaySecs = startDelaySecs;
        this.durationSecs = durationSecs;
    }

    public void run() {
        try {
            System.out.println(activityName + " | State: " + Thread.currentThread().getState() +
                    " | Waiting to start...");

            Thread.sleep(startDelaySecs * 1000);

            System.out.println(activityName + " | State: RUNNING" +
                    " | Priority: " + Thread.currentThread().getPriority() + " | Started");

            Thread.sleep(durationSecs * 1000);

            System.out.println(activityName + " | State: TERMINATED | Completed");

        } catch (InterruptedException e) {
            System.out.println(activityName + " was interrupted.");
        }
    }
}

public class ExamHallManagement {
    public static void main(String[] args) {
        Thread entryMonitor      = new Thread(new ExamActivity("Student Entry Monitor",     0,  20), "EntryMonitor");
        Thread paperDistribution = new Thread(new ExamActivity("Question Paper Distribution", 5, 5),  "PaperDist");
        Thread attendanceMarking = new Thread(new ExamActivity("Attendance Marking",         10,  5), "Attendance");
        Thread sheetCollection   = new Thread(new ExamActivity("Answer Sheet Collection",   15,  5), "SheetCollect");

        paperDistribution.setPriority(10);
        attendanceMarking.setPriority(8);
        sheetCollection.setPriority(7);
        entryMonitor.setPriority(5);

        System.out.println("Exam Hall System Starting...");
        System.out.println("Entry Monitor State: " + entryMonitor.getState());

        entryMonitor.start();
        paperDistribution.start();
        attendanceMarking.start();
        sheetCollection.start();

        try {
            entryMonitor.join();
            paperDistribution.join();
            attendanceMarking.join();
            sheetCollection.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All exam hall activities completed.");
    }
}
