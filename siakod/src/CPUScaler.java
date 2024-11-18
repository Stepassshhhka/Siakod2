// Подписчик, масштабирующий ресурсы сервера
class CPUScaler implements Observer {
    private int limit;
    private int interval;

    public CPUScaler(int limit) {
        this.limit = limit;
    }

    public void setN(int interval) {
        this.interval = interval;
    }

    @Override
    public void update(int cpuUsage) {
        if (cpuUsage > limit) {
            // Увеличиваем мощность сервера
            System.out.println("Увеличение мощности сервера (нагрузка: " + cpuUsage + "%)");
        } else if (cpuUsage < limit - interval) { // Уменьшение мощности при снижении нагрузки на 10%
            // Уменьшаем мощность сервера
            System.out.println("Снижение мощности сервера (нагрузка: " + cpuUsage + "%)");
        }
    }
}