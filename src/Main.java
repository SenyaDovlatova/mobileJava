//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double account = 100; //double указан, потому что счет может быть с копейками
        double refill = 400;
        int bonus =  1;
        int rublesPerBonus = 100;

        double sumAccount = account + refill;

        int bonusForRefill;
        if (refill <= 1000){
            bonusForRefill = 0;
        } else {
            bonusForRefill = (int) (refill * bonus / rublesPerBonus);
        }

        System.out.println(sumAccount + bonusForRefill);
        System.out.println(bonusForRefill);

    }
}