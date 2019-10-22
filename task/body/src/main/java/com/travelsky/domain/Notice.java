package com.travelsky.domain;

import javax.persistence.Id;

public class Notice {
    @Id
    private Integer id;

    private String content;

    private boolean show_flag;

    private String create_time;

    public Integer getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public boolean isShow_flag() {
        return show_flag;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setShow_flag(boolean show_flag) {
        this.show_flag = show_flag;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }
}
