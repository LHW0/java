package hr.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import hr.dao.LaborerDaoImpl;
import hr.dao.LaborerDao;
import hr.domain.Laborer;

public class LaborerDaoTest {
	public static void main(String args) {
		List<Laborer> laborers = new ArrayList<>();
		laborers.add(new Laborer (11, "���Ѽ�", LocalDate.now()));
		laborers.add(new Laborer (12, "�ѾƸ�", LocalDate.now()));
		
		LaborerDao laborerDao = new LaborerDaoImpl(laborers);
		
		System.out.println(laborerDao.selectLaborers());
		System.out.println(laborerDao.selectLaborer(11));
		
		laborerDao.insertLaborer("�����", LocalDate.now());
		laborerDao.insertLaborer("������", LocalDate.now());
		System.out.println(laborerDao.selectLaborers());
		
		laborerDao.updateLaborer(new Laborer(11, "�Ҹ���", LocalDate.of(2025, 5, 5)));
		System.out.println(laborerDao.selectLaborers());
		
		laborerDao.deleteLaborer(11);
		System.out.println(laborerDao.selectLaborers());
	}

}
