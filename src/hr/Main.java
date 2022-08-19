package hr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ch07.ex03.presentation.Console;
import hr.dao.LaborerDao;
import hr.dao.LaborerDaoImpl;
import hr.domain.Laborer;
import hr.presentation.LaborerIo;
import hr.service.LaborerService;
import hr.service.LaborerServiceImpl;

public class Main {
	public static void main(String[] args) {
		List<Laborer> laborers = new ArrayList<>();
		
		LaborerDao laborerDao = new LaborerDaoImpl(laborers);
		LaborerService laborerService = new LaborerServiceImpl(laborerDao);
		LaborerIo laborerIo = new LaborerIo(laborerService);
		
		laborerIo.play();
		Console.info("³¡");
	}

}
