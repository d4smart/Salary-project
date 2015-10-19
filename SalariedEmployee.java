package employee;

public class SalariedEmployee extends Employee {
	//声明属性变量
	private double baseWeekSalary = 700;
	
	//自定义构造方法
	public SalariedEmployee(int empNum,String name,String deptCode) {
		//调用超类方法
		super(empNum,name,deptCode);
	}
	
	//getters和setters方法可修改基本工资
	public void setBaseWeekSalary(double baseWeekSalary) {
		this.baseWeekSalary = baseWeekSalary;
	}
	public double getBaseWeekSalary() {
		return baseWeekSalary;
	}

	//计算固定周薪员工每月工资的方法
	public double caculateSalary() {
		double salary;
		salary = baseWeekSalary * (30.0/7); 
		return salary;
	}

	//获取员工信息
	public String getInfo() {
		String info;
		info = "固定周薪员工的基本信息"
				+ getBaseInfo()
				+ "\n每月固定工资：" + baseWeekSalary;
		return info;
	}
}
