package employee;
import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
	static Scanner scanner;//扫描器类
	
	public static void main(String[] args) {
		ArrayList <Employee> emps = new ArrayList <Employee> ();//保存员工信息的动态数组
		int addLog = 1;//是否处于添加状态
		
		Test1 test1 = new Test1();//使用create方法
		scanner = new Scanner(System.in);
		while (addLog == 1) {//添加状态
			System.out.print("请输入员工类型（0-固定周薪 1-计时取酬 2-退出添加）：");
			int type = scanner.nextInt();
			switch (type) {
			case 0: emps.add(test1.createSalariedEmployee()); break;//添加全职
			case 1: emps.add(test1.createHourlyEmployee()); break;//添加兼职
			case 2: addLog = 0; break;//退出添加
			default: System.out.println("请输入正确的数据类型！");//错误提醒
			}
			System.out.println("");
		}		
		scanner.close();
		
		//打印所有已添加员工信息
		System.out.println("已添加员工如下：");
		for (int i = 0; i < emps.size(); i++) {
			String info = emps.get(i).getInfo();
			System.out.println((i+1) + "." + info);
			System.out.println("每月实际工资：" + emps.get(i).caculateSalary() + "\n");
		}
	}
	
	//创建全职员工方法
	public SalariedEmployee createSalariedEmployee() {
		System.out.print("请输入员工编号：");
		int empNum = scanner.nextInt();
		System.out.print("请输入员工姓名：");
		String name = scanner.next();
		System.out.print("请输入部门编码：");
		String deptCode = scanner.next();
		SalariedEmployee sal = new SalariedEmployee(empNum, name, deptCode);
		return sal;
	}
	
	////创建兼职员工方法
	public HourlyEmployee createHourlyEmployee() {
		System.out.print("请输入员工编号：");
		int empNum = scanner.nextInt();
		System.out.print("请输入员工姓名：");
		String name = scanner.next();
		System.out.print("请输入部门编码：");
		String deptCode = scanner.next();
		System.out.print("请输入工作小时数：");
		int workHours = scanner.nextInt();
		HourlyEmployee hou = new HourlyEmployee(empNum, name, deptCode, workHours);
		return hou;
	}

}
