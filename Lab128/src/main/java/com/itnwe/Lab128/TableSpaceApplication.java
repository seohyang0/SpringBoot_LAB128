package com.itnwe.Lab128;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* @SpringBootApplication
 * 스프링부트의 자동 설정, 스프링 Bean 읽기와 생성이 모두 자동으로 설정됨
 * 해당 어노테이션이 있는 위치부터 설정을 읽어가기 때문에 항상 최상단에 위치
 */
@SpringBootApplication
public class TableSpaceApplication{

	public static void main(String[] args){
		SpringApplication.run(TableSpaceApplication.class, args);
	}

}
