package de.unigoettingen.sub.mongomapper.springdata;


import de.unigoettingen.sub.jaxb.Mets;
import de.unigoettingen.sub.jaxb.Mods;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Set;


/**
 * Created by jpanzer on 17.02.14.
 */
public interface MetsRepository  extends Repository<Mets, Long> {

    //--- Mets section
    //Long countMets();
    Mets findOneMets(String docid);
    List<Mets> findAllMets();
    List<Mods> findAllModsWithRelatedItem();

    List<Mets> findAllCollections(Pageable pageable);
    List<Mets> findAllDocuments(Pageable pageable);

//    List<Mods>findAllModsWithoutRelatedItem ();
    Mets findMetsByModsId(String docid);
    Mets saveMets(Mets mets);
    void removeMets(String docid);
    void findAndModifyMets(String docid, boolean isCollection);


    //--- Mods section
    Mods findFirstMods(String docid);
    Mods findModsByRecordIdentifier(String recordIdentifier);
    Mods saveMods(Mods mods);
    void removeMods(String docid);

    //--- allgemein
    String findDocidByRecordIdentifier(String ppn);


}
