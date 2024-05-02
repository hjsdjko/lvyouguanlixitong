package com.dao;

import com.entity.TaocanaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TaocanaView;

/**
 * 套餐 Dao 接口
 *
 * @author 
 * @since 2021-04-23
 */
public interface TaocanaDao extends BaseMapper<TaocanaEntity> {

   List<TaocanaView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
