package com.alandegtr.demandcode.dao;

import com.alandegtr.demandcode.po.Hyperlink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HyperlinkRepository extends JpaRepository<Hyperlink, Long> {
    Hyperlink findByDemandCode(String demandCode);
}
