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
public class Chapter {
    @Id
    private String id;
    private String name;
    private String singer;
    private String size;
    private String duration;
    @JSONField(format = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;
    private String albumId;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSinger() {
        return singer;
    }

    public String getSize() {
        return size;
    }

    public String getDuration() {
        return duration;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }
}
