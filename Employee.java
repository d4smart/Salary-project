package employee;

public abstract class Employee {
	/*声明属性变量*/
	private int empNum;
	private String name;
	private String deptCode;
	
	public Employee(int empNum,String name,String deptCode) {
		//给属性变量赋值
		setEmpNum(empNum);
		setName(name);
		setDeptCode(deptCode);		
	}
	
	//定义抽象方法-计算工资，子类需要重写它
	public abstract double caculateSalary();
	public abstract String getInfo();
	
	/*setters方法设置属性的值*/
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	
	/*getters方法获取属性的值*/
	public int getEmpNum() {
		return empNum;
	}
	public String getName() {
		return name;
	}
	public String getDeptCode() {
		return deptCode;
	}
	
	//获取员工的基本信息
	public String getBaseInfo() {
		String info;
		info = "\n人事编号：" + getEmpNum()
				+ "\n姓名：" + getName()
				+ "\n部门编码：" + getDeptCode();
		return info;
	}
}
