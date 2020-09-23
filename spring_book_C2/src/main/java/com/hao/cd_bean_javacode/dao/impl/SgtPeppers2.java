package com.hao.cd_bean_javacode.dao.impl;

import com.hao.cd_bean_javacode.dao.CompactDisc2;

//@Component 默认为空时 bean的id为类名首字母小写
//@Component("jaycd")//为bean命名的方式1
//@Named("jaycd1")//为bean命名的方式2
public class SgtPeppers2 implements CompactDisc2 {
    private String title="this is first CD Jay with javaconfig";
    private String artist="jay";


    public void play() {
        System.out.println(title+"author:"+artist);
    }
}
