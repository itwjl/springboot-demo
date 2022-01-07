
package com.aisinogd.fp.dzfp.companyinterface.hessian.pojo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ElectroniceStock complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ElectroniceStock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KP_NSRSBH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SYFPFS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectroniceStock", propOrder = {
    "kpnsrsbh",
    "syfpfs",
    "returnCode",
    "returnMsg"
})
public class ElectroniceStock {

    @XmlElementRef(name = "KP_NSRSBH", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kpnsrsbh;
    @XmlElementRef(name = "SYFPFS", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> syfpfs;
    @XmlElementRef(name = "returnCode", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> returnCode;
    @XmlElementRef(name = "returnMsg", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> returnMsg;

    /**
     * 获取kpnsrsbh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKPNSRSBH() {
        return kpnsrsbh;
    }

    /**
     * 设置kpnsrsbh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKPNSRSBH(JAXBElement<String> value) {
        this.kpnsrsbh = value;
    }

    /**
     * 获取syfpfs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSYFPFS() {
        return syfpfs;
    }

    /**
     * 设置syfpfs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSYFPFS(JAXBElement<String> value) {
        this.syfpfs = value;
    }

    /**
     * 获取returnCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReturnCode() {
        return returnCode;
    }

    /**
     * 设置returnCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReturnCode(JAXBElement<String> value) {
        this.returnCode = value;
    }

    /**
     * 获取returnMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReturnMsg() {
        return returnMsg;
    }

    /**
     * 设置returnMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReturnMsg(JAXBElement<String> value) {
        this.returnMsg = value;
    }

}
