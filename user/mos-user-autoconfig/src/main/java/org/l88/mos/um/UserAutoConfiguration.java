package org.l88.mos.um;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.TypeAliasRegistry;
import org.l88.mos.um.dao.UmbPersonMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(UmbPersonMapper.class)
@ComponentScan
@MapperScan("org.l88.mos.um.dao")
@EnableConfigurationProperties
public class UserAutoConfiguration {
	

	@Autowired
	public void setFactory(SqlSessionFactory factory) {
		TypeAliasRegistry reg = factory.getConfiguration().getTypeAliasRegistry();
		reg.registerAliases("org.l88.mos.um.domain");
	}
	
}
