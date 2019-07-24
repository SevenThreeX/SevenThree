package com.seventhree.st.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class User implements Serializable {
    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户密码
     */
    private String passWord;

    /**
     * 用户电话
     */
    private String phone;

    /**
     * 用户性别
     */
    private String sex;

    /**
     * 用户推荐码
     */
    private String avatar;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 推荐人
     */
    private Integer referer;

    /**
     * 支付密码
     */
    private String payPassword;

    /**
     * 用户头像url
     */
    private String picUrl;

    /**
     * 用户邮箱
     */
    private String mailNum;

    /**
     * 用户身份证正面
     */
    private String idcardUrla;

    /**
     * 用户身份证反面
     */
    private String idcardUrlb;

    /**
     * 以太坊钱包地址
     */
    private String walletEthAddress;

    /**
     * 以太坊钱包私钥
     */
    private String walletEthPrivatekey;

    /**
     * 比特币钱包地址
     */
    private String walletBtcAddress;

    /**
     * 比特币钱包私钥
     */
    private String walletBtcPrivatekey;

    /**
     * eos钱包地址
     */
    private String walletEosAddress;

    /**
     * 身份证标识：-1：未上传，0：审核失败 1：审核成功 2：审核中
     */
    private Integer flag;

    /**
     * 支付密码标识：0：未设置，1：已设置
     */
    private Integer status;

    /**
     * 用户创建时间
     */
    private Date createDate;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getReferer() {
        return referer;
    }

    public void setReferer(Integer referer) {
        this.referer = referer;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getMailNum() {
        return mailNum;
    }

    public void setMailNum(String mailNum) {
        this.mailNum = mailNum;
    }

    public String getIdcardUrla() {
        return idcardUrla;
    }

    public void setIdcardUrla(String idcardUrla) {
        this.idcardUrla = idcardUrla;
    }

    public String getIdcardUrlb() {
        return idcardUrlb;
    }

    public void setIdcardUrlb(String idcardUrlb) {
        this.idcardUrlb = idcardUrlb;
    }

    public String getWalletEthAddress() {
        return walletEthAddress;
    }

    public void setWalletEthAddress(String walletEthAddress) {
        this.walletEthAddress = walletEthAddress;
    }

    public String getWalletEthPrivatekey() {
        return walletEthPrivatekey;
    }

    public void setWalletEthPrivatekey(String walletEthPrivatekey) {
        this.walletEthPrivatekey = walletEthPrivatekey;
    }

    public String getWalletBtcAddress() {
        return walletBtcAddress;
    }

    public void setWalletBtcAddress(String walletBtcAddress) {
        this.walletBtcAddress = walletBtcAddress;
    }

    public String getWalletBtcPrivatekey() {
        return walletBtcPrivatekey;
    }

    public void setWalletBtcPrivatekey(String walletBtcPrivatekey) {
        this.walletBtcPrivatekey = walletBtcPrivatekey;
    }

    public String getWalletEosAddress() {
        return walletEosAddress;
    }

    public void setWalletEosAddress(String walletEosAddress) {
        this.walletEosAddress = walletEosAddress;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getPassWord() == null ? other.getPassWord() == null : this.getPassWord().equals(other.getPassWord()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getNickName() == null ? other.getNickName() == null : this.getNickName().equals(other.getNickName()))
            && (this.getReferer() == null ? other.getReferer() == null : this.getReferer().equals(other.getReferer()))
            && (this.getPayPassword() == null ? other.getPayPassword() == null : this.getPayPassword().equals(other.getPayPassword()))
            && (this.getPicUrl() == null ? other.getPicUrl() == null : this.getPicUrl().equals(other.getPicUrl()))
            && (this.getMailNum() == null ? other.getMailNum() == null : this.getMailNum().equals(other.getMailNum()))
            && (this.getIdcardUrla() == null ? other.getIdcardUrla() == null : this.getIdcardUrla().equals(other.getIdcardUrla()))
            && (this.getIdcardUrlb() == null ? other.getIdcardUrlb() == null : this.getIdcardUrlb().equals(other.getIdcardUrlb()))
            && (this.getWalletEthAddress() == null ? other.getWalletEthAddress() == null : this.getWalletEthAddress().equals(other.getWalletEthAddress()))
            && (this.getWalletEthPrivatekey() == null ? other.getWalletEthPrivatekey() == null : this.getWalletEthPrivatekey().equals(other.getWalletEthPrivatekey()))
            && (this.getWalletBtcAddress() == null ? other.getWalletBtcAddress() == null : this.getWalletBtcAddress().equals(other.getWalletBtcAddress()))
            && (this.getWalletBtcPrivatekey() == null ? other.getWalletBtcPrivatekey() == null : this.getWalletBtcPrivatekey().equals(other.getWalletBtcPrivatekey()))
            && (this.getWalletEosAddress() == null ? other.getWalletEosAddress() == null : this.getWalletEosAddress().equals(other.getWalletEosAddress()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getPassWord() == null) ? 0 : getPassWord().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getNickName() == null) ? 0 : getNickName().hashCode());
        result = prime * result + ((getReferer() == null) ? 0 : getReferer().hashCode());
        result = prime * result + ((getPayPassword() == null) ? 0 : getPayPassword().hashCode());
        result = prime * result + ((getPicUrl() == null) ? 0 : getPicUrl().hashCode());
        result = prime * result + ((getMailNum() == null) ? 0 : getMailNum().hashCode());
        result = prime * result + ((getIdcardUrla() == null) ? 0 : getIdcardUrla().hashCode());
        result = prime * result + ((getIdcardUrlb() == null) ? 0 : getIdcardUrlb().hashCode());
        result = prime * result + ((getWalletEthAddress() == null) ? 0 : getWalletEthAddress().hashCode());
        result = prime * result + ((getWalletEthPrivatekey() == null) ? 0 : getWalletEthPrivatekey().hashCode());
        result = prime * result + ((getWalletBtcAddress() == null) ? 0 : getWalletBtcAddress().hashCode());
        result = prime * result + ((getWalletBtcPrivatekey() == null) ? 0 : getWalletBtcPrivatekey().hashCode());
        result = prime * result + ((getWalletEosAddress() == null) ? 0 : getWalletEosAddress().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", passWord=").append(passWord);
        sb.append(", phone=").append(phone);
        sb.append(", sex=").append(sex);
        sb.append(", avatar=").append(avatar);
        sb.append(", nickName=").append(nickName);
        sb.append(", referer=").append(referer);
        sb.append(", payPassword=").append(payPassword);
        sb.append(", picUrl=").append(picUrl);
        sb.append(", mailNum=").append(mailNum);
        sb.append(", idcardUrla=").append(idcardUrla);
        sb.append(", idcardUrlb=").append(idcardUrlb);
        sb.append(", walletEthAddress=").append(walletEthAddress);
        sb.append(", walletEthPrivatekey=").append(walletEthPrivatekey);
        sb.append(", walletBtcAddress=").append(walletBtcAddress);
        sb.append(", walletBtcPrivatekey=").append(walletBtcPrivatekey);
        sb.append(", walletEosAddress=").append(walletEosAddress);
        sb.append(", flag=").append(flag);
        sb.append(", status=").append(status);
        sb.append(", createDate=").append(createDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}