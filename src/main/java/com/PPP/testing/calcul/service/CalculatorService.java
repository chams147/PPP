package com.PPP.testing.calcul.service;

import com.PPP.testing.calcul.domain.model.CalculationModel;

public interface CalculatorService {
	/**
	 * Effectuer le calcul demandé par un modèle
	 * 
	 * @param Modèle de calcul
	 * @return Modèle de calcul rempli du résultat 
	 */
	public CalculationModel calculate(CalculationModel calculationModel);
}
