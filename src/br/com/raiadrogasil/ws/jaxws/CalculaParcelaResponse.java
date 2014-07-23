
package br.com.raiadrogasil.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "calcularParcelaSOAPResponse", namespace = "http://ws.raiadrogasil.com.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcularParcelaSOAPResponse", namespace = "http://ws.raiadrogasil.com.br/")
public class CalculaParcelaResponse {

    @XmlElement(name = "valorParcela", namespace = "")
    private double valorParcela;

    /**
     * 
     * @return
     *     returns double
     */
    public double getValorParcela() {
        return this.valorParcela;
    }

    /**
     * 
     * @param valorParcela
     *     the value for the valorParcela property
     */
    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }

}
