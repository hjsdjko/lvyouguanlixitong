package com.dao;

import com.entity.TaocanaOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TaocanaOrderView;

/**
 * 套餐订单 Dao 接口
 *
 * @author 
 * @since 2021-04-23
 */
public interface TaocanaOrderDao extends BaseMapper<TaocanaOrderEntity> {

   List<TaocanaOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
