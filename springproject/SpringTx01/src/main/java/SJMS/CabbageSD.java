package SJMS;

public class CabbageSD implements SideDish {

    // 添加我们要增强的对象
    private HotPot hotPot;

    // 这个类中有没有必要添加无参的构造方法
    public CabbageSD(HotPot hotPot){
        this.hotPot=hotPot;
    }

    @Override
    public String desc() {
        return hotPot.desc()+"  白菜 ";
    }

    @Override
    public int pay() {
        int money=2; //定义当前组件的价格，以及他自己功能

        return hotPot.pay()+money;
    }
}
