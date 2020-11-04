package com.alandegtr.demandcode.po;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alan_hyperlink")
public class Hyperlink {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String demandCode;
    private String baiduUrl;
    private String baiduCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDemandCode() {
        return demandCode;
    }

    public void setDemandCode(String demandCode) {
        this.demandCode = demandCode;
    }

    public String getBaiduUrl() {
        return baiduUrl;
    }

    public void setBaiduUrl(String baiduUrl) {
        this.baiduUrl = baiduUrl;
    }

    public String getBaiduCode() {
        return baiduCode;
    }

    public void setBaiduCode(String baiduCode) {
        this.baiduCode = baiduCode;
    }

    @Override
    public String toString() {
        return "Hyperlink{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", demandCode='" + demandCode + '\'' +
                ", baiduUrl='" + baiduUrl + '\'' +
                ", baiduCode='" + baiduCode + '\'' +
                '}';
    }

    public Hyperlink(Long id, String title, String demandCode, String baiduUrl, String baiduCode) {
        this.id = id;
        this.title = title;
        this.demandCode = demandCode;
        this.baiduUrl = baiduUrl;
        this.baiduCode = baiduCode;
    }

    public Hyperlink() {
    }

    public Hyperlink(String title, String demandCode, String baiduUrl, String baiduCode) {
        this.title = title;
        this.demandCode = demandCode;
        this.baiduUrl = baiduUrl;
        this.baiduCode = baiduCode;
    }
}
