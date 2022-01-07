
package com.aisinogd.fp.dzfp.companyinterface.hessian.pojo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfReturnElectronice complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfReturnElectronice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnElectronice" type="{http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com}ReturnElectronice" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfReturnElectronice", propOrder = {
    "returnElectronice"
})
public class ArrayOfReturnElectronice {

    @XmlElement(name = "ReturnElectronice", nillable = true)
    protected List<ReturnElectronice> returnElectronice;

    /**
     * Gets the value of the returnElectronice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnElectronice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnElectronice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnElectronice }
     * 
     * 
     */
    public List<ReturnElectronice> getReturnElectronice() {
        if (returnElectronice == null) {
            returnElectronice = new ArrayList<ReturnElectronice>();
        }
        return this.returnElectronice;
    }

}
