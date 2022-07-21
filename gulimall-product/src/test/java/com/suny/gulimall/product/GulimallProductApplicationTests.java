package com.suny.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suny.gulimall.product.entity.BrandEntity;
import com.suny.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("test");
//        brandEntity.setName("apple");
        //brandService.save(brandEntity);
//        brandService.updateById(brandEntity);
//        System.out.println("save ok");
        List<BrandEntity> brand_id = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", "1L"));
        System.out.println(brand_id);

    }

}
