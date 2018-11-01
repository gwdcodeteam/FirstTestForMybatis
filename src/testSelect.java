import pojo.Employee;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;

public class testSelect {
    public void testSelect() throws IOException{
        InputStream is= Resource.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=sf.openSession();
        Employee employee=session.selectOne("test.findEmployeeById",1);
        System.out.println(employee.getName()+employee.getAge());
    }
}
