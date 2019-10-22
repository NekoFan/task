package com.travelsky.controller;

import com.travelsky.domain.Notice;
import com.travelsky.mapper.NoticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private NoticeMapper noticeMapper;

    @GetMapping("/newest")
    public Notice getNewest(){
        Notice body = noticeMapper.selectNewest();
        return body;
    }
}
