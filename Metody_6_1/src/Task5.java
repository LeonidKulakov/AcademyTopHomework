public class Task5 {
    private int dragonHealth;
    private int dragonDamage;
    private int solderHealth;
    private int solderDamage;
    private int count;

    private void inputData() {
        this.count = 0;
        Console console = new Console();
        System.out.println("Введи урон дракона");
        this.dragonDamage = console.inputInt();
        System.out.println("Введи здоровье дракона");
        this.dragonHealth = console.inputInt();
        System.out.println("Введи урон солдата");
        this.solderDamage = console.inputInt();
        System.out.println("Введи здоровье солдата");
        this.solderHealth = console.inputInt();
    }
    /**

    don't touch, this is magic :)

     */
    private int countDamage(int solders) {
        int dH = this.dragonHealth, dD = this.dragonDamage, sD = (this.solderDamage * solders), sH = (solderHealth * solders);
        do {
            dH -= sD;
            if ((sH - dD) < 0) {
                sH -= dD;
                break;
            } else {
                sH -= dD;
                sD = (int) Math.ceil(((double) sH / (double) this.solderHealth)) * this.solderDamage;
            }
        } while (dH > 0);
        if (sH < 0) {
            count++;
            countDamage(solders + 1);
        }

        return count;
    }

    public void print() {
        inputData();
        int i = countDamage(1);
        System.out.println("Кол-во солдат для победы " + i);
    }

}
