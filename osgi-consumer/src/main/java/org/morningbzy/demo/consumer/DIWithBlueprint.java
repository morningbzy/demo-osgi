package org.morningbzy.demo.consumer;

import org.morningbzy.demo.interfaces.IAuth;

public class DIWithBlueprint {
    private IAuth auth;
    public void setAuth(IAuth service) {
        System.out.println("YEAH");
        this.auth = service;
        System.out.println(auth.init(300));
        System.out.println(auth.init(333));
    }
}
