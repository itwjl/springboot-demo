
package com.aisinogd.fp.dzfp.companyinterface.hessian.pojo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ElectroniceInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ElectroniceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BMB_BBH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHYY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CZDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DDH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DKBZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DSPTBM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EWM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FHR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FPQQLSH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FPZT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FP_DM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FP_HM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FP_MW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GHFQYLX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GHF_DZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GHF_EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GHF_GDDH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GHF_MC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GHF_NSRSBH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GHF_SF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GHF_SJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GHF_YHZH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HJBHSJE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HJSE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HY_DM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HY_MC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JQBH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JYM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KPHJJE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="KPLX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KPR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KPRQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KPXM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KP_NSRMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KP_NSRSBH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NSRDZDAH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PYDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SKR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SWJG_DM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TSCHBZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TSFS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XHF_DH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XHF_DZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XHF_MC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XHF_NSRSBH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XHF_YHZH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YFP_DM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YFP_HM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataExchangeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="details" type="{http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com}ArrayOfElectroniceDetail" minOccurs="0"/>
 *         &lt;element name="encryptCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interfaceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passWord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectroniceInfo", propOrder = {
    "bmbbbh",
    "bz",
    "chyy",
    "czdm",
    "ddh",
    "dkbz",
    "dsptbm",
    "email",
    "ewm",
    "fhr",
    "fpqqlsh",
    "fpzt",
    "fpdm",
    "fphm",
    "fpmw",
    "ghfqylx",
    "ghfdz",
    "ghfemail",
    "ghfgddh",
    "ghfmc",
    "ghfnsrsbh",
    "ghfsf",
    "ghfsj",
    "ghfyhzh",
    "hjbhsje",
    "hjse",
    "hydm",
    "hymc",
    "jqbh",
    "jym",
    "kphjje",
    "kplx",
    "kpr",
    "kprq",
    "kpxm",
    "kpnsrmc",
    "kpnsrsbh",
    "nsrdzdah",
    "pydm",
    "sj",
    "skr",
    "swjgdm",
    "tschbz",
    "tsfs",
    "xhfdh",
    "xhfdz",
    "xhfmc",
    "xhfnsrsbh",
    "xhfyhzh",
    "yfpdm",
    "yfphm",
    "appId",
    "authorizationCode",
    "codeType",
    "content",
    "dataExchangeId",
    "details",
    "encryptCode",
    "interfaceCode",
    "passWord",
    "requestCode",
    "responseCode",
    "terminalCode",
    "userName",
    "version"
})
public class ElectroniceInfo {

    @XmlElementRef(name = "BMB_BBH", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bmbbbh;
    @XmlElementRef(name = "BZ", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bz;
    @XmlElementRef(name = "CHYY", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> chyy;
    @XmlElementRef(name = "CZDM", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> czdm;
    @XmlElementRef(name = "DDH", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ddh;
    @XmlElementRef(name = "DKBZ", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dkbz;
    @XmlElementRef(name = "DSPTBM", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dsptbm;
    @XmlElementRef(name = "EMAIL", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "EWM", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ewm;
    @XmlElementRef(name = "FHR", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fhr;
    @XmlElementRef(name = "FPQQLSH", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fpqqlsh;
    @XmlElementRef(name = "FPZT", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fpzt;
    @XmlElementRef(name = "FP_DM", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fpdm;
    @XmlElementRef(name = "FP_HM", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fphm;
    @XmlElementRef(name = "FP_MW", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fpmw;
    @XmlElementRef(name = "GHFQYLX", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ghfqylx;
    @XmlElementRef(name = "GHF_DZ", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ghfdz;
    @XmlElementRef(name = "GHF_EMAIL", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ghfemail;
    @XmlElementRef(name = "GHF_GDDH", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ghfgddh;
    @XmlElementRef(name = "GHF_MC", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ghfmc;
    @XmlElementRef(name = "GHF_NSRSBH", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ghfnsrsbh;
    @XmlElementRef(name = "GHF_SF", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ghfsf;
    @XmlElementRef(name = "GHF_SJ", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ghfsj;
    @XmlElementRef(name = "GHF_YHZH", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ghfyhzh;
    @XmlElement(name = "HJBHSJE")
    protected Double hjbhsje;
    @XmlElement(name = "HJSE")
    protected Double hjse;
    @XmlElementRef(name = "HY_DM", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hydm;
    @XmlElementRef(name = "HY_MC", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hymc;
    @XmlElementRef(name = "JQBH", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jqbh;
    @XmlElementRef(name = "JYM", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jym;
    @XmlElement(name = "KPHJJE")
    protected Double kphjje;
    @XmlElementRef(name = "KPLX", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kplx;
    @XmlElementRef(name = "KPR", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kpr;
    @XmlElementRef(name = "KPRQ", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kprq;
    @XmlElementRef(name = "KPXM", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kpxm;
    @XmlElementRef(name = "KP_NSRMC", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kpnsrmc;
    @XmlElementRef(name = "KP_NSRSBH", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kpnsrsbh;
    @XmlElementRef(name = "NSRDZDAH", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nsrdzdah;
    @XmlElementRef(name = "PYDM", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pydm;
    @XmlElementRef(name = "SJ", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sj;
    @XmlElementRef(name = "SKR", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> skr;
    @XmlElementRef(name = "SWJG_DM", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> swjgdm;
    @XmlElementRef(name = "TSCHBZ", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tschbz;
    @XmlElementRef(name = "TSFS", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tsfs;
    @XmlElementRef(name = "XHF_DH", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xhfdh;
    @XmlElementRef(name = "XHF_DZ", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xhfdz;
    @XmlElementRef(name = "XHF_MC", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xhfmc;
    @XmlElementRef(name = "XHF_NSRSBH", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xhfnsrsbh;
    @XmlElementRef(name = "XHF_YHZH", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xhfyhzh;
    @XmlElementRef(name = "YFP_DM", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> yfpdm;
    @XmlElementRef(name = "YFP_HM", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> yfphm;
    @XmlElementRef(name = "appId", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> appId;
    @XmlElementRef(name = "authorizationCode", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> authorizationCode;
    @XmlElementRef(name = "codeType", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codeType;
    @XmlElementRef(name = "content", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> content;
    @XmlElementRef(name = "dataExchangeId", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataExchangeId;
    @XmlElementRef(name = "details", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfElectroniceDetail> details;
    @XmlElementRef(name = "encryptCode", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> encryptCode;
    @XmlElementRef(name = "interfaceCode", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interfaceCode;
    @XmlElementRef(name = "passWord", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passWord;
    @XmlElementRef(name = "requestCode", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestCode;
    @XmlElementRef(name = "responseCode", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> responseCode;
    @XmlElementRef(name = "terminalCode", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> terminalCode;
    @XmlElementRef(name = "userName", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userName;
    @XmlElementRef(name = "version", namespace = "http://pojo.hessian.companyInterface.dzfp.fp.aisinogd.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> version;

    /**
     * 获取bmbbbh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBMBBBH() {
        return bmbbbh;
    }

    /**
     * 设置bmbbbh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBMBBBH(JAXBElement<String> value) {
        this.bmbbbh = value;
    }

    /**
     * 获取bz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBZ() {
        return bz;
    }

    /**
     * 设置bz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBZ(JAXBElement<String> value) {
        this.bz = value;
    }

    /**
     * 获取chyy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCHYY() {
        return chyy;
    }

    /**
     * 设置chyy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCHYY(JAXBElement<String> value) {
        this.chyy = value;
    }

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
     * 获取dkbz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDKBZ() {
        return dkbz;
    }

    /**
     * 设置dkbz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDKBZ(JAXBElement<String> value) {
        this.dkbz = value;
    }

    /**
     * 获取dsptbm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDSPTBM() {
        return dsptbm;
    }

    /**
     * 设置dsptbm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDSPTBM(JAXBElement<String> value) {
        this.dsptbm = value;
    }

    /**
     * 获取email属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEMAIL() {
        return email;
    }

    /**
     * 设置email属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEMAIL(JAXBElement<String> value) {
        this.email = value;
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
     * 获取fhr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFHR() {
        return fhr;
    }

    /**
     * 设置fhr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFHR(JAXBElement<String> value) {
        this.fhr = value;
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
     * 获取fpzt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFPZT() {
        return fpzt;
    }

    /**
     * 设置fpzt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFPZT(JAXBElement<String> value) {
        this.fpzt = value;
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
     * 获取fpmw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFPMW() {
        return fpmw;
    }

    /**
     * 设置fpmw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFPMW(JAXBElement<String> value) {
        this.fpmw = value;
    }

    /**
     * 获取ghfqylx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGHFQYLX() {
        return ghfqylx;
    }

    /**
     * 设置ghfqylx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGHFQYLX(JAXBElement<String> value) {
        this.ghfqylx = value;
    }

    /**
     * 获取ghfdz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGHFDZ() {
        return ghfdz;
    }

    /**
     * 设置ghfdz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGHFDZ(JAXBElement<String> value) {
        this.ghfdz = value;
    }

    /**
     * 获取ghfemail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGHFEMAIL() {
        return ghfemail;
    }

    /**
     * 设置ghfemail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGHFEMAIL(JAXBElement<String> value) {
        this.ghfemail = value;
    }

    /**
     * 获取ghfgddh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGHFGDDH() {
        return ghfgddh;
    }

    /**
     * 设置ghfgddh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGHFGDDH(JAXBElement<String> value) {
        this.ghfgddh = value;
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
     * 获取ghfsf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGHFSF() {
        return ghfsf;
    }

    /**
     * 设置ghfsf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGHFSF(JAXBElement<String> value) {
        this.ghfsf = value;
    }

    /**
     * 获取ghfsj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGHFSJ() {
        return ghfsj;
    }

    /**
     * 设置ghfsj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGHFSJ(JAXBElement<String> value) {
        this.ghfsj = value;
    }

    /**
     * 获取ghfyhzh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGHFYHZH() {
        return ghfyhzh;
    }

    /**
     * 设置ghfyhzh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGHFYHZH(JAXBElement<String> value) {
        this.ghfyhzh = value;
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
     * 获取hjse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHJSE() {
        return hjse;
    }

    /**
     * 设置hjse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHJSE(Double value) {
        this.hjse = value;
    }

    /**
     * 获取hydm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHYDM() {
        return hydm;
    }

    /**
     * 设置hydm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHYDM(JAXBElement<String> value) {
        this.hydm = value;
    }

    /**
     * 获取hymc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHYMC() {
        return hymc;
    }

    /**
     * 设置hymc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHYMC(JAXBElement<String> value) {
        this.hymc = value;
    }

    /**
     * 获取jqbh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJQBH() {
        return jqbh;
    }

    /**
     * 设置jqbh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJQBH(JAXBElement<String> value) {
        this.jqbh = value;
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
     * 获取kpr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKPR() {
        return kpr;
    }

    /**
     * 设置kpr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKPR(JAXBElement<String> value) {
        this.kpr = value;
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
     * 获取kpxm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKPXM() {
        return kpxm;
    }

    /**
     * 设置kpxm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKPXM(JAXBElement<String> value) {
        this.kpxm = value;
    }

    /**
     * 获取kpnsrmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKPNSRMC() {
        return kpnsrmc;
    }

    /**
     * 设置kpnsrmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKPNSRMC(JAXBElement<String> value) {
        this.kpnsrmc = value;
    }

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
     * 获取nsrdzdah属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNSRDZDAH() {
        return nsrdzdah;
    }

    /**
     * 设置nsrdzdah属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNSRDZDAH(JAXBElement<String> value) {
        this.nsrdzdah = value;
    }

    /**
     * 获取pydm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPYDM() {
        return pydm;
    }

    /**
     * 设置pydm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPYDM(JAXBElement<String> value) {
        this.pydm = value;
    }

    /**
     * 获取sj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSJ() {
        return sj;
    }

    /**
     * 设置sj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSJ(JAXBElement<String> value) {
        this.sj = value;
    }

    /**
     * 获取skr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSKR() {
        return skr;
    }

    /**
     * 设置skr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSKR(JAXBElement<String> value) {
        this.skr = value;
    }

    /**
     * 获取swjgdm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSWJGDM() {
        return swjgdm;
    }

    /**
     * 设置swjgdm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSWJGDM(JAXBElement<String> value) {
        this.swjgdm = value;
    }

    /**
     * 获取tschbz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTSCHBZ() {
        return tschbz;
    }

    /**
     * 设置tschbz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTSCHBZ(JAXBElement<String> value) {
        this.tschbz = value;
    }

    /**
     * 获取tsfs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTSFS() {
        return tsfs;
    }

    /**
     * 设置tsfs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTSFS(JAXBElement<String> value) {
        this.tsfs = value;
    }

    /**
     * 获取xhfdh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXHFDH() {
        return xhfdh;
    }

    /**
     * 设置xhfdh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXHFDH(JAXBElement<String> value) {
        this.xhfdh = value;
    }

    /**
     * 获取xhfdz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXHFDZ() {
        return xhfdz;
    }

    /**
     * 设置xhfdz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXHFDZ(JAXBElement<String> value) {
        this.xhfdz = value;
    }

    /**
     * 获取xhfmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXHFMC() {
        return xhfmc;
    }

    /**
     * 设置xhfmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXHFMC(JAXBElement<String> value) {
        this.xhfmc = value;
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

    /**
     * 获取xhfyhzh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXHFYHZH() {
        return xhfyhzh;
    }

    /**
     * 设置xhfyhzh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXHFYHZH(JAXBElement<String> value) {
        this.xhfyhzh = value;
    }

    /**
     * 获取yfpdm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getYFPDM() {
        return yfpdm;
    }

    /**
     * 设置yfpdm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setYFPDM(JAXBElement<String> value) {
        this.yfpdm = value;
    }

    /**
     * 获取yfphm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getYFPHM() {
        return yfphm;
    }

    /**
     * 设置yfphm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setYFPHM(JAXBElement<String> value) {
        this.yfphm = value;
    }

    /**
     * 获取appId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAppId() {
        return appId;
    }

    /**
     * 设置appId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAppId(JAXBElement<String> value) {
        this.appId = value;
    }

    /**
     * 获取authorizationCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * 设置authorizationCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthorizationCode(JAXBElement<String> value) {
        this.authorizationCode = value;
    }

    /**
     * 获取codeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodeType() {
        return codeType;
    }

    /**
     * 设置codeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodeType(JAXBElement<String> value) {
        this.codeType = value;
    }

    /**
     * 获取content属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContent() {
        return content;
    }

    /**
     * 设置content属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContent(JAXBElement<String> value) {
        this.content = value;
    }

    /**
     * 获取dataExchangeId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataExchangeId() {
        return dataExchangeId;
    }

    /**
     * 设置dataExchangeId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataExchangeId(JAXBElement<String> value) {
        this.dataExchangeId = value;
    }

    /**
     * 获取details属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfElectroniceDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfElectroniceDetail> getDetails() {
        return details;
    }

    /**
     * 设置details属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfElectroniceDetail }{@code >}
     *     
     */
    public void setDetails(JAXBElement<ArrayOfElectroniceDetail> value) {
        this.details = value;
    }

    /**
     * 获取encryptCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEncryptCode() {
        return encryptCode;
    }

    /**
     * 设置encryptCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEncryptCode(JAXBElement<String> value) {
        this.encryptCode = value;
    }

    /**
     * 获取interfaceCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInterfaceCode() {
        return interfaceCode;
    }

    /**
     * 设置interfaceCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInterfaceCode(JAXBElement<String> value) {
        this.interfaceCode = value;
    }

    /**
     * 获取passWord属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassWord() {
        return passWord;
    }

    /**
     * 设置passWord属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassWord(JAXBElement<String> value) {
        this.passWord = value;
    }

    /**
     * 获取requestCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestCode() {
        return requestCode;
    }

    /**
     * 设置requestCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestCode(JAXBElement<String> value) {
        this.requestCode = value;
    }

    /**
     * 获取responseCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponseCode() {
        return responseCode;
    }

    /**
     * 设置responseCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponseCode(JAXBElement<String> value) {
        this.responseCode = value;
    }

    /**
     * 获取terminalCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTerminalCode() {
        return terminalCode;
    }

    /**
     * 设置terminalCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTerminalCode(JAXBElement<String> value) {
        this.terminalCode = value;
    }

    /**
     * 获取userName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserName() {
        return userName;
    }

    /**
     * 设置userName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserName(JAXBElement<String> value) {
        this.userName = value;
    }

    /**
     * 获取version属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVersion(JAXBElement<String> value) {
        this.version = value;
    }

}
