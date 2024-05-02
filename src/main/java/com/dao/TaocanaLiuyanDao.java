package com.dao;

import com.entity.TaocanaLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TaocanaLiuyanView;

/**
 * 套餐留言 Dao 接口
 *
 * @author 
 * @since 2021-04-23
 */
public interface TaocanaLiuyanDao extends BaseMapper<TaocanaLiuyanEntity> {

   List<TaocanaLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
