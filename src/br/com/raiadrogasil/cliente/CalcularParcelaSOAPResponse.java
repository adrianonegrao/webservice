
package br.com.raiadrogasil.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calcularParcelaSOAPResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calcularParcelaSOAPResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valorParcela" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcularParcelaSOAPResponse", propOrder = {
    "valorParcela"
})
public class CalcularParcelaSOAPResponse {

    protected double valorParcela;

    /**
     * Gets the value of the valorParcela property.
     * 
     */
    public double getValorParcela() {
        return valorParcela;
    }

    /**
     * Sets the value of the valorParcela property.
     * 
     */
    public void setValorParcela(double value) {
        this.valorParcela = value;
    }

}
