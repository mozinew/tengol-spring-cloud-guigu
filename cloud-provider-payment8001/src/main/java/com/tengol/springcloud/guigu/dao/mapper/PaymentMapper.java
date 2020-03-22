package com.tengol.springcloud.guigu.dao.mapper;

import com.tengol.springcloud.guigu.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * PaymentMapper
 *
 * @author dongrui
 * @date 2020/3/20 22:51
 */
@Repository
@Mapper
public interface PaymentMapper {
     int insert(Payment payment);

     Payment selectByPrimaryKey(@Param("id") Integer id);
}
