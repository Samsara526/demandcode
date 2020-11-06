package com.alandegtr.demandcode.web;

import com.alandegtr.demandcode.dao.HyperlinkRepository;
import com.alandegtr.demandcode.po.Hyperlink;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HyperlinkController {

    private final HyperlinkRepository hyperlinkRepository;

    public HyperlinkController(HyperlinkRepository hyperlinkRepository) {
        this.hyperlinkRepository = hyperlinkRepository;
    }

    @PostMapping(value = "/search")
    public Hyperlink search(String demandCode) {
        System.out.println(demandCode);
        return hyperlinkRepository.findByDemandCode(demandCode);
    }

}
