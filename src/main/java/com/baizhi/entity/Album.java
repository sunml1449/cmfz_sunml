package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Album {
    @Id
    private String id;
    private String name;
    private String cover;
    private Integer count;
    private String brief;
    @JSONField(format = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;
    private String starId;
    private Star star;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setStarId(String starId) {
        this.starId = starId;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCover() {
        return cover;
    }

    public Integer getCount() {
        return count;
    }

    public String getBrief() {
        return brief;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getStarId() {
        return starId;
    }

    public Star getStar() {
        return star;
    }
}
