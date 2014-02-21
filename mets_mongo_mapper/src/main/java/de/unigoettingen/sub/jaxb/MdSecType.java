//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.21 at 04:54:20 PM CET 
//


package de.unigoettingen.sub.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * mdSec (metadata section) Complex Type
 * 			A generic framework for pointing to/including metadata within a METS document, a la Warwick Framework.
 * 			
 * 
 * <p>Java class for mdSecType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mdSecType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="mdRef" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.loc.gov/METS/}METADATA"/>
 *                 &lt;attGroup ref="{http://www.loc.gov/METS/}LOCATION"/>
 *                 &lt;attGroup ref="{http://www.w3.org/1999/xlink}simpleLink"/>
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                 &lt;attribute name="MIMETYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="XPTR" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mdWrap" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="binData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *                   &lt;element name="xmlData" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="mods" type="{http://www.loc.gov/mods/v3}modsType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *                 &lt;attGroup ref="{http://www.loc.gov/METS/}METADATA"/>
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                 &lt;attribute name="MIMETYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="GROUPID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ADMID" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="CREATED" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mdSecType", namespace = "http://www.loc.gov/METS/", propOrder = {

})
public class MdSecType {

    protected MdSecType.MdRef mdRef;
    protected MdSecType.MdWrap mdWrap;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "GROUPID")
    protected String groupid;
    @XmlAttribute(name = "ADMID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> admids;
    @XmlAttribute(name = "CREATED")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlAttribute(name = "STATUS")
    protected String status;

    /**
     * Gets the value of the mdRef property.
     * 
     * @return
     *     possible object is
     *     {@link MdSecType.MdRef }
     *     
     */
    public MdSecType.MdRef getMdRef() {
        return mdRef;
    }

    /**
     * Sets the value of the mdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MdSecType.MdRef }
     *     
     */
    public void setMdRef(MdSecType.MdRef value) {
        this.mdRef = value;
    }

    /**
     * Gets the value of the mdWrap property.
     * 
     * @return
     *     possible object is
     *     {@link MdSecType.MdWrap }
     *     
     */
    public MdSecType.MdWrap getMdWrap() {
        return mdWrap;
    }

    /**
     * Sets the value of the mdWrap property.
     * 
     * @param value
     *     allowed object is
     *     {@link MdSecType.MdWrap }
     *     
     */
    public void setMdWrap(MdSecType.MdWrap value) {
        this.mdWrap = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the groupid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROUPID() {
        return groupid;
    }

    /**
     * Sets the value of the groupid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROUPID(String value) {
        this.groupid = value;
    }

    /**
     * Gets the value of the admids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the admids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getADMIDS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getADMIDS() {
        if (admids == null) {
            admids = new ArrayList<Object>();
        }
        return this.admids;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCREATED() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCREATED(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.loc.gov/METS/}METADATA"/>
     *       &lt;attGroup ref="{http://www.loc.gov/METS/}LOCATION"/>
     *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}simpleLink"/>
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *       &lt;attribute name="MIMETYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="XPTR" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MdRef {

        @XmlAttribute(name = "ID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAttribute(name = "MIMETYPE")
        protected String mimetype;
        @XmlAttribute(name = "LABEL")
        protected String label;
        @XmlAttribute(name = "XPTR")
        protected String xptr;
        @XmlAttribute(name = "MDTYPE", required = true)
        protected String mdtype;
        @XmlAttribute(name = "OTHERMDTYPE")
        protected String othermdtype;
        @XmlAttribute(name = "LOCTYPE", required = true)
        protected String loctype;
        @XmlAttribute(name = "OTHERLOCTYPE")
        protected String otherloctype;
        @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
        protected String xlinkType;
        @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
        @XmlSchemaType(name = "anyURI")
        protected String href;
        @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
        protected String role;
        @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
        protected String arcrole;
        @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
        protected String title;
        @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
        protected String show;
        @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
        protected String actuate;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the mimetype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMIMETYPE() {
            return mimetype;
        }

        /**
         * Sets the value of the mimetype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMIMETYPE(String value) {
            this.mimetype = value;
        }

        /**
         * Gets the value of the label property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLABEL() {
            return label;
        }

        /**
         * Sets the value of the label property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLABEL(String value) {
            this.label = value;
        }

        /**
         * Gets the value of the xptr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXPTR() {
            return xptr;
        }

        /**
         * Sets the value of the xptr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXPTR(String value) {
            this.xptr = value;
        }

        /**
         * Gets the value of the mdtype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMDTYPE() {
            return mdtype;
        }

        /**
         * Sets the value of the mdtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMDTYPE(String value) {
            this.mdtype = value;
        }

        /**
         * Gets the value of the othermdtype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOTHERMDTYPE() {
            return othermdtype;
        }

        /**
         * Sets the value of the othermdtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOTHERMDTYPE(String value) {
            this.othermdtype = value;
        }

        /**
         * Gets the value of the loctype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCTYPE() {
            return loctype;
        }

        /**
         * Sets the value of the loctype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCTYPE(String value) {
            this.loctype = value;
        }

        /**
         * Gets the value of the otherloctype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOTHERLOCTYPE() {
            return otherloctype;
        }

        /**
         * Sets the value of the otherloctype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOTHERLOCTYPE(String value) {
            this.otherloctype = value;
        }

        /**
         * Gets the value of the xlinkType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXlinkType() {
            if (xlinkType == null) {
                return "simple";
            } else {
                return xlinkType;
            }
        }

        /**
         * Sets the value of the xlinkType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXlinkType(String value) {
            this.xlinkType = value;
        }

        /**
         * Gets the value of the href property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHref() {
            return href;
        }

        /**
         * Sets the value of the href property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHref(String value) {
            this.href = value;
        }

        /**
         * Gets the value of the role property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRole() {
            return role;
        }

        /**
         * Sets the value of the role property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRole(String value) {
            this.role = value;
        }

        /**
         * Gets the value of the arcrole property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArcrole() {
            return arcrole;
        }

        /**
         * Sets the value of the arcrole property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArcrole(String value) {
            this.arcrole = value;
        }

        /**
         * Gets the value of the title property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * Sets the value of the title property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * Gets the value of the show property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShow() {
            return show;
        }

        /**
         * Sets the value of the show property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShow(String value) {
            this.show = value;
        }

        /**
         * Gets the value of the actuate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActuate() {
            return actuate;
        }

        /**
         * Sets the value of the actuate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActuate(String value) {
            this.actuate = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="binData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
     *         &lt;element name="xmlData" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="mods" type="{http://www.loc.gov/mods/v3}modsType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *       &lt;attGroup ref="{http://www.loc.gov/METS/}METADATA"/>
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *       &lt;attribute name="MIMETYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "xmlData",
        "binData"
    })
    public static class MdWrap {

        @XmlElement(namespace = "http://www.loc.gov/METS/")
        protected MdSecType.MdWrap.XmlData xmlData;
        @XmlElement(namespace = "http://www.loc.gov/METS/")
        protected byte[] binData;
        @XmlAttribute(name = "ID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAttribute(name = "MIMETYPE")
        protected String mimetype;
        @XmlAttribute(name = "LABEL")
        protected String label;
        @XmlAttribute(name = "MDTYPE", required = true)
        protected String mdtype;
        @XmlAttribute(name = "OTHERMDTYPE")
        protected String othermdtype;

        /**
         * Gets the value of the xmlData property.
         * 
         * @return
         *     possible object is
         *     {@link MdSecType.MdWrap.XmlData }
         *     
         */
        public MdSecType.MdWrap.XmlData getXmlData() {
            return xmlData;
        }

        /**
         * Sets the value of the xmlData property.
         * 
         * @param value
         *     allowed object is
         *     {@link MdSecType.MdWrap.XmlData }
         *     
         */
        public void setXmlData(MdSecType.MdWrap.XmlData value) {
            this.xmlData = value;
        }

        /**
         * Gets the value of the binData property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getBinData() {
            return binData;
        }

        /**
         * Sets the value of the binData property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setBinData(byte[] value) {
            this.binData = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the mimetype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMIMETYPE() {
            return mimetype;
        }

        /**
         * Sets the value of the mimetype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMIMETYPE(String value) {
            this.mimetype = value;
        }

        /**
         * Gets the value of the label property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLABEL() {
            return label;
        }

        /**
         * Sets the value of the label property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLABEL(String value) {
            this.label = value;
        }

        /**
         * Gets the value of the mdtype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMDTYPE() {
            return mdtype;
        }

        /**
         * Sets the value of the mdtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMDTYPE(String value) {
            this.mdtype = value;
        }

        /**
         * Gets the value of the othermdtype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOTHERMDTYPE() {
            return othermdtype;
        }

        /**
         * Sets the value of the othermdtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOTHERMDTYPE(String value) {
            this.othermdtype = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="mods" type="{http://www.loc.gov/mods/v3}modsType" maxOccurs="unbounded" minOccurs="0"/>
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
            "mods"
        })
        public static class XmlData {

            @XmlElement(namespace = "http://www.loc.gov/mods/v3")
            protected List<Mods> mods;

            /**
             * Gets the value of the mods property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mods property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMods().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Mods }
             * 
             * 
             */
            public List<Mods> getMods() {
                if (mods == null) {
                    mods = new ArrayList<Mods>();
                }
                return this.mods;
            }

        }

    }

}