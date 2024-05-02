package com.entity.model;

import com.entity.TaocanaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 套餐
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-23
 */
public class TaocanaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 套餐名
     */
    private String taocanaName;


    /**
     * 套餐类型
     */
    private Integer taocanaTypes;


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


    /**
     * 套餐发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：套餐名
	 */
    public String getTaocanaName() {
        return taocanaName;
    }


    /**
	 * 设置：套餐名
	 */
    public void setTaocanaName(String taocanaName) {
        this.taocanaName = taocanaName;
    }
    /**
	 * 获取：套餐类型
	 */
    public Integer getTaocanaTypes() {
        return taocanaTypes;
    }


    /**
	 * 设置：套餐类型
	 */
    public void setTaocanaTypes(Integer taocanaTypes) {
        this.taocanaTypes = taocanaTypes;
    }
    /**
	 * 获取：套餐价格
	 */
    public Double getTaocanaMoney() {
        return taocanaMoney;
    }


    /**
	 * 设置：套餐价格
	 */
    public void setTaocanaMoney(Double taocanaMoney) {
        this.taocanaMoney = taocanaMoney;
    }
    /**
	 * 获取：套餐照片
	 */
    public String getTaocanaPhoto() {
        return taocanaPhoto;
    }


    /**
	 * 设置：套餐照片
	 */
    public void setTaocanaPhoto(String taocanaPhoto) {
        this.taocanaPhoto = taocanaPhoto;
    }
    /**
	 * 获取：套餐详情
	 */
    public String getTaocanaContent() {
        return taocanaContent;
    }


    /**
	 * 设置：套餐详情
	 */
    public void setTaocanaContent(String taocanaContent) {
        this.taocanaContent = taocanaContent;
    }
    /**
	 * 获取：套餐发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：套餐发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
