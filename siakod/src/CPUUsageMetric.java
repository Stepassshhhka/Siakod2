class CPUUsageMetric implements IMetric, IEventEmitter {
    private MetricPublisher publisher;

    private int cpuUsage;

    public CPUUsageMetric() {
        this.publisher = new MetricPublisher();
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