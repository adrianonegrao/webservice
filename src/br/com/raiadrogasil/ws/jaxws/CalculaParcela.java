
package br.com.raiadrogasil.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "calcularParcelaSOAP", namespace = "http://ws.raiadrogasil.com.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcularParcelaSOAP", namespace = "http://ws.raiadrogasil.com.br/", propOrder = {
    "valorTotal",
    "quantidade"
})
public class CalculaParcela {

    @XmlElement(name = "valorTotal", namespace = "")
    private double valorTotal;
    @XmlElement(name = "quantidade", namespace = "")
    private int quantidade;

    /**
     * 
     * @return
     *     returns double
     */
    public double getValorTotal() {
        return this.valorTotal;
    }

    /**
     * 
     * @param valorTotal
     *     the value for the valorTotal property
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * 
     * @return
     *     returns int
     */
    public int getQuantidade() {
        return this.quantidade;
    }

    /**
     * 
     * @param quantidade
     *     the value for the quantidade property
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
