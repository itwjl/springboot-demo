
package com.aisinogd.fp.dzfp.companyinterface.hessian.pojo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ElectroniceBatchQuery complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ElectroniceBatchQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FP_DM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FP_HM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GHF_MC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GHF_NSRSBH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KPRQ_from" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KPRQ_to" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XHF_NSRSBH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectroniceBatchQuery", propOrder = {
    "fpdm",
    "fphm",
    "ghfmc",
    "ghfnsrsbh",
    "kprqFrom",
    "kprqTo",
    "xhfnsrsbh"
})
public class ElectroniceBatchQuery {

    @XmlElementRef(name = "FP_DM", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fpdm;
    @XmlElementRef(name = "FP_HM", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fphm;
    @XmlElementRef(name = "GHF_MC", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ghfmc;
    @XmlElementRef(name = "GHF_NSRSBH", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ghfnsrsbh;
    @XmlElementRef(name = "KPRQ_from", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kprqFrom;
    @XmlElementRef(name = "KPRQ_to", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kprqTo;
    @XmlElementRef(name = "XHF_NSRSBH", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xhfnsrsbh;

    /**
     * 获取fpdm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFPDM() {
        return fpdm;
    }

    /**
     * 设置fpdm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFPDM(JAXBElement<String> value) {
        this.fpdm = value;
    }

    /**
     * 获取fphm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFPHM() {
        return fphm;
    }

    /**
     * 设置fphm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFPHM(JAXBElement<String> value) {
        this.fphm = value;
    }

    /**
     * 获取ghfmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGHFMC() {
        return ghfmc;
    }

    /**
     * 设置ghfmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGHFMC(JAXBElement<String> value) {
        this.ghfmc = value;
    }

    /**
     * 获取ghfnsrsbh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGHFNSRSBH() {
        return ghfnsrsbh;
    }

    /**
     * 设置ghfnsrsbh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGHFNSRSBH(JAXBElement<String> value) {
        this.ghfnsrsbh = value;
    }

    /**
     * 获取kprqFrom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKPRQFrom() {
        return kprqFrom;
    }

    /**
     * 设置kprqFrom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKPRQFrom(JAXBElement<String> value) {
        this.kprqFrom = value;
    }

    /**
     * 获取kprqTo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKPRQTo() {
        return kprqTo;
    }

    /**
     * 设置kprqTo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKPRQTo(JAXBElement<String> value) {
        this.kprqTo = value;
    }

    /**
     * 获取xhfnsrsbh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXHFNSRSBH() {
        return xhfnsrsbh;
    }

    /**
     * 设置xhfnsrsbh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXHFNSRSBH(JAXBElement<String> value) {
        this.xhfnsrsbh = value;
    }

}
