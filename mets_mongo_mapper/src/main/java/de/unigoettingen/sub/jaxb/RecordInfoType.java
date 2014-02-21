//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.21 at 04:54:20 PM CET 
//


package de.unigoettingen.sub.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for recordInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recordInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="recordContentSource" type="{http://www.loc.gov/mods/v3}sourceType"/>
 *         &lt;element name="recordCreationDate" type="{http://www.loc.gov/mods/v3}dateType"/>
 *         &lt;element name="recordChangeDate" type="{http://www.loc.gov/mods/v3}dateType"/>
 *         &lt;element name="recordIdentifier">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="languageOfCataloging" type="{http://www.loc.gov/mods/v3}languageType"/>
 *         &lt;element name="recordOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.loc.gov/mods/v3}language"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recordInfoType", propOrder = {
    "recordContentSourcesAndRecordCreationDatesAndRecordChangeDates"
})
public class RecordInfoType {

    @XmlElementRefs({
        @XmlElementRef(name = "recordContentSource", type =  RecordContentSource.class, required = false),
        @XmlElementRef(name = "recordChangeDate", type = RecordChangeDate.class, required = false),
        @XmlElementRef(name = "recordIdentifier", type = RecordIdentifier.class, required = false),
        @XmlElementRef(name = "recordOrigin", type = RecordOrigin.class, required = false),
        @XmlElementRef(name = "languageOfCataloging", type = LanguageOfCataloging.class, required = false),
        @XmlElementRef(name = "recordCreationDate", type = RecordCreationDate.class, required = false)
    })
    protected List<JAXBElement<?>> recordContentSourcesAndRecordCreationDatesAndRecordChangeDates;
    @XmlAttribute(name = "lang")
    protected String lang;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String xmlLang;
    @XmlAttribute(name = "script")
    protected String script;
    @XmlAttribute(name = "transliteration")
    protected String transliteration;

    /**
     * Gets the value of the recordContentSourcesAndRecordCreationDatesAndRecordChangeDates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordContentSourcesAndRecordCreationDatesAndRecordChangeDates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordContentSourcesAndRecordCreationDatesAndRecordChangeDates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DateType }{@code >}
     * {@link JAXBElement }{@code <}{@link SourceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DateType }{@code >}
     * {@link JAXBElement }{@code <}{@link RecordInfoType.RecordIdentifier }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link LanguageType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRecordContentSourcesAndRecordCreationDatesAndRecordChangeDates() {
        if (recordContentSourcesAndRecordCreationDatesAndRecordChangeDates == null) {
            recordContentSourcesAndRecordCreationDatesAndRecordChangeDates = new ArrayList<JAXBElement<?>>();
        }
        return this.recordContentSourcesAndRecordCreationDatesAndRecordChangeDates;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the xmlLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlLang() {
        return xmlLang;
    }

    /**
     * Sets the value of the xmlLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlLang(String value) {
        this.xmlLang = value;
    }

    /**
     * Gets the value of the script property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScript() {
        return script;
    }

    /**
     * Sets the value of the script property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScript(String value) {
        this.script = value;
    }

    /**
     * Gets the value of the transliteration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransliteration() {
        return transliteration;
    }

    /**
     * Sets the value of the transliteration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransliteration(String value) {
        this.transliteration = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class RecordIdentifier {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "source")
        protected String source;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

    }

}