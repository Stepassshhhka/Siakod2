import java.time.format.DateTimeFormatter;

// Подписчик, записывающий нагрузку в лог
class CPUUsageLogger implements Observer {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public void update(int cpuUsage) {
        System.out.println("Записываем в файл");
    }
}
