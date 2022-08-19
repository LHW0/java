package hr.service;

import java.time.LocalDate;
import java.util.List;

import hr.dao.LaborerDao;
import hr.domain.Laborer;

public class LaborerServiceImpl implements LaborerService {
	private LaborerDao laborerDao;
	
	public LaborerServiceImpl(LaborerDao laborerDao) {
		this.laborerDao = laborerDao;
	}
	
	public List<Laborer> getLaborers() {
		return laborerDao.selectLaborers();
	}
	
	public Laborer getLaborer(int laborerId) {
		return laborerDao.selectLaborer(laborerId);
	}
	
	public void addLaborer(String laborerName, LocalDate hireDate) {
		laborerDao.insertLaborer(laborerName, hireDate);
	}
	
	public void fixLaborer(Laborer laborer) {
		laborerDao.updateLaborer(laborer);
	}
	
	public void delLaborer(int laborerId) {
		laborerDao.deleteLaborer(laborerId);
	}
}
