package de.unigoettingen.sub.medas.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author jdo
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "recordIdentifier"
})
public class RelatedItem {

    @XmlAttribute(name = "type")
    private String type; //TODO enum


    @XmlElementWrapper(name = "recordInfo")
    private Set<RecordIdentifier> recordIdentifier = new HashSet<>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public Set<RecordIdentifier> getRecordIdentifier() {
        return recordIdentifier;
    }

    public void setRecordIdentifier(Set<RecordIdentifier> recordIdentifier) {
        this.recordIdentifier = recordIdentifier;
    }

    public void addRecordIdentifier(RecordIdentifier recordIdentifier) {
        this.recordIdentifier.add(recordIdentifier);
    }


    public void addRecordIdentifiers(Set<RecordIdentifier> recordIdentifiers) {

        for (RecordIdentifier recordIdentifier : recordIdentifiers)
            this.recordIdentifier.add(recordIdentifier);
    }
}
