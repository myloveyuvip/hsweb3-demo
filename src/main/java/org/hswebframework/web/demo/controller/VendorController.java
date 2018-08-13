package org.hswebframework.web.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.hswebframework.web.demo.entity.Result;
import org.hswebframework.web.demo.entity.Vendor;
import org.hswebframework.web.demo.repository.VendorRepository;
import org.hswebframework.web.demo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@Slf4j
public class VendorController {


    @Autowired
    private VendorRepository vendorRepository;

    @PostMapping("/vendor")
    public Result<Vendor> vendorAdd(@Valid Vendor vendor, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        }
        return ResultUtil.success(vendorRepository.save(vendor));
    }


    @GetMapping("vendors")
    public Result<Vendor> getVendorAll() {
        List<Vendor> all = vendorRepository.findAll();
        return ResultUtil.success(all);
    }

}
