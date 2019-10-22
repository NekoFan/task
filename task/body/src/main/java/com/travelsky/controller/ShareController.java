package com.travelsky.controller;

import com.travelsky.core.AjaxResult;
import com.travelsky.domain.Share;
import com.travelsky.dto.ShareDto;
import com.travelsky.entity.MyShare;
import com.travelsky.mapper.ShareMapper;
import com.travelsky.util.BeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/shares")
public class ShareController {

    @Autowired
    private ShareMapper shareMapper;

    @PostMapping("/contribute")
    public AjaxResult<MyShare> contribute(ShareDto shareDto){
        MyShare myShare = new MyShare();
        Share share = new Share();
        BeanMapper.map(shareDto, share);
        myShare.setAuditStatus("PASS");
        myShare.setBuyCount(1);
        myShare.setCover("");
        myShare.setCreateTime("2019-10-21");
        myShare.setOriginal(true);
        myShare.setShowFlag(true);
        myShare.setId(1);
        return new AjaxResult<MyShare>().success(myShare);
    }

    @PutMapping("/contribute/{id}")
    public AjaxResult<MyShare> contributeById(ShareDto shareDto, @PathVariable String id){
        Integer shareId = Integer.valueOf(id);
        MyShare myShare = new MyShare();
        BeanMapper.map(shareDto, myShare);
        myShare.setId(shareId);
        return new AjaxResult<MyShare>().success(myShare);
    }

    @GetMapping("/exchange/{id}")
    public AjaxResult<MyShare> exchange(@PathVariable String id){
        Integer shareId = Integer.valueOf(id);
        MyShare myShare = new MyShare();
        myShare.setId(shareId);
        return new AjaxResult<MyShare>().success(myShare);
    }

    //用于：我的-我的兑换
    @GetMapping("/my")
    public AjaxResult<List<MyShare>> myExchange(){
        ArrayList<MyShare> sharesList = new ArrayList<>();
        for(int i=0;i<3;i++){
            MyShare myShare = new MyShare();
            myShare.setId(i);
            sharesList.add(myShare);
        }
        return new AjaxResult<List<MyShare>>().success(sharesList);
    }

    @GetMapping("/my/contributions")
    public AjaxResult<List<MyShare>> myContributions(){
        ArrayList<MyShare> sharesList = new ArrayList<>();
        for(int i=0;i<4;i++){
            MyShare myShare = new MyShare();
            myShare.setId(i);
            sharesList.add(myShare);
        }
        return new AjaxResult<List<MyShare>>().success(sharesList);
    }

    @GetMapping("/preview/{id}")
    public AjaxResult<MyShare> preview(@PathVariable String id){
        Integer shareId = Integer.valueOf(id);
        MyShare myShare = new MyShare();
        myShare.setId(shareId);
        return new AjaxResult<MyShare>().success(myShare);
    }
}
