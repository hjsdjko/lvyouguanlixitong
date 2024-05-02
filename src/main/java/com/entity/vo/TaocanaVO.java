package com.entity.vo;

import com.entity.TaocanaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 套餐
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-23
 */
@TableName("taocana")
public class TaocanaVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
