package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 套餐
 *
 * @author 
 * @email
 * @date 2021-04-23
 */
@TableName("taocana")
public class TaocanaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public TaocanaEntity() {

	}

	public TaocanaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 套餐名
     */
    @TableField(value = "taocana_name")

    private String taocanaName;


    /**
     * 套餐类型
     */
    @TableField(value = "taocana_types")

    private Integer taocanaTypes;


    /**
     * 套餐价格
     */
    @TableField(value = "taocana_money")

    private Double taocanaMoney;


    /**
     * 套餐照片
     */
    @TableField(value = "taocana_photo")

    private String taocanaPhoto;


    /**
     * 套餐详情
     */
    @TableField(value = "taocana_content")

    private String taocanaContent;


    /**
     * 套餐发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：套餐名
	 */
    public String getTaocanaName() {
        return taocanaName;
    }


    /**
	 * 获取：套餐名
	 */

    public void setTaocanaName(String taocanaName) {
        this.taocanaName = taocanaName;
    }
    /**
	 * 设置：套餐类型
	 */
    public Integer getTaocanaTypes() {
        return taocanaTypes;
    }


    /**
	 * 获取：套餐类型
	 */

    public void setTaocanaTypes(Integer taocanaTypes) {
        this.taocanaTypes = taocanaTypes;
    }
    /**
	 * 设置：套餐价格
	 */
    public Double getTaocanaMoney() {
        return taocanaMoney;
    }


    /**
	 * 获取：套餐价格
	 */

    public void setTaocanaMoney(Double taocanaMoney) {
        this.taocanaMoney = taocanaMoney;
    }
    /**
	 * 设置：套餐照片
	 */
    public String getTaocanaPhoto() {
        return taocanaPhoto;
    }


    /**
	 * 获取：套餐照片
	 */

    public void setTaocanaPhoto(String taocanaPhoto) {
        this.taocanaPhoto = taocanaPhoto;
    }
    /**
	 * 设置：套餐详情
	 */
    public String getTaocanaContent() {
        return taocanaContent;
    }


    /**
	 * 获取：套餐详情
	 */

    public void setTaocanaContent(String taocanaContent) {
        this.taocanaContent = taocanaContent;
    }
    /**
	 * 设置：套餐发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：套餐发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Taocana{" +
            "id=" + id +
            ", taocanaName=" + taocanaName +
            ", taocanaTypes=" + taocanaTypes +
            ", taocanaMoney=" + taocanaMoney +
            ", taocanaPhoto=" + taocanaPhoto +
            ", taocanaContent=" + taocanaContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
