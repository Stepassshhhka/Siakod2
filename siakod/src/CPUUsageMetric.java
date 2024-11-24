class CPUUsageMetric implements IMetric, IEventEmitter {
    private MetricPublisher publisher;

    private int cpuUsage;

    public CPUUsageMetric(MetricPublisher publisher) {
        this.publisher = publisher;
    }

    public void update(int cpuUsage) {
        this.cpuUsage = cpuUsage;
        publisher.notifyObservers(cpuUsage);
    }

    @Override
    public void attach(Observer observer) {
        publisher.attach(observer);
    }

    @Override
    public void detach(Observer observer) {
        publisher.detach(observer);
    }

    @Override
    public void notifyObservers(int cpuUsage) {
        publisher.notifyObservers(cpuUsage);
    }


}