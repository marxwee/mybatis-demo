package cn.edu.hzau.mybatis.demo.service;

import cn.edu.hzau.mybatis.demo.mapper.GoldPriceMapper;
import cn.edu.hzau.mybatis.demo.model.GoldPrice;
import org.springframework.stereotype.Service;

@Service
public class GoldPriceService {

    private GoldPriceMapper goldPriceMapper;

    public GoldPriceService(GoldPriceMapper goldPriceMapper) {
        this.goldPriceMapper = goldPriceMapper;
    }

    public GoldPrice selectById(String id) {
        return goldPriceMapper.selectById(id);
    }
}
