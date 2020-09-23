package cn.hao.CDtest;

import com.hao.cd_bean_Autowire.config.CDPlayerConfig;
import com.hao.cd_bean_Autowire.dao.CompactDisc;
import com.hao.cd_bean_Autowire.dao.impl.CDPlayer;
import com.hao.cd_bean_javacode.config.CDPlayerConfig2;
import com.hao.cd_bean_javacode.dao.impl.CDPlayer2;
import com.hao.cd_bean_xml.dao.impl.CDPlayer3;
import com.hao.cd_bean_xml.dao.impl.SgtPeppers3;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDTest {
    @Autowired
    private CompactDisc cd;
    @Test
    public void cdshouldNotbeNull(){
        System.out.println(cd.toString());
    }

    @Autowired
    private CDPlayer cdp;
    @Test
    public void testCdplayer(){
        cdp.play();
    }
    @Test
    public void testcdplayer2(){
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(CDPlayerConfig2.class);
        CDPlayer2 cdp=ctx.getBean(CDPlayer2.class);
        cdp.play();
    }
    @Test
    public void testplayer3(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("xmlbean.xml");
        SgtPeppers3 sgtPeppers=(SgtPeppers3)applicationContext.getBean("sgtPeppers");
        CDPlayer3 cdPlayer3 =(CDPlayer3)applicationContext.getBean("cdPlayer");
        cdPlayer3.play();
    }
}
