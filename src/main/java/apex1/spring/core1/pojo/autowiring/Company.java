package apex1.spring.core1.pojo.autowiring;

public class Company {
	
	private String companyName;
	private String companyId;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyId=" + companyId + "]";
	}
	
	

}
