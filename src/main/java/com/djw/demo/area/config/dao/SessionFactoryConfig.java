package com.djw.demo.area.config.dao;import org.mybatis.spring.SqlSessionFactoryBean;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.beans.factory.annotation.Qualifier;import org.springframework.beans.factory.annotation.Value;import org.springframework.context.annotation.Bean;import org.springframework.context.annotation.Configuration;import org.springframework.core.io.ClassPathResource;import org.springframework.core.io.support.PathMatchingResourcePatternResolver;import javax.sql.DataSource;import java.io.IOException;@Configurationpublic class SessionFactoryConfig {    @Value("${mybatis_config_file}")    private String mybatisConfigFilePath;    @Value("${mybatis_path}")    private String mapperPath;    @Value("${entity_package}")    private String entityPackage;    @Autowired    @Qualifier("dataSource")    private DataSource dataSource;    @Bean("sqlSessionFactory")    public SqlSessionFactoryBean createSqlSessionFactoryBean() throws IOException {        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();        factoryBean.setConfigLocation(new ClassPathResource(mybatisConfigFilePath));        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();        String packageSearch = PathMatchingResourcePatternResolver.CLASSPATH_URL_PREFIX+mapperPath;        factoryBean.setMapperLocations(resolver.getResources(packageSearch));        factoryBean.setDataSource(dataSource);        factoryBean.setTypeAliasesPackage(entityPackage);        return factoryBean;    }}