package apex1.spring.core1.pojo.autowiring;

public class User {
	
	private String userName;
	
	private Salary userSalary;
	
	private Company company;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Salary getUserSalary() {
		return userSalary;
	}

	public void setUserSalary(Salary userSalary) {
		this.userSalary = userSalary;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", userSalary=" + userSalary + ", company=" + company + "]";
	}
	
	

}
