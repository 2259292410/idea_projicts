package SJMS;

public class HPTest {
    public static void main(String[] args) {


        // 常见一个基类的实现
        HotPot hotPot =new DuckDP();
        hotPot =new BullSD(hotPot);
        hotPot =new BullSD(hotPot);
        hotPot =new BullSD(hotPot);
        hotPot =new BullSD(hotPot);
        hotPot =new BullSD(hotPot);
        hotPot =new BullSD(hotPot);
        hotPot =new BullSD(hotPot);
        hotPot =new CabbageSD(hotPot);
        hotPot =new CabbageSD(hotPot);
        hotPot =new CabbageSD(hotPot);


        System.out.println(hotPot.desc());
        System.out.println(hotPot.pay());
    }
}
