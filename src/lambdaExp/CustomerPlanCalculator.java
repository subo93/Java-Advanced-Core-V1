package lambdaExp;


@FunctionalInterface
public interface CustomerPlanCalculator {
    double calculateCost(int minutes, double ratePerMinute);
}
