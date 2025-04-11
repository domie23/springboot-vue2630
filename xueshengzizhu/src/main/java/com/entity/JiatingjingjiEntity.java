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
 * 家庭经济信息
 *
 * @author 
 * @email
 */
@TableName("jiatingjingji")
public class JiatingjingjiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiatingjingjiEntity() {

	}

	public JiatingjingjiEntity(T t) {
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
     * 学生
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 家庭住址
     */
    @TableField(value = "jiatingjingji_name")

    private String jiatingjingjiName;


    /**
     * 家庭收入
     */
    @TableField(value = "jiatingjingji_money")

    private Double jiatingjingjiMoney;


    /**
     * 证明文件
     */
    @TableField(value = "jiatingjingji_file")

    private String jiatingjingjiFile;


    /**
     * 家庭类型
     */
    @TableField(value = "jiatingjingji_types")

    private Integer jiatingjingjiTypes;


    /**
     * 详情
     */
    @TableField(value = "jiatingjingji_content")

    private String jiatingjingjiContent;


    /**
     * 审核状态
     */
    @TableField(value = "jiatingjingji_yesno_types")

    private Integer jiatingjingjiYesnoTypes;


    /**
     * 审核结果
     */
    @TableField(value = "jiatingjingji_yesno_text")

    private String jiatingjingjiYesnoText;


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
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：家庭住址
	 */
    public String getJiatingjingjiName() {
        return jiatingjingjiName;
    }


    /**
	 * 获取：家庭住址
	 */

    public void setJiatingjingjiName(String jiatingjingjiName) {
        this.jiatingjingjiName = jiatingjingjiName;
    }
    /**
	 * 设置：家庭收入
	 */
    public Double getJiatingjingjiMoney() {
        return jiatingjingjiMoney;
    }


    /**
	 * 获取：家庭收入
	 */

    public void setJiatingjingjiMoney(Double jiatingjingjiMoney) {
        this.jiatingjingjiMoney = jiatingjingjiMoney;
    }
    /**
	 * 设置：证明文件
	 */
    public String getJiatingjingjiFile() {
        return jiatingjingjiFile;
    }


    /**
	 * 获取：证明文件
	 */

    public void setJiatingjingjiFile(String jiatingjingjiFile) {
        this.jiatingjingjiFile = jiatingjingjiFile;
    }
    /**
	 * 设置：家庭类型
	 */
    public Integer getJiatingjingjiTypes() {
        return jiatingjingjiTypes;
    }


    /**
	 * 获取：家庭类型
	 */

    public void setJiatingjingjiTypes(Integer jiatingjingjiTypes) {
        this.jiatingjingjiTypes = jiatingjingjiTypes;
    }
    /**
	 * 设置：详情
	 */
    public String getJiatingjingjiContent() {
        return jiatingjingjiContent;
    }


    /**
	 * 获取：详情
	 */

    public void setJiatingjingjiContent(String jiatingjingjiContent) {
        this.jiatingjingjiContent = jiatingjingjiContent;
    }
    /**
	 * 设置：审核状态
	 */
    public Integer getJiatingjingjiYesnoTypes() {
        return jiatingjingjiYesnoTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setJiatingjingjiYesnoTypes(Integer jiatingjingjiYesnoTypes) {
        this.jiatingjingjiYesnoTypes = jiatingjingjiYesnoTypes;
    }
    /**
	 * 设置：审核结果
	 */
    public String getJiatingjingjiYesnoText() {
        return jiatingjingjiYesnoText;
    }


    /**
	 * 获取：审核结果
	 */

    public void setJiatingjingjiYesnoText(String jiatingjingjiYesnoText) {
        this.jiatingjingjiYesnoText = jiatingjingjiYesnoText;
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
        return "Jiatingjingji{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", jiatingjingjiName=" + jiatingjingjiName +
            ", jiatingjingjiMoney=" + jiatingjingjiMoney +
            ", jiatingjingjiFile=" + jiatingjingjiFile +
            ", jiatingjingjiTypes=" + jiatingjingjiTypes +
            ", jiatingjingjiContent=" + jiatingjingjiContent +
            ", jiatingjingjiYesnoTypes=" + jiatingjingjiYesnoTypes +
            ", jiatingjingjiYesnoText=" + jiatingjingjiYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}
