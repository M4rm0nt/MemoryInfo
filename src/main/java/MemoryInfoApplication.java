public class MemoryInfoApplication {

    public static void main(String[] args) {
        MemoryInfoApplication.loggeSpeicherInfo();
    }

    public static void loggeSpeicherInfo() {
        final Runtime runtime = Runtime.getRuntime();

        final long maxSpeicher = runtime.maxMemory();
        final long zugewiesenerSpeicher = runtime.totalMemory();
        final long freierSpeicher = runtime.freeMemory();
        final long gesamtFreierSpeicher = freierSpeicher + maxSpeicher - zugewiesenerSpeicher;

        System.out.println("Freier Speicher: " + inMB(freierSpeicher) + "MB");
        System.out.println("Zugewiesener Speicher: " + inMB(zugewiesenerSpeicher) + "MB");
        System.out.println("Maximaler Speicher: " + inMB(maxSpeicher) + "MB");
        System.out.println("Gesamter freier Speicher: " + inMB(gesamtFreierSpeicher) + "MB");
    }

    private static long inMB(long byteWert) {
        return byteWert / (1024 * 1024);
    }
}
