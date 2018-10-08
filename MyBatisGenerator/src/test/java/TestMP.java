import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bzcoder.test.entity.Employee;
import com.bzcoder.test.mapper.EmployeeMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author BaoZhou
 * @date 2018/10/8
 */
public class TestMP {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
    EmployeeMapper employeeMapper = ioc.getBean("employeeMapper", EmployeeMapper.class);

    @Test
    public void testPage()
    {
        IPage<Employee> employeeIPage = employeeMapper.selectPage(new Page<>(2, 2), null);
        System.out.println(employeeIPage.getRecords());
    }
}
