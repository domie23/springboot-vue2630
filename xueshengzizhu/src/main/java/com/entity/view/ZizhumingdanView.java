package com.entity.view;

import com.entity.ZizhumingdanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 资助名单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zizhumingdan")
public class ZizhumingdanView extends ZizhumingdanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 jiatingjingji
			/**
			* 家庭经济信息 的 学生
			*/
			private Integer jiatingjingjiYonghuId;
			/**
			* 家庭住址
			*/
			private String jiatingjingjiName;
			/**
			* 家庭收入
			*/
			private Double jiatingjingjiMoney;
			/**
			* 证明文件
			*/
			private String jiatingjingjiFile;
			/**
			* 家庭类型
			*/
			private Integer jiatingjingjiTypes;
				/**
				* 家庭类型的值
				*/
				private String jiatingjingjiValue;
			/**
			* 详情
			*/
			private String jiatingjingjiContent;
			/**
			* 审核状态
			*/
			private Integer jiatingjingjiYesnoTypes;
				/**
				* 审核状态的值
				*/
				private String jiatingjingjiYesnoValue;
			/**
			* 审核结果
			*/
			private String jiatingjingjiYesnoText;

	public ZizhumingdanView() {

	}

	public ZizhumingdanView(ZizhumingdanEntity zizhumingdanEntity) {
		try {
			BeanUtils.copyProperties(this, zizhumingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}









				//级联表的get和set jiatingjingji
					/**
					* 获取：家庭经济信息 的 学生
					*/
					public Integer getJiatingjingjiYonghuId() {
						return jiatingjingjiYonghuId;
					}
					/**
					* 设置：家庭经济信息 的 学生
					*/
					public void setJiatingjingjiYonghuId(Integer jiatingjingjiYonghuId) {
						this.jiatingjingjiYonghuId = jiatingjingjiYonghuId;
					}

					/**
					* 获取： 家庭住址
					*/
					public String getJiatingjingjiName() {
						return jiatingjingjiName;
					}
					/**
					* 设置： 家庭住址
					*/
					public void setJiatingjingjiName(String jiatingjingjiName) {
						this.jiatingjingjiName = jiatingjingjiName;
					}
					/**
					* 获取： 家庭收入
					*/
					public Double getJiatingjingjiMoney() {
						return jiatingjingjiMoney;
					}
					/**
					* 设置： 家庭收入
					*/
					public void setJiatingjingjiMoney(Double jiatingjingjiMoney) {
						this.jiatingjingjiMoney = jiatingjingjiMoney;
					}
					/**
					* 获取： 证明文件
					*/
					public String getJiatingjingjiFile() {
						return jiatingjingjiFile;
					}
					/**
					* 设置： 证明文件
					*/
					public void setJiatingjingjiFile(String jiatingjingjiFile) {
						this.jiatingjingjiFile = jiatingjingjiFile;
					}
					/**
					* 获取： 家庭类型
					*/
					public Integer getJiatingjingjiTypes() {
						return jiatingjingjiTypes;
					}
					/**
					* 设置： 家庭类型
					*/
					public void setJiatingjingjiTypes(Integer jiatingjingjiTypes) {
						this.jiatingjingjiTypes = jiatingjingjiTypes;
					}


						/**
						* 获取： 家庭类型的值
						*/
						public String getJiatingjingjiValue() {
							return jiatingjingjiValue;
						}
						/**
						* 设置： 家庭类型的值
						*/
						public void setJiatingjingjiValue(String jiatingjingjiValue) {
							this.jiatingjingjiValue = jiatingjingjiValue;
						}
					/**
					* 获取： 详情
					*/
					public String getJiatingjingjiContent() {
						return jiatingjingjiContent;
					}
					/**
					* 设置： 详情
					*/
					public void setJiatingjingjiContent(String jiatingjingjiContent) {
						this.jiatingjingjiContent = jiatingjingjiContent;
					}
					/**
					* 获取： 审核状态
					*/
					public Integer getJiatingjingjiYesnoTypes() {
						return jiatingjingjiYesnoTypes;
					}
					/**
					* 设置： 审核状态
					*/
					public void setJiatingjingjiYesnoTypes(Integer jiatingjingjiYesnoTypes) {
						this.jiatingjingjiYesnoTypes = jiatingjingjiYesnoTypes;
					}


						/**
						* 获取： 审核状态的值
						*/
						public String getJiatingjingjiYesnoValue() {
							return jiatingjingjiYesnoValue;
						}
						/**
						* 设置： 审核状态的值
						*/
						public void setJiatingjingjiYesnoValue(String jiatingjingjiYesnoValue) {
							this.jiatingjingjiYesnoValue = jiatingjingjiYesnoValue;
						}
					/**
					* 获取： 审核结果
					*/
					public String getJiatingjingjiYesnoText() {
						return jiatingjingjiYesnoText;
					}
					/**
					* 设置： 审核结果
					*/
					public void setJiatingjingjiYesnoText(String jiatingjingjiYesnoText) {
						this.jiatingjingjiYesnoText = jiatingjingjiYesnoText;
					}










}
