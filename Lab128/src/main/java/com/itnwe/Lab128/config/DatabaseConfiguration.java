package com.itnwe.Lab128.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@PropertySource("classpath:/application.properties")
public class DatabaseConfiguration {
/*	
	@Bean
	@ConfigurationProperties(prefix="spring.datasource.hikari")
	//@ConfigurationProperties : *.properties, *.yml 파일에 있는 property를 자바 클래스에 값을 가져와서 사용 할 수 있게 해주는 어노테이션
	public HikariConfig hikariConfig() {
		return new HikariConfig();
	}
	
	//앞에서 만든 히카리CP의 설정파일을 이용해서 데이터베이스와 연결하는 데이터 소스를 생성한다. 
	@Bean
    public DataSource dataSource() throws Exception {
        DataSource dataSource = new HikariDataSource(hikariConfig());
        System.out.println(dataSource.toString());
        return dataSource;
    }
	
	//MyBatis를 사용하기 위해 추가
	@Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
*/	
}
