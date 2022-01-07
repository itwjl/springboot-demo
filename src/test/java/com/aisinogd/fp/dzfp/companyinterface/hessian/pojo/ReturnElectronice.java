
package com.aisinogd.fp.dzfp.companyinterface.hessian.pojo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReturnElectronice complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReturnElectronice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CZDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DDH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EWM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FPQQLSH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FPZL_DM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FP_DM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FP_HM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FWM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HJBHSJE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="JYM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KPHJJE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="KPLSH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KPLX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KPRQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PDF_FILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PDF_URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
@XmlType(name = "ReturnElectronice", propOrder = {
    "czdm",
    "ddh",
    "ewm",
    "fpqqlsh",
    "fpzldm",
    "fpdm",
    "fphm",
    "fwm",
    "hjbhsje",
    "jym",
    "kphjje",
    "kplsh",
    "kplx",
    "kprq",
    "pdffile",
    "pdfurl",
    "se",
    "returnCode",
    "returnMsg"
})
public class ReturnElectronice {

    @XmlElementRef(name = "CZDM", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> czdm;
    @XmlElementRef(name = "DDH", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ddh;
    @XmlElementRef(name = "EWM", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ewm;
    @XmlElementRef(name = "FPQQLSH", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fpqqlsh;
    @XmlElementRef(name = "FPZL_DM", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fpzldm;
    @XmlElementRef(name = "FP_DM", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fpdm;
    @XmlElementRef(name = "FP_HM", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fphm;
    @XmlElementRef(name = "FWM", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fwm;
    @XmlElement(name = "HJBHSJE")
    protected Double hjbhsje;
    @XmlElementRef(name = "JYM", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jym;
    @XmlElement(name = "KPHJJE")
    protected Double kphjje;
    @XmlElementRef(name = "KPLSH", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kplsh;
    @XmlElementRef(name = "KPLX", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kplx;
    @XmlElementRef(name = "KPRQ", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kprq;
    @XmlElementRef(name = "PDF_FILE", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pdffile;
    @XmlElementRef(name = "PDF_URL", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pdfurl;
    @XmlElement(name = "SE")
    protected Double se;
    @XmlElementRef(name = "returnCode", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> returnCode;
    @XmlElementRef(name = "returnMsg", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> returnMsg;

    /**
     * 获取czdm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCZDM() {
        return czdm;
    }

    /**
     * 设置czdm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCZDM(JAXBElement<String> value) {
        this.czdm = value;
    }

    /**
     * 获取ddh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDDH() {
        return ddh;
    }

    /**
     * 设置ddh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDDH(JAXBElement<String> value) {
        this.ddh = value;
    }

    /**
     * 获取ewm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEWM() {
        return ewm;
    }

    /**
     * 设置ewm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEWM(JAXBElement<String> value) {
        this.ewm = value;
    }

    /**
     * 获取fpqqlsh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFPQQLSH() {
        return fpqqlsh;
    }

    /**
     * 设置fpqqlsh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFPQQLSH(JAXBElement<String> value) {
        this.fpqqlsh = value;
    }

    /**
     * 获取fpzldm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFPZLDM() {
        return fpzldm;
    }

    /**
     * 设置fpzldm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFPZLDM(JAXBElement<String> value) {
        this.fpzldm = value;
    }

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
     * 获取fwm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFWM() {
        return fwm;
    }

    /**
     * 设置fwm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFWM(JAXBElement<String> value) {
        this.fwm = value;
    }

    /**
     * 获取hjbhsje属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHJBHSJE() {
        return hjbhsje;
    }

    /**
     * 设置hjbhsje属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHJBHSJE(Double value) {
        this.hjbhsje = value;
    }

    /**
     * 获取jym属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJYM() {
        return jym;
    }

    /**
     * 设置jym属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJYM(JAXBElement<String> value) {
        this.jym = value;
    }

    /**
     * 获取kphjje属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getKPHJJE() {
        return kphjje;
    }

    /**
     * 设置kphjje属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setKPHJJE(Double value) {
        this.kphjje = value;
    }

    /**
     * 获取kplsh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKPLSH() {
        return kplsh;
    }

    /**
     * 设置kplsh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKPLSH(JAXBElement<String> value) {
        this.kplsh = value;
    }

    /**
     * 获取kplx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKPLX() {
        return kplx;
    }

    /**
     * 设置kplx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKPLX(JAXBElement<String> value) {
        this.kplx = value;
    }

    /**
     * 获取kprq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKPRQ() {
        return kprq;
    }

    /**
     * 设置kprq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKPRQ(JAXBElement<String> value) {
        this.kprq = value;
    }

    /**
     * 获取pdffile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPDFFILE() {
        return pdffile;
    }

    /**
     * 设置pdffile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPDFFILE(JAXBElement<String> value) {
        this.pdffile = value;
    }

    /**
     * 获取pdfurl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPDFURL() {
        return pdfurl;
    }

    /**
     * 设置pdfurl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPDFURL(JAXBElement<String> value) {
        this.pdfurl = value;
    }

    /**
     * 获取se属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSE() {
        return se;
    }

    /**
     * 设置se属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSE(Double value) {
        this.se = value;
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
