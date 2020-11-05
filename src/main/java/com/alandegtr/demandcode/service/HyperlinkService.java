package com.alandegtr.demandcode.service;

import com.alandegtr.demandcode.dao.HyperlinkRepository;
import com.alandegtr.demandcode.util.demandCodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HyperlinkService {
    @Autowired
    private HyperlinkRepository hyperlinkRepository;

    public String generationDemandCode() {
        String demandCode = demandCodeUtil.randomDemandCode();
        while (hyperlinkRepository.findByDemandCode(demandCode) != null) {
            demandCode = demandCodeUtil.randomDemandCode();
        }
        return demandCode;
    }
}
