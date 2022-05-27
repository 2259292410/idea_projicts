package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration

//Import 吧一个类加载到spring容器中
@Import(DSEntity.class)
@ComponentScan(basePackages={"dao","service"})
public class SpringBean {


    @Autowired
    private  DSEntity ds;


      @Bean(name="queryRunner")
      public QueryRunner getQueryRunner(DataSource ds){

          return  new QueryRunner(ds);
      }


    @Bean(name="dataSource")
    public DataSource getDataSource(){
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setUser(ds.getUser());
        comboPooledDataSource.setPassword(ds.getPassword());
        comboPooledDataSource.setJdbcUrl(ds.getUrl());
        try {
            comboPooledDataSource.setDriverClass(ds.getDriver());
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        return  comboPooledDataSource;
    }

}
