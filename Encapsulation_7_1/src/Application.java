public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        application.start();
    }

    private void start(){
//        Ranges ranges = new Ranges();
//        ranges.print();

        Money myMoney = new Money(100L, (byte) 39);
        Money youMoney = new Money(51L, (byte) 47);
        System.out.println("Суммирование");
        myMoney.print(myMoney.addMoney(youMoney));
        System.out.println("Вычитание");
        myMoney.print(myMoney.subtractMoney(youMoney));
        System.out.println("Деление");
        myMoney.print(myMoney.divideByNumber(10.3));
        System.out.println("Умножение");
        myMoney.print(myMoney.multiplicationByNumber(2.2));
        System.out.println("Сравнение");
        myMoney.comparisonMoney(youMoney);
    }
}
