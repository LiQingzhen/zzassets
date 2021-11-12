package com.zzassets.assets.domain;

import java.io.Serializable;

import com.zzassets.common.core.domain.BaseEntity;
import lombok.Data;

/**
 * assets_accounts
 * @author 
 */
@Data
public class AssetsAccount extends BaseEntity implements Serializable {
    private String id;

    /**
     * 账户种类id
     */
    private String acctType;

    /**
     * 账户名称
     */
    private String acctName;

    /**
     * 图标id
     */
    private String icon;

    /**
     * 人民币，单位-分
     */
    private Long rmb;

    /**
     * 是否计入总资产
     */
    private String isAssets;

    /**
     * 备注
     */
    private String remark;

    /**
     * 账户状态  enable, disable
     */
    private String status;

    /**
     * 账户所属人
     */
    private String holder;

    private static final long serialVersionUID = 1L;
}