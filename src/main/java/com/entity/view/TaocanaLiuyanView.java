package com.entity.view;

import com.entity.TaocanaLiuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 套餐留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-23
 */
@TableName("taocana_liuyan")
public class TaocanaLiuyanView extends TaocanaLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 taocana
			/**
			* 套餐名
			*/
			private String taocanaName;
			/**
			* 套餐类型
			*/
			private Integer taocanaTypes;
				/**
				* 套餐类型的值
				*/
				private String taocanaValue;
			/**
			* 套餐价格
			*/
			private Double taocanaMoney;
			/**
			* 套餐照片
			*/
			private String taocanaPhoto;
			/**
			* 套餐详情
			*/
			private String taocanaContent;
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 套餐发布时间
			*/
			private Date insertTime;

		//级联表 yonghu
			/**
			* 姓名
			*/
			private String yonghuName;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;

	public TaocanaLiuyanView() {

	}

	public TaocanaLiuyanView(TaocanaLiuyanEntity taocanaLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, taocanaLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

























				//级联表的get和set taocana
					/**
					* 获取： 套餐名
					*/
					public String getTaocanaName() {
						return taocanaName;
					}
					/**
					* 设置： 套餐名
					*/
					public void setTaocanaName(String taocanaName) {
						this.taocanaName = taocanaName;
					}
					/**
					* 获取： 套餐类型
					*/
					public Integer getTaocanaTypes() {
						return taocanaTypes;
					}
					/**
					* 设置： 套餐类型
					*/
					public void setTaocanaTypes(Integer taocanaTypes) {
						this.taocanaTypes = taocanaTypes;
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
					/**
					* 获取： 套餐价格
					*/
					public Double getTaocanaMoney() {
						return taocanaMoney;
					}
					/**
					* 设置： 套餐价格
					*/
					public void setTaocanaMoney(Double taocanaMoney) {
						this.taocanaMoney = taocanaMoney;
					}
					/**
					* 获取： 套餐照片
					*/
					public String getTaocanaPhoto() {
						return taocanaPhoto;
					}
					/**
					* 设置： 套餐照片
					*/
					public void setTaocanaPhoto(String taocanaPhoto) {
						this.taocanaPhoto = taocanaPhoto;
					}
					/**
					* 获取： 套餐详情
					*/
					public String getTaocanaContent() {
						return taocanaContent;
					}
					/**
					* 设置： 套餐详情
					*/
					public void setTaocanaContent(String taocanaContent) {
						this.taocanaContent = taocanaContent;
					}
					/**
					* 获取： 套餐发布时间
					*/
					public Date getInsertTime() {
						return insertTime;
					}
					/**
					* 设置： 套餐发布时间
					*/
					public void setInsertTime(Date insertTime) {
						this.insertTime = insertTime;
					}










				//级联表的get和set yonghu
					/**
					* 获取： 姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}



}
