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
 * 攻略留言
 *
 * @author 
 * @email
 * @date 2021-04-20
 */
@TableName("youxigonglue_liuyan")
public class YouxigonglueLiuyanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YouxigonglueLiuyanEntity() {

	}

	public YouxigonglueLiuyanEntity(T t) {
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
     * 攻略id
     */
    @TableField(value = "youxigonglue_id")

    private Integer youxigonglueId;


    /**
     * 用户id
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 留言内容
     */
    @TableField(value = "youxigonglue_liuyan_content")

    private String youxigonglueLiuyanContent;


    /**
     * 回复内容
     */
    @TableField(value = "reply_content")

    private String replyContent;


    /**
     * 讨论时间
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
	 * 设置：攻略id
	 */
    public Integer getYouxigonglueId() {
        return youxigonglueId;
    }


    /**
	 * 获取：攻略id
	 */

    public void setYouxigonglueId(Integer youxigonglueId) {
        this.youxigonglueId = youxigonglueId;
    }
    /**
	 * 设置：用户id
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户id
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：留言内容
	 */
    public String getYouxigonglueLiuyanContent() {
        return youxigonglueLiuyanContent;
    }


    /**
	 * 获取：留言内容
	 */

    public void setYouxigonglueLiuyanContent(String youxigonglueLiuyanContent) {
        this.youxigonglueLiuyanContent = youxigonglueLiuyanContent;
    }
    /**
	 * 设置：回复内容
	 */
    public String getReplyContent() {
        return replyContent;
    }


    /**
	 * 获取：回复内容
	 */

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }
    /**
	 * 设置：讨论时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：讨论时间
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
        return "YouxigonglueLiuyan{" +
            "id=" + id +
            ", youxigonglueId=" + youxigonglueId +
            ", yonghuId=" + yonghuId +
            ", youxigonglueLiuyanContent=" + youxigonglueLiuyanContent +
            ", replyContent=" + replyContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
