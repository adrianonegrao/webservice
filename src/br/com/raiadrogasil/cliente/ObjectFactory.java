
package br.com.raiadrogasil.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.raiadrogasil.cliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalcularParcelaSOAP_QNAME = new QName("http://ws.raiadrogasil.com.br/", "calcularParcelaSOAP");
    private final static QName _CalcularParcelaSOAPResponse_QNAME = new QName("http://ws.raiadrogasil.com.br/", "calcularParcelaSOAPResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.raiadrogasil.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularParcelaSOAP }
     * 
     */
    public CalcularParcelaSOAP createCalcularParcelaSOAP() {
        return new CalcularParcelaSOAP();
    }

    /**
     * Create an instance of {@link CalcularParcelaSOAPResponse }
     * 
     */
    public CalcularParcelaSOAPResponse createCalcularParcelaSOAPResponse() {
        return new CalcularParcelaSOAPResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularParcelaSOAP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.raiadrogasil.com.br/", name = "calcularParcelaSOAP")
    public JAXBElement<CalcularParcelaSOAP> createCalcularParcelaSOAP(CalcularParcelaSOAP value) {
        return new JAXBElement<CalcularParcelaSOAP>(_CalcularParcelaSOAP_QNAME, CalcularParcelaSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularParcelaSOAPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.raiadrogasil.com.br/", name = "calcularParcelaSOAPResponse")
    public JAXBElement<CalcularParcelaSOAPResponse> createCalcularParcelaSOAPResponse(CalcularParcelaSOAPResponse value) {
        return new JAXBElement<CalcularParcelaSOAPResponse>(_CalcularParcelaSOAPResponse_QNAME, CalcularParcelaSOAPResponse.class, null, value);
    }

}
