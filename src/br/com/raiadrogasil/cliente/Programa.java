package br.com.raiadrogasil.cliente;

public class Programa {
	
	public static void main( String args[] ){
		CalculadorDeParcela calculador = new CalculadorDeParcelaService().getCalculadorDeParcelaPort();
		System.out.println( calculador.calcularParcelaSOAP(100, 2));
	}

}
