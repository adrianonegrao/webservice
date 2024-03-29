package br.com.raiadrogasil.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class CalculadorDeParcela {
	
	@WebMethod(operationName="calcularParcelaSOAP")
	@WebResult(name="valorParcela")
	public double calculaParcela(
			@WebParam(name="valorTotal") double valorTotal, 
			@WebParam(name="quantidade") int quantidade
			){
		if (quantidade < 0){
			return 0;
		}
		double oValorTotal = valorTotal * (1 + (quantidade /100.0));
		return oValorTotal / quantidade;
	}
}
