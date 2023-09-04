package br.senac.df.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.senac.df.dto.DeptEmpDto;
import br.senac.df.repositorio.DepartamentoRepositorio;
import br.senac.df.repositorio.EmpregadoRepositorio;
import jakarta.annotation.Resource;

@Service

public class JoinQueryService {

	@Resource
	private DepartamentoRepositorio departamentoRepositorio;
	
	@Resource
	private EmpregadoRepositorio empregadoRepositorio;
	
	public List<DeptEmpDto> getDeptEmpLeftJoin(){
		List<DeptEmpDto> list = departamentoRepositorio.fetchEmpDeptDataLeftJoin();
		list.forEach(l -> System.out.println(l));
		return list;
	}
	public List<DeptEmpDto> getDeptEmpRightJoin(){
		List<DeptEmpDto> list = departamentoRepositorio.fetchEmpDeptDataRightJoin();
		list.forEach(l -> System.out.println(l));
		return list;
	}
	public List<DeptEmpDto> getDeptEmpInnerJoin(){
		List<DeptEmpDto> list = empregadoRepositorio.fetchEmpDeptDataInnerJoin();
		list.forEach(l -> System.out.println(l));
		return list;
	}
	public List<DeptEmpDto> getDeptEmpCrossJoin(){
		List<DeptEmpDto> list = empregadoRepositorio.fetchEmpDeptDataCrossJoin();
		list.forEach(l -> System.out.println(l));
		return list;
	}
}