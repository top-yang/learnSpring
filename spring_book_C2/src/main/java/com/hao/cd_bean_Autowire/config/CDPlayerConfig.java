package com.hao.cd_bean_Autowire.config;

import com.hao.cd_bean_Autowire.dao.impl.SgtPeppers;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackageClasses = {SgtPeppers.class})

public class CDPlayerConfig {
}
