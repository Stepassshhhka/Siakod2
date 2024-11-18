// Подписчик, отправляющий уведомление в удаленный сервис
class CPUUsageNotifier implements Observer {

    @Override
    public void update(int cpuUsage) {
        System.out.println("Отправлено уведомление о нагрузке: " + cpuUsage + "%");
    }
}