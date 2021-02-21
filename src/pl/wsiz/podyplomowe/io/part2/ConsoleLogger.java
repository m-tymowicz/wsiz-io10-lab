package pl.wsiz.podyplomowe.io.part2;

public class ConsoleLogger {

    public void info(String log) {
        log("INFO ", log);
    }

    public void error(String log) {
        log("ERROR", log);
    }

    private void log(String prefix, String log) {
        System.out.printf("%s: %s\n", prefix, log);
    }
}
