package employee;

public class HourlyEmployee extends Employee {
	//声明属性变量
	private int workHours;
	private double hourSalary = 20;
	
	//构造方法
	public HourlyEmployee(int empNum,String name,String deptCode,int workHours) {
		//调用超类方法
		super(empNum,name,deptCode);
		setWorkHours(workHours);
	}
	
	/*setters方法设置属性的值*/
	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}
	public void setHourSalary(double hourSalary) {
		this.hourSalary = hourSalary;
	}
	
	/*getters方法获取属性的值*/
	public int getWorkHours() {
		return workHours;
	}
	public double getHourSalary() {
		return hourSalary;
	}

	//计算计时取酬员工的基本工资
	public double caculateSalary() {
		return workHours * hourSalary;
	}

	//获取计时取酬员工的信息
	public String getInfo() {
		String info;
		info = "计时取酬员工的基本信息"
				+ getBaseInfo()
				+ "\n工作小时数：" + workHours
				+ "\n小时基本工资：" + hourSalary;
		return info;
	}

}
