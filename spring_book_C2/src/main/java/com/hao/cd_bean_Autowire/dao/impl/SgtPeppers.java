package com.hao.cd_bean_Autowire.dao.impl;

import com.hao.cd_bean_Autowire.dao.CompactDisc;
import org.springframework.stereotype.Component;

//@Component 默认为空时 bean的id为类名首字母小写
@Component("jaycd")//为bean命名的方式1
//@Named("jaycd1")//为bean命名的方式2
public class SgtPeppers implements CompactDisc {
    private String title="this is first CD Jay";
    private String artist="jay";


    public void play() {
        System.out.println(title+"author:"+artist);
    }
}
