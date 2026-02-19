public class Main {
    public static void main(String[] args) {
        System.out.println("========= Background Job Execution =========\n");

        Runnable emailJob = () -> {
            System.out.println("[Email Job] Started on thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("[Email Job] Sending bulk emails... Done.");
        };

        Runnable reportJob = () -> {
            System.out.println("[Report Job] Started on thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("[Report Job] Generating monthly report... Done.");
        };

        Runnable backupJob = () -> {
            System.out.println("[Backup Job] Started on thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("[Backup Job] Database backup complete... Done.");
        };

        System.out.println("Main thread: " + Thread.currentThread().getName());
        System.out.println("Launching background jobs...\n");

        Thread t1 = new Thread(emailJob, "Email-Thread");
        Thread t2 = new Thread(reportJob, "Report-Thread");
        Thread t3 = new Thread(backupJob, "Backup-Thread");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\nAll background jobs completed.");
    }
}
