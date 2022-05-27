package com.SJMS;

public class DecoratorPhone {
    private Phone phone;

    public DecoratorPhone(Phone phone) {
        this.phone =phone;
    }

   public String fourGCall(){
        return "fourGCall"+phone.call();
    }

    public String  fourGSend(){
        return "fourGCall"+phone.send();
    }

}
