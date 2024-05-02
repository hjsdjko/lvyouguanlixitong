package com.entity.view;

import com.entity.TaocanaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 套餐
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-23
 */
@TableName("taocana")
public class TaocanaView extends TaocanaEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 套餐类型的值
		*/
		private String taocanaValue;



	public TaocanaView() {

	}

	public TaocanaView(TaocanaEntity taocanaEntity) {
		try {
			BeanUtils.copyProperties(this, taocanaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 套餐类型的值
			*/
			public String getTaocanaValue() {
				return taocanaValue;
			}
			/**
			* 设置： 套餐类型的值
			*/
			public void setTaocanaValue(String taocanaValue) {
				this.taocanaValue = taocanaValue;
			}













}
