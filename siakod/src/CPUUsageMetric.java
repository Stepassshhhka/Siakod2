import java.util.ArrayList;
import java.util.List;

class CPUUsageMetric {
    private MetricPublisher publusher;

    private int cpuUsage;
    public void update(int cpuUsage) {
        this.cpuUsage = cpuUsage;
        publusher.notifyObservers(cpuUsage);
    }
}