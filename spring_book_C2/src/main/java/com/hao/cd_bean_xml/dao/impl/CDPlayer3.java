package com.hao.cd_bean_xml.dao.impl;

import com.hao.cd_bean_Autowire.dao.CompactDisc;
import com.hao.cd_bean_Autowire.dao.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class CDPlayer3 implements MediaPlayer {
    public CDPlayer3(){}
    private CompactDisc cd;
    public CDPlayer3(CompactDisc cd){
        this.cd=cd;
    }

    public void play() {
        cd.play();
    }
}
