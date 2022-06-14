package apex1.spring.core1.pojo.autowiring;

public class Salary {
	
	private Integer netSalary;
	private Float taxDeduction;
	public Integer getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(Integer netSalary) {
		this.netSalary = netSalary;
	}
	public Float getTaxDeduction() {
		return taxDeduction;
	}
	public void setTaxDeduction(Float taxDeduction) {
		this.taxDeduction = taxDeduction;
	}
	@Override
	public String toString() {
		return "Salary [netSalary=" + netSalary + ", taxDeduction=" + taxDeduction + "]";
	}
	
	

}
