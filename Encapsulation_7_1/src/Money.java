public class Money {
    private long rub;
    private byte kop;

    public Money() {
        this.rub = 0;
        this.kop = 0;
    }

    public Money(long rub, byte kop) {
        this.rub = rub;
        this.kop = kop;
    }

    public long getRub() {
        return rub;
    }

    public byte getKop() {
        return kop;
    }

    public void setRub(long rub) {
        this.rub = rub;
    }

    public void setKop(byte kop) {
        this.kop = kop;
    }


    public void print(Money money) {
        System.out.println(money.getRub() + "," + money.getKop());
    }

    public Money addMoney(Money money) {
        Money money1 = new Money();
        money1.setRub(this.rub + money.getRub());
        if ((this.kop + money.getKop()) >= 100) {
            money1.setRub(money1.getRub() + 1);
            money1.setKop((byte) (this.kop + money.getKop() - 100));
        } else {
            money1.setKop((byte) (this.kop + money.getKop()));
        }
        return money1;
    }

    public Money subtractMoney(Money money) {
        Money money1 = new Money();
        money1.setRub(this.rub - money.getRub());
        if (this.kop < money.getKop()) {
            money1.setRub(money1.getRub() - 1);
            money1.setKop((byte) (this.kop - money.getKop() + 100));
        } else {
            money1.setKop((byte) (this.kop - money.getKop()));
        }
        return money1;
    }

    public Money divideByNumber(double number) {
        Money money1 = new Money();
        double doubleMoney = this.rub + (double) this.kop / 100;
        doubleMoney /= number;
        money1.setRub((long) doubleMoney);
        money1.setKop((byte) ((doubleMoney - (long) doubleMoney) * 100));
        return money1;
    }

    public Money multiplicationByNumber(double number) {
        Money money1 = new Money();
        double doubleMoney = this.rub + (double) this.kop / 100;
        doubleMoney *= number;
        money1.setRub((long) doubleMoney);
        money1.setKop((byte) ((doubleMoney - (long) doubleMoney) * 100));
        return money1;
    }

    public void comparisonMoney(Money money1) {
        if (money1.getRub()<this.rub){
            System.out.println("Моих Больше");
        }else if (money1.getRub()>this.rub){
            System.out.println("Моих Меньше");
        }else {
            if (money1.getKop()<this.kop){
                System.out.println("Моих Больше");
            } else if (money1.getKop()>this.kop) {
                System.out.println("Моих Меньше");
            }else {
                System.out.println("Равны");
            }
        }
    }
}
