package com.entity.view;

import com.entity.YouxigonglueLiuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 攻略留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-20
 */
@TableName("youxigonglue_liuyan")
public class YouxigonglueLiuyanView extends YouxigonglueLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 yonghu
			/**
			* 用户姓名
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

		//级联表 youxigonglue
			/**
			* 标题
			*/
			private String youxigonglueName;
			/**
			* 分类
			*/
			private Integer youxigonglueTypes;
				/**
				* 分类的值
				*/
				private String youxigonglueValue;
			/**
			* 封面
			*/
			private String youxigongluePhoto;
			/**
			* 文件
			*/
			private String youxigonglueFile;
			/**
			* 简介
			*/
			private String youxigonglueContent;
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 添加时间
			*/
			private Date insertTime;

	public YouxigonglueLiuyanView() {

	}

	public YouxigonglueLiuyanView(YouxigonglueLiuyanEntity youxigonglueLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, youxigonglueLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}














				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
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


				//级联表的get和set youxigonglue
					/**
					* 获取： 标题
					*/
					public String getYouxigonglueName() {
						return youxigonglueName;
					}
					/**
					* 设置： 标题
					*/
					public void setYouxigonglueName(String youxigonglueName) {
						this.youxigonglueName = youxigonglueName;
					}
					/**
					* 获取： 分类
					*/
					public Integer getYouxigonglueTypes() {
						return youxigonglueTypes;
					}
					/**
					* 设置： 分类
					*/
					public void setYouxigonglueTypes(Integer youxigonglueTypes) {
						this.youxigonglueTypes = youxigonglueTypes;
					}


						/**
						* 获取： 分类的值
						*/
						public String getYouxigonglueValue() {
							return youxigonglueValue;
						}
						/**
						* 设置： 分类的值
						*/
						public void setYouxigonglueValue(String youxigonglueValue) {
							this.youxigonglueValue = youxigonglueValue;
						}
					/**
					* 获取： 封面
					*/
					public String getYouxigongluePhoto() {
						return youxigongluePhoto;
					}
					/**
					* 设置： 封面
					*/
					public void setYouxigongluePhoto(String youxigongluePhoto) {
						this.youxigongluePhoto = youxigongluePhoto;
					}
					/**
					* 获取： 文件
					*/
					public String getYouxigonglueFile() {
						return youxigonglueFile;
					}
					/**
					* 设置： 文件
					*/
					public void setYouxigonglueFile(String youxigonglueFile) {
						this.youxigonglueFile = youxigonglueFile;
					}
					/**
					* 获取： 简介
					*/
					public String getYouxigonglueContent() {
						return youxigonglueContent;
					}
					/**
					* 设置： 简介
					*/
					public void setYouxigonglueContent(String youxigonglueContent) {
						this.youxigonglueContent = youxigonglueContent;
					}
					/**
					* 获取： 添加时间
					*/
					public Date getInsertTime() {
						return insertTime;
					}
					/**
					* 设置： 添加时间
					*/
					public void setInsertTime(Date insertTime) {
						this.insertTime = insertTime;
					}










}
