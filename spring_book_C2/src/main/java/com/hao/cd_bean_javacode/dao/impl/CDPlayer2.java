package com.hao.cd_bean_javacode.dao.impl;

import com.hao.cd_bean_javacode.dao.CompactDisc2;
import com.hao.cd_bean_javacode.dao.MediaPlayer2;
import org.springframework.beans.factory.annotation.Autowired;

//@Component
public class CDPlayer2 implements MediaPlayer2 {
    private CompactDisc2 cd;
    @Autowired
    public CDPlayer2(CompactDisc2 cd){
        this.cd=cd;
    }

    public void play() {
        cd.play();
    }
}
