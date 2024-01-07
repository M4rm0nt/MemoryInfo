public class MemoryInfoApplication {

    public static void main(String[] args) {
        MemoryInfoApplication app = new MemoryInfoApplication();
        app.logMemoryInfo();
    }

    public void logMemoryInfo() {
        final Runtime runtime = Runtime.getRuntime();

        final long maxMemory = runtime.maxMemory();
        final long allocatedMemory = runtime.totalMemory();
        final long freeMemory = runtime.freeMemory();
        final long totalFreeMemory = freeMemory + maxMemory - allocatedMemory;

        System.out.println("free memory: " + toMB(freeMemory) + "MB");
        System.out.println("allocated memory: " + toMB(allocatedMemory) + "MB");
        System.out.println("max memory: " + toMB(maxMemory) + "MB");
        System.out.println("total free memory: " + toMB(totalFreeMemory) + "MB");
    }

    private long toMB(long b) {
        return b / (1024 * 1024);
    }
}
