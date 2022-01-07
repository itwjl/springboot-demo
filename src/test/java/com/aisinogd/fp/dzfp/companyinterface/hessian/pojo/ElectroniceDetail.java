
package com.aisinogd.fp.dzfp.companyinterface.hessian.pojo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ElectroniceDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ElectroniceDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GGXH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HSBZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LSLBS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPBM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XMBM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XMDJ" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="XMJE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="XMMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XMSL" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="YHZCBS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZXBM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZZSTSGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcguid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectroniceDetail", propOrder = {
    "dw",
    "ggxh",
    "hsbz",
    "lslbs",
    "se",
    "sl",
    "spbm",
    "xmbm",
    "xmdj",
    "xmje",
    "xmmc",
    "xmsl",
    "yhzcbs",
    "zxbm",
    "zzstsgl",
    "pcguid"
})
public class ElectroniceDetail {

    @XmlElementRef(name = "DW", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dw;
    @XmlElementRef(name = "GGXH", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ggxh;
    @XmlElementRef(name = "HSBZ", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hsbz;
    @XmlElementRef(name = "LSLBS", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lslbs;
    @XmlElement(name = "SE")
    protected Double se;
    @XmlElementRef(name = "SL", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sl;
    @XmlElementRef(name = "SPBM", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> spbm;
    @XmlElementRef(name = "XMBM", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xmbm;
    @XmlElement(name = "XMDJ")
    protected Double xmdj;
    @XmlElement(name = "XMJE")
    protected Double xmje;
    @XmlElementRef(name = "XMMC", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xmmc;
    @XmlElement(name = "XMSL")
    protected Double xmsl;
    @XmlElementRef(name = "YHZCBS", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> yhzcbs;
    @XmlElementRef(name = "ZXBM", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> zxbm;
    @XmlElementRef(name = "ZZSTSGL", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> zzstsgl;
    @XmlElementRef(name = "pcguid", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcguid;

    /**
     * 获取dw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDW() {
        return dw;
    }

    /**
     * 设置dw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDW(JAXBElement<String> value) {
        this.dw = value;
    }

    /**
     * 获取ggxh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGGXH() {
        return ggxh;
    }

    /**
     * 设置ggxh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGGXH(JAXBElement<String> value) {
        this.ggxh = value;
    }

    /**
     * 获取hsbz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHSBZ() {
        return hsbz;
    }

    /**
     * 设置hsbz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHSBZ(JAXBElement<String> value) {
        this.hsbz = value;
    }

    /**
     * 获取lslbs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLSLBS() {
        return lslbs;
    }

    /**
     * 设置lslbs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLSLBS(JAXBElement<String> value) {
        this.lslbs = value;
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
     * 获取sl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSL() {
        return sl;
    }

    /**
     * 设置sl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSL(JAXBElement<String> value) {
        this.sl = value;
    }

    /**
     * 获取spbm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSPBM() {
        return spbm;
    }

    /**
     * 设置spbm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSPBM(JAXBElement<String> value) {
        this.spbm = value;
    }

    /**
     * 获取xmbm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXMBM() {
        return xmbm;
    }

    /**
     * 设置xmbm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXMBM(JAXBElement<String> value) {
        this.xmbm = value;
    }

    /**
     * 获取xmdj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getXMDJ() {
        return xmdj;
    }

    /**
     * 设置xmdj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXMDJ(Double value) {
        this.xmdj = value;
    }

    /**
     * 获取xmje属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getXMJE() {
        return xmje;
    }

    /**
     * 设置xmje属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXMJE(Double value) {
        this.xmje = value;
    }

    /**
     * 获取xmmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXMMC() {
        return xmmc;
    }

    /**
     * 设置xmmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXMMC(JAXBElement<String> value) {
        this.xmmc = value;
    }

    /**
     * 获取xmsl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getXMSL() {
        return xmsl;
    }

    /**
     * 设置xmsl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXMSL(Double value) {
        this.xmsl = value;
    }

    /**
     * 获取yhzcbs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getYHZCBS() {
        return yhzcbs;
    }

    /**
     * 设置yhzcbs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setYHZCBS(JAXBElement<String> value) {
        this.yhzcbs = value;
    }

    /**
     * 获取zxbm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getZXBM() {
        return zxbm;
    }

    /**
     * 设置zxbm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setZXBM(JAXBElement<String> value) {
        this.zxbm = value;
    }

    /**
     * 获取zzstsgl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getZZSTSGL() {
        return zzstsgl;
    }

    /**
     * 设置zzstsgl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setZZSTSGL(JAXBElement<String> value) {
        this.zzstsgl = value;
    }

    /**
     * 获取pcguid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcguid() {
        return pcguid;
    }

    /**
     * 设置pcguid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcguid(JAXBElement<String> value) {
        this.pcguid = value;
    }

}
