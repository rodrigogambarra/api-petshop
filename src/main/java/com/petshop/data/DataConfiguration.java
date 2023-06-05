package com.petshop.data;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;


import javax.sql.DataSource;

@Configuration
@Profile("dev")
public class DataConfiguration {

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");//com.mysql.jdbc.Driver
        dataSource.setUrl("jdbc:mysql://localhost:3306/apipetshop?createDatabaseIfNotExist=true&autoReconnect=true");
        dataSource.setUsername("root");
        dataSource.setPassword("Teste_123");
        return dataSource;
    }


    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        adapter.setShowSql(true);//mostra todas as percistencias no terminal durante a execução
        adapter.setGenerateDdl(true);//cria automaticamente as tabelas no banco
        adapter.setDatabasePlatform("org.hibernate.dialect.MySQL55Dialect");//Dialect.MySQL5Dialect - força o hibernate utilizar Engine em vez de Type
        adapter.setPrepareConnection(true);//hibernate se conectar automaticamente
        return adapter;
    }
}