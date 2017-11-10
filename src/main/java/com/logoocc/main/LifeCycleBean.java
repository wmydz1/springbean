package com.logoocc.main;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by samchen on 11/8/17.
 */
public class LifeCycleBean implements InitializingBean , DisposableBean {

    public void afterPropertiesSet() {
        // do some initialization work
    }

    public void init() {
        // do some initialization work
        System.out.println("we init this bean");
    }

    public void destroy() {
        System.out.println("we destroy this bean");
    }
}
