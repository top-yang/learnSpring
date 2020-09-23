package com.hao.cd_bean_Autowire.dao.impl;

import com.hao.cd_bean_Autowire.dao.CompactDisc;
import com.hao.cd_bean_Autowire.dao.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;
    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd=cd;
    }

    public void play() {
        cd.play();
    }
}
