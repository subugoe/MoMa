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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for locationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="physicalLocation" type="{http://www.loc.gov/mods/v3}physicalLocationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.loc.gov/mods/v3}urlType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locationType", propOrder = {
    "physicalLocations",
    "urls"
})
public class LocationType {

    @XmlElement(name = "physicalLocation")
    protected List<PhysicalLocationType> physicalLocations;
    @XmlElement(name = "url")
    protected List<UrlType> urls;

    /**
     * Gets the value of the physicalLocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalLocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalLocationType }
     * 
     * 
     */
    public List<PhysicalLocationType> getPhysicalLocations() {
        if (physicalLocations == null) {
            physicalLocations = new ArrayList<PhysicalLocationType>();
        }
        return this.physicalLocations;
    }

    /**
     * Gets the value of the urls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UrlType }
     * 
     * 
     */
    public List<UrlType> getUrls() {
        if (urls == null) {
            urls = new ArrayList<UrlType>();
        }
        return this.urls;
    }

}