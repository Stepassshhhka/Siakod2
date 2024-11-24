public class Main {

    public static void main(String[] args) {
        MetricPublisher metricPublisher = new MetricPublisher();
        IMetric cpuUsageMetric = new CPUUsageMetric(metricPublisher);

        CPUUsageLogger cpuUsageLogger = new CPUUsageLogger();
        CPUUsageNotifier cpuUsageNotifier = new CPUUsageNotifier();
        CPUScaler cpuScaler = new CPUScaler(70);

        cpuUsageMetric.attach(cpuUsageLogger);
        cpuUsageMetric.attach(cpuUsageNotifier);
        cpuUsageMetric.attach(cpuScaler);

        // Моделируем изменения нагрузки на CPU
        cpuUsageMetric.update(50);
        cpuUsageMetric.update(75);
        cpuUsageMetric.update(60);
        cpuUsageMetric.update(85);
        cpuUsageMetric.update(55);
    }
}


//Наблюдатель (Observer)
//Мы реализуем систему мониторинга загруженности сервера (загруженности его
//процессора). Загруженность измеряется в процентах. Реализуйте класс
//CPUUsageMetric (с методом update для обновления значения загруженности),
//который позволяет уведомлять об изменении в нагрузке. Реализуйте 3
//подписчика: CPUUsageLogger (который добавляет в файл лога новое значение
//загруженности с меткой времени, если оно отличается от предыдущего),
//CPUUsageNotifier (который посылает запрос с новым значением метрики
//некому удалённому сервису), CPUScaler (который увеличивает мощность
//сервера, если нагрузка превышает заранее заданный лимит, и уменьшает, если
//нагрузка падает ниже).


