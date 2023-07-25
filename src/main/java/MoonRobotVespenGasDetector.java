package main.java;

/*
Module 2 Task 32
*/

//public boolean isAcidOk(int acidValue, int minAcid, int maxAcid). Чи підходить ґрунт за кислотністю. Приймає три параметри - кислотність ґрунту, мінімально допустиме та максимально допустимі значення. Повертає true, якщо показник acidValue лежить у проміжку від minAcid до maxAcid включно;
//public boolean isDensityOk(int density). Чи підходить ґрунт за щільністю. Веспен-газ зустрічається в точках, де щільність ґрунту лежить у проміжку від 1000 до 5000 включно, АБО ж у проміжку від 10000 до 15000 включно;
//public boolean isTemperatureOk(boolean cold). Примітивний датчик температури видає булеве значення температури лише як true якщо ґрунт холодний, та false - якщо ґрунт теплий. Нам підходить лише теплий ґрунт. Тому метод має повертати true, лише якщо ґрунт не холодний.
//public boolean isGroundOkForVespenGas(int acidValue, int minAcid, int maxAcid, int density, boolean cold) - метод, який видає фінальний вердикт, чи варто копати у цій точці. Він приймає всі параметри, які приймає метод вище. Використовує всі перераховані вище методи і повертає true, якщо ґрунт проходить за всіма параметрами, та false, якщо ґрунт не проходить хоча б за одним параметром.
//        виклик isAcidOk(100, 50, 150) повертає true
//        виклик isDensityOk(1500) повертає true
public class MoonRobotVespenGasDetector {
    public boolean isAcidOk(int acidValue, int minAcid, int maxAcid){
        return (minAcid <= acidValue) && (acidValue <= maxAcid);
    }
    public boolean isDensityOk(int density) {
        return ((density >= 1000) && (density <= 5000)) || ((density >= 10000) && (density <= 15000));
    }
    public boolean isTemperatureOk(boolean cold) {
        return !cold;
    }
    public boolean isGroundOkForVespenGas(int acidValue, int minAcid, int maxAcid, int density, boolean cold) {
        MoonRobotVespenGasDetector moonRobotAll = new MoonRobotVespenGasDetector();
        return moonRobotAll.isAcidOk(acidValue, minAcid, maxAcid) && moonRobotAll.isDensityOk(density) && moonRobotAll.isTemperatureOk(cold);
    }

    public static void main(String[] args) {
        MoonRobotVespenGasDetector moonRobot = new MoonRobotVespenGasDetector();

        System.out.println("moonRobot acidValue = " + moonRobot.isAcidOk(120, 75, 150));
        System.out.println("moonRobot isDensityOk = " + moonRobot.isDensityOk(7500));
        System.out.println("moonRobot isDensityOk = " + moonRobot.isDensityOk(30000));
        System.out.println("moonRobot isTemperatureOk = " + moonRobot.isTemperatureOk(false));
        System.out.println("moonRobot isGroundOkForVespenGas = " + moonRobot.isGroundOkForVespenGas(120, 75, 150, 7500, false));

    }

}
