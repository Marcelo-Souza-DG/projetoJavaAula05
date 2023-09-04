package br.senac.df.dto;

public class DeptEmpDto {

	private String empDept;
	private String empNome;
	private String empEmail;
	private String empEndereco;
	
	public DeptEmpDto(String empDept, String empNome, String empEmail, String empEndereco) {
		super();
		this.empDept = empDept;
		this.empNome = empNome;
		this.empEmail = empEmail;
		this.empEndereco = empEndereco;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getEmpNome() {
		return empNome;
	}
	public void setEmpNome(String empNome) {
		this.empNome = empNome;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpEndereco() {
		return empEndereco;
	}
	public void setEmpEndereco(String empEndereco) {
		this.empEndereco = empEndereco;
	}
	@Override
	public String toString() {
		return "DeptEmpDto [empDept=" + empDept + ", empNome=" + empNome + ", empEmail=" + empEmail + ", empEndereco="
				+ empEndereco + "]";
	}
	
	
		
}
