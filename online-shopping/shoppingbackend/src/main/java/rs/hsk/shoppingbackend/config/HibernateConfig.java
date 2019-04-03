package rs.hsk.shoppingbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages= {"rs.hsk.shoppingbackend.dto"})
@EnableTransactionManagement
public class HibernateConfig {
	
	//change the below on the dbms you change
	private final static String DATABASE_URL="jdbc:h2:tcp://localhost/~/onlineshopping";
	private final static String DATABASE_DRIVER="org.h2.Driver";
	private final static String DATABASE_DIALECT="org.hibernate.dialect.H2Dialect";
	private final static String DATABASE_USERNAME="sa";
	private final static String DATABASE_PASSWORD="";

	
	/*private final static String DATABASE_URL="jdbc:mysql://5.189.155.104:3306/onlineshopping";
	private final static String DATABASE_DRIVER="com.mysql.jdbc.Driver";
	private final static String DATABASE_DIALECT="org.hibernate.dialect.MySQLDialect";
	private final static String DATABASE_USERNAME="adminuser";
	private final static String DATABASE_PASSWORD="mychoice";*/

	
	// dataSource bean available here
	
	@Bean("dataSource")
	public DataSource getDataSource() {
		
		BasicDataSource dataSource = new BasicDataSource();
		
		//providing the database connection information
		dataSource.setDriverClassName(DATABASE_DRIVER);
		dataSource.setUrl(DATABASE_URL);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setPassword(DATABASE_PASSWORD);
		
		return dataSource;
	}
	
	//sessionFactory bean will be available
	
	@Bean
	public SessionFactory getSessionFactory(DataSource datasource) {
	
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(datasource);
		
		builder.addProperties(getHibernateProperties());
		builder.scanPackages("rs.hsk.shoppingbackend.dto");
		
		return builder.buildSessionFactory();
	}
	
	
	//all Hibernate properties will returned here
	private Properties getHibernateProperties() {
		
		Properties properties = new Properties();
		
		properties.put("hibernate.dialect", DATABASE_DIALECT);
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		
		return properties;
	}
	
	
	//transaction manager bean
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		
		return transactionManager;
	}
	
	
	

}
