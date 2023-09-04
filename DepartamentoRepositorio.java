package br.senac.df.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.senac.df.dto.DeptEmpDto;
import br.senac.df.entidade.Departamento;

public interface DepartamentoRepositorio extends JpaRepository<Departamento, Integer>  {

	@Query("SELECT new br.senac.df.DeptEmpDto(d.nome, e.nome, e.email, e.endereco)"
			+ "FROM Departamento d LEFT JOIN d.empregado e")
	List<DeptEmpDto> fetchEmpDeptDataLeftJoin();
	
	@Query("SELECT new br.senac.df.DeptEmpDto(d.nome, e.nome, e.email, e.endereco)"
			+ "FROM Departamento d RIGHT JOIN d.empregado e")
	List<DeptEmpDto> fetchEmpDeptDataRightJoin();
	
}
