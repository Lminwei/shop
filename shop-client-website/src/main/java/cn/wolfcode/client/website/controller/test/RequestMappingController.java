package cn.wolfcode.client.website.controller.test;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RequestMappingController
{
    /**
     * 同一种资源, 使用多种多种表现形式, 比如: json.xml
     * 查询员工列表
     * GET /employees 返回员工列表
     */
    //headers:站在客户端的角度要设置
    //produces:站在SpringMVC的角度要设置
    //@RequestMapping(value = "/employees", method = RequestMethod.GET, headers = "Accept=application/json")
    @RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
    public List<Employee> getEmpListJson()
    {
        System.out.println("调用json方式的表现形式");
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1L, "张三", 1L));
        employees.add(new Employee(2L, "张三", 1L));
        return employees;
    }
    @RequestMapping(value = "/employees", method = RequestMethod.GET, headers = "Accept=application/xml")
    public String getEmpListXml()
    {
        System.out.println("调用xml方式的表现形式");
        return "xml";
    }

    /**
     * 同一个资源, 客户端给服务端不同的请求体数据
     * 获取某个指定员工
     */
    //headers:站在客户端的角度要设置
    //consumes:站在SpringMVC的角度要设置
    //@RequestMapping(value = "employees", method = RequestMethod.POST, headers = "Content-Type=application/x-www-form-urlencoded")
    @RequestMapping(value = "employees", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    public Employee getEmpForm(Employee employee)
    {
        System.out.println(1);
        employee.setId(1L);
        return employee;
    }
    @RequestMapping(value = "employees", method = RequestMethod.POST, headers = "Content-Type=application/json")
    public Employee getEmp(@RequestBody Employee employee)
    {
        System.out.println(2);
        employee.setId(2L);
        return employee;
    }
}
