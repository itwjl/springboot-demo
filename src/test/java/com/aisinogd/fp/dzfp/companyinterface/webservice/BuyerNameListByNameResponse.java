
package com.aisinogd.fp.dzfp.companyinterface.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.aisinogd.fp.dzfp.companyinterface.hessian.pojo.ReturnBuyerList;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="out" type="{http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com}ReturnBuyerList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "out"
})
@XmlRootElement(name = "buyerNameListByNameResponse")
public class BuyerNameListByNameResponse {

    @XmlElement(required = true, nillable = true)
    protected ReturnBuyerList out;

    /**
     * 获取out属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReturnBuyerList }
     *     
     */
    public ReturnBuyerList getOut() {
        return out;
    }

    /**
     * 设置out属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnBuyerList }
     *     
     */
    public void setOut(ReturnBuyerList value) {
        this.out = value;
    }

}
