package cn.edu.hzau.mybatis.demo.mapper;

import cn.edu.hzau.mybatis.demo.model.GoldPrice;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface GoldPriceMapper {

    GoldPrice selectById(String id);
}
