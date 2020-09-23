package com.hao.cd_bean_javacode.config;

import com.hao.cd_bean_javacode.dao.CompactDisc2;
import com.hao.cd_bean_javacode.dao.MediaPlayer2;
import com.hao.cd_bean_javacode.dao.impl.CDPlayer2;
import com.hao.cd_bean_javacode.dao.impl.SgtPeppers2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration


public class CDPlayerConfig2 {
    @Bean("Sgt")
    public CompactDisc2 sgtPeppers(){
        return new SgtPeppers2();
    }
    @Bean("player")
    public MediaPlayer2 getplaer(){
        return new CDPlayer2(sgtPeppers());
    }
}

