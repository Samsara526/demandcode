package com.alandegtr.demandcode.dao;

import com.alandegtr.demandcode.po.Hyperlink;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HyperlinkRepository extends JpaRepository<Hyperlink, Long> {
    List<Hyperlink> findByDemandCode(String demandCode);

}
