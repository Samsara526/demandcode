package com.alandegtr.demandcode;

import com.alandegtr.demandcode.dao.HyperlinkRepository;
import com.alandegtr.demandcode.po.Hyperlink;
import com.alandegtr.demandcode.service.HyperlinkService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SpringJpaTest {
    @Autowired
    private HyperlinkRepository hyperlinkRepository;
    @Autowired
    private HyperlinkService hyperlinkService;

    @Test
    public void findAllTest() {
        List<Hyperlink> hyperlinks = hyperlinkRepository.findAll();
        for (Hyperlink hyperlink : hyperlinks) {
            System.out.println(hyperlink);
        }
    }

    @Test
    public void findByDemandCodeTest() {
        Hyperlink hyperlink = hyperlinkRepository.findByDemandCode("2D2C18DE");
        System.out.println(hyperlink);
    }

    @Test
    public void insertTest() {
        Hyperlink hyperlink = new Hyperlink("测试重复", "2D2C18DD", "www.baidu.com", "2222");
        hyperlinkRepository.save(hyperlink);
        List<Hyperlink> hyperlinks = hyperlinkRepository.findAll();
        for (Hyperlink hyperlink1 : hyperlinks) {
            System.out.println(hyperlink1);
        }
    }

    @Test
    public void generateTest() {
        String demandCode = hyperlinkService.generationDemandCode();
        System.out.println(demandCode);
    }
}
