package com.PPP.testing.calcul.service;

import java.util.List;
import java.util.stream.Stream;

import com.PPP.testing.calcul.domain.model.CalculationModel;

public interface BatchCalculatorService {
	public List<CalculationModel> batchCalculate(Stream<String> operations);
}
