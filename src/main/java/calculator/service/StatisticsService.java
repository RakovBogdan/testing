package calculator.service;

public interface StatisticsService {

    int getAdditionsCount();
    int getSubtractionsCount();
    int getMultiplicationsCount();
    int getDivisionsCount();

    void incrementAdditionCount();
    void incrementSubtractionsCount();
    void incrementMultiplicationsCount();
    void incrementDivisionsCount();
}
