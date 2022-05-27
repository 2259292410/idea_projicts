package test1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.AccountService;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class Tx01 {

    @Resource(name = "accountService2")
    private AccountService accountService;

    @Test
    public void zz(){
        accountService.transfer(1,2,100);
        System.out.println(accountService);
        }

}
