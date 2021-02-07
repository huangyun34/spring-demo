package com.my.spring;

import com.my.spring.bean.A;
import org.springframework.stereotype.Service;

@Service
public class TService {

    private static ThreadLocal threadlocal = new ThreadLocal<A>();

    public A getA() {
        return (A)threadlocal.get();
    }

    public void setA(A a) {
        threadlocal.set(a);
    }

    public void t(String in) {
        System.out.println(in + ":name:" + getA().getName());
        System.out.println(in + ":sex:" + getA().getSex());
        threadlocal.remove();
    }
}
