package com.itnwe.Lab128.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.itnwe.Lab128.TableSpaceApplication;

@Configuration
@ComponentScan(basePackageClasses = TableSpaceApplication.class)
public class MvcConfiguration {

}
