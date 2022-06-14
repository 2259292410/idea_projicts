package com.atguigu.yygh.hosp.controller;

import com.atguigu.yygh.common.result.Result;
import com.atguigu.yygh.common.util.MD5;
import com.atguigu.yygh.hosp.service.HospitalSetService;
import com.atguigu.yygh.model.hosp.HospitalSet;
import com.atguigu.yygh.vo.hosp.HospitalSetQueryVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mysql.jdbc.StringUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@Api("医院管理设置")
@RestController
@RequestMapping("/admin/hosp/hospitalSet")
public class HospitalSetController {
    @Autowired
    private HospitalSetService hospitalSetService;

    @ApiOperation("查询所有医院")
    @GetMapping("/findAll")
    public Result findAll() {
        List<HospitalSet> list = hospitalSetService.list();
        return Result.ok(list);
    }

    @ApiOperation("根据ID删除医院")
    @DeleteMapping("/delete/{id}")
    public Result deleteById(@PathVariable("id") Long id) {
        boolean result = hospitalSetService.removeById(id);
        if (result) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }

    @ApiOperation("根据条件查询医院并分页")
    @GetMapping("/findPageHospSet/{current}/{limit}")
    public Result findPageHospSet(@PathVariable long current,
                                  @PathVariable long limit,
                                  @RequestBody (required = false) HospitalSetQueryVo hospitalSetQueryVo) {
        Page<HospitalSet> page = new Page(current, limit);
        QueryWrapper<HospitalSet> wrapper = new QueryWrapper();
        String hoscode = hospitalSetQueryVo.getHoscode();
        String hosname = hospitalSetQueryVo.getHosname();
    if(!StringUtils.isEmptyOrWhitespaceOnly(hosname)){
        wrapper.like("hostname",hosname);
    }
        if(!StringUtils.isEmptyOrWhitespaceOnly(hoscode)){
            wrapper.like("hoscode",hoscode);
        }
        return  Result.ok(hospitalSetService.page(page,wrapper));
    }

    @ApiOperation("添加医院")
    @PostMapping("/addHospitalSet")
    public Result addHospitalSet(@RequestBody HospitalSet hospitalSet) {
        hospitalSet.setStatus(1);
        Random random = new Random();
        hospitalSet.setSignKey(MD5.encrypt(System.currentTimeMillis()+""+random.nextInt(1000)));
        boolean save = hospitalSetService.save(hospitalSet);
        if (save)
            return Result.ok();
        else
            return Result.ok();

    }

    @ApiOperation("根据ID查找医院")
    @GetMapping("/get/{id}")
    public Result getHospitalSetById(@PathVariable("id") Long id){
        HospitalSet hospitalSet= hospitalSetService.getById(id);
        return Result.ok(hospitalSet);
    }

    @ApiOperation("修改医院信息")
    @PutMapping("/updateHospitalSet")
    public Result updateHospitalSetById(@RequestBody HospitalSet hospitalSet){
        boolean b = hospitalSetService.updateById(hospitalSet);
        if (b){
            return Result.ok();
        }else {
            return Result.fail();
        }
    }

    @ApiOperation("批量删除医院信息")
    @DeleteMapping("/batchRemoveHospitalSet")
   public Result batchRemove(@RequestBody List<Long> ids){
        boolean b = hospitalSetService.removeByIds(ids);
        if (b){
            return Result.ok();
        }else {
            return Result.fail();
        }
    }

    @ApiOperation("设置医院锁和解锁")
    @PutMapping("/lockHospitalSet/{id}/{status}")
    public Result lockHospitalSet(@PathVariable("id") Long id,
                                  @PathVariable("status")Integer status){
        HospitalSet hospitalSet = hospitalSetService.getById(id);
        hospitalSet.setStatus(status);
        hospitalSetService.updateById(hospitalSet);
        return  Result.ok();
    }

    @ApiOperation("发送签名密钥")
    @PutMapping("sendKey/{id}")
    public Result lockHospitalSet(@PathVariable Long id) {
        HospitalSet hospitalSet = hospitalSetService.getById(id);
        String signKey = hospitalSet.getSignKey();
        return Result.ok();
    }

    }
