package cn.wolfcode.client.website.controller.test;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("departments")
public class RESTfulTestController
{
    /**
     * 获取所有部门
     * GET/departments
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<Department> departments()
    {
        ArrayList<Department> departments = new ArrayList<Department>();
        departments.add(new Department(1L, "开发部"));
        departments.add(new Department(2L, "小卖部"));
        return departments;
    }

    /**
     * 获取某个部门的信息
     * GET/departments/1
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Department getDept(@PathVariable Long id)
    {
        return new Department(id, "开发部");
    }

    /**
     * 获取某个指定部门的指定员工
     * GET /departments/1/employees/1
     */
    @RequestMapping(value = "/{deptId}/employees/{empId}", method = RequestMethod.GET)
    public Employee getEmp(@PathVariable("deptId") Long deptId, @PathVariable("empId") Long empId)
    {
        return new Employee(empId, "员工", deptId);
    }

    /**
     * 新增一个部门的员工
     * POST /departments/{deptId}/employees 返回整个资源对象
     */
    @RequestMapping(value = "/{deptId}/employees", method = RequestMethod.POST)
    public Employee saveEmp(@PathVariable("deptId") Long deptId, Employee emp)
    {
        emp.setId(3L);
        return emp;
    }

    /**
     * 删除
     * DELETE /departments/{deptId}
     */
    @RequestMapping(value = "/{deptId}", method = RequestMethod.DELETE)
    public void deleteDept(@PathVariable("deptId") Long deptId)
    {
        System.out.println("删除该部门");
    }
}
