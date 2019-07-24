package com.seventhree.st.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNull() {
            addCriterion("pass_word is null");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNotNull() {
            addCriterion("pass_word is not null");
            return (Criteria) this;
        }

        public Criteria andPassWordEqualTo(String value) {
            addCriterion("pass_word =", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotEqualTo(String value) {
            addCriterion("pass_word <>", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThan(String value) {
            addCriterion("pass_word >", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThanOrEqualTo(String value) {
            addCriterion("pass_word >=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThan(String value) {
            addCriterion("pass_word <", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThanOrEqualTo(String value) {
            addCriterion("pass_word <=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLike(String value) {
            addCriterion("pass_word like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotLike(String value) {
            addCriterion("pass_word not like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordIn(List<String> values) {
            addCriterion("pass_word in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotIn(List<String> values) {
            addCriterion("pass_word not in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordBetween(String value1, String value2) {
            addCriterion("pass_word between", value1, value2, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotBetween(String value1, String value2) {
            addCriterion("pass_word not between", value1, value2, "passWord");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andRefererIsNull() {
            addCriterion("referer is null");
            return (Criteria) this;
        }

        public Criteria andRefererIsNotNull() {
            addCriterion("referer is not null");
            return (Criteria) this;
        }

        public Criteria andRefererEqualTo(Integer value) {
            addCriterion("referer =", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererNotEqualTo(Integer value) {
            addCriterion("referer <>", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererGreaterThan(Integer value) {
            addCriterion("referer >", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererGreaterThanOrEqualTo(Integer value) {
            addCriterion("referer >=", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererLessThan(Integer value) {
            addCriterion("referer <", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererLessThanOrEqualTo(Integer value) {
            addCriterion("referer <=", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererIn(List<Integer> values) {
            addCriterion("referer in", values, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererNotIn(List<Integer> values) {
            addCriterion("referer not in", values, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererBetween(Integer value1, Integer value2) {
            addCriterion("referer between", value1, value2, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererNotBetween(Integer value1, Integer value2) {
            addCriterion("referer not between", value1, value2, "referer");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIsNull() {
            addCriterion("pay_password is null");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIsNotNull() {
            addCriterion("pay_password is not null");
            return (Criteria) this;
        }

        public Criteria andPayPasswordEqualTo(String value) {
            addCriterion("pay_password =", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotEqualTo(String value) {
            addCriterion("pay_password <>", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordGreaterThan(String value) {
            addCriterion("pay_password >", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("pay_password >=", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLessThan(String value) {
            addCriterion("pay_password <", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLessThanOrEqualTo(String value) {
            addCriterion("pay_password <=", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLike(String value) {
            addCriterion("pay_password like", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotLike(String value) {
            addCriterion("pay_password not like", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIn(List<String> values) {
            addCriterion("pay_password in", values, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotIn(List<String> values) {
            addCriterion("pay_password not in", values, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordBetween(String value1, String value2) {
            addCriterion("pay_password between", value1, value2, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotBetween(String value1, String value2) {
            addCriterion("pay_password not between", value1, value2, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("pic_url =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("pic_url <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("pic_url >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pic_url >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("pic_url <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("pic_url <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("pic_url like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("pic_url not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("pic_url in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("pic_url not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("pic_url between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("pic_url not between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andMailNumIsNull() {
            addCriterion("mail_num is null");
            return (Criteria) this;
        }

        public Criteria andMailNumIsNotNull() {
            addCriterion("mail_num is not null");
            return (Criteria) this;
        }

        public Criteria andMailNumEqualTo(String value) {
            addCriterion("mail_num =", value, "mailNum");
            return (Criteria) this;
        }

        public Criteria andMailNumNotEqualTo(String value) {
            addCriterion("mail_num <>", value, "mailNum");
            return (Criteria) this;
        }

        public Criteria andMailNumGreaterThan(String value) {
            addCriterion("mail_num >", value, "mailNum");
            return (Criteria) this;
        }

        public Criteria andMailNumGreaterThanOrEqualTo(String value) {
            addCriterion("mail_num >=", value, "mailNum");
            return (Criteria) this;
        }

        public Criteria andMailNumLessThan(String value) {
            addCriterion("mail_num <", value, "mailNum");
            return (Criteria) this;
        }

        public Criteria andMailNumLessThanOrEqualTo(String value) {
            addCriterion("mail_num <=", value, "mailNum");
            return (Criteria) this;
        }

        public Criteria andMailNumLike(String value) {
            addCriterion("mail_num like", value, "mailNum");
            return (Criteria) this;
        }

        public Criteria andMailNumNotLike(String value) {
            addCriterion("mail_num not like", value, "mailNum");
            return (Criteria) this;
        }

        public Criteria andMailNumIn(List<String> values) {
            addCriterion("mail_num in", values, "mailNum");
            return (Criteria) this;
        }

        public Criteria andMailNumNotIn(List<String> values) {
            addCriterion("mail_num not in", values, "mailNum");
            return (Criteria) this;
        }

        public Criteria andMailNumBetween(String value1, String value2) {
            addCriterion("mail_num between", value1, value2, "mailNum");
            return (Criteria) this;
        }

        public Criteria andMailNumNotBetween(String value1, String value2) {
            addCriterion("mail_num not between", value1, value2, "mailNum");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlaIsNull() {
            addCriterion("IDcard_urlA is null");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlaIsNotNull() {
            addCriterion("IDcard_urlA is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlaEqualTo(String value) {
            addCriterion("IDcard_urlA =", value, "idcardUrla");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlaNotEqualTo(String value) {
            addCriterion("IDcard_urlA <>", value, "idcardUrla");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlaGreaterThan(String value) {
            addCriterion("IDcard_urlA >", value, "idcardUrla");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlaGreaterThanOrEqualTo(String value) {
            addCriterion("IDcard_urlA >=", value, "idcardUrla");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlaLessThan(String value) {
            addCriterion("IDcard_urlA <", value, "idcardUrla");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlaLessThanOrEqualTo(String value) {
            addCriterion("IDcard_urlA <=", value, "idcardUrla");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlaLike(String value) {
            addCriterion("IDcard_urlA like", value, "idcardUrla");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlaNotLike(String value) {
            addCriterion("IDcard_urlA not like", value, "idcardUrla");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlaIn(List<String> values) {
            addCriterion("IDcard_urlA in", values, "idcardUrla");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlaNotIn(List<String> values) {
            addCriterion("IDcard_urlA not in", values, "idcardUrla");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlaBetween(String value1, String value2) {
            addCriterion("IDcard_urlA between", value1, value2, "idcardUrla");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlaNotBetween(String value1, String value2) {
            addCriterion("IDcard_urlA not between", value1, value2, "idcardUrla");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlbIsNull() {
            addCriterion("IDcard_urlB is null");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlbIsNotNull() {
            addCriterion("IDcard_urlB is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlbEqualTo(String value) {
            addCriterion("IDcard_urlB =", value, "idcardUrlb");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlbNotEqualTo(String value) {
            addCriterion("IDcard_urlB <>", value, "idcardUrlb");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlbGreaterThan(String value) {
            addCriterion("IDcard_urlB >", value, "idcardUrlb");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlbGreaterThanOrEqualTo(String value) {
            addCriterion("IDcard_urlB >=", value, "idcardUrlb");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlbLessThan(String value) {
            addCriterion("IDcard_urlB <", value, "idcardUrlb");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlbLessThanOrEqualTo(String value) {
            addCriterion("IDcard_urlB <=", value, "idcardUrlb");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlbLike(String value) {
            addCriterion("IDcard_urlB like", value, "idcardUrlb");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlbNotLike(String value) {
            addCriterion("IDcard_urlB not like", value, "idcardUrlb");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlbIn(List<String> values) {
            addCriterion("IDcard_urlB in", values, "idcardUrlb");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlbNotIn(List<String> values) {
            addCriterion("IDcard_urlB not in", values, "idcardUrlb");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlbBetween(String value1, String value2) {
            addCriterion("IDcard_urlB between", value1, value2, "idcardUrlb");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlbNotBetween(String value1, String value2) {
            addCriterion("IDcard_urlB not between", value1, value2, "idcardUrlb");
            return (Criteria) this;
        }

        public Criteria andWalletEthAddressIsNull() {
            addCriterion("wallet_eth_address is null");
            return (Criteria) this;
        }

        public Criteria andWalletEthAddressIsNotNull() {
            addCriterion("wallet_eth_address is not null");
            return (Criteria) this;
        }

        public Criteria andWalletEthAddressEqualTo(String value) {
            addCriterion("wallet_eth_address =", value, "walletEthAddress");
            return (Criteria) this;
        }

        public Criteria andWalletEthAddressNotEqualTo(String value) {
            addCriterion("wallet_eth_address <>", value, "walletEthAddress");
            return (Criteria) this;
        }

        public Criteria andWalletEthAddressGreaterThan(String value) {
            addCriterion("wallet_eth_address >", value, "walletEthAddress");
            return (Criteria) this;
        }

        public Criteria andWalletEthAddressGreaterThanOrEqualTo(String value) {
            addCriterion("wallet_eth_address >=", value, "walletEthAddress");
            return (Criteria) this;
        }

        public Criteria andWalletEthAddressLessThan(String value) {
            addCriterion("wallet_eth_address <", value, "walletEthAddress");
            return (Criteria) this;
        }

        public Criteria andWalletEthAddressLessThanOrEqualTo(String value) {
            addCriterion("wallet_eth_address <=", value, "walletEthAddress");
            return (Criteria) this;
        }

        public Criteria andWalletEthAddressLike(String value) {
            addCriterion("wallet_eth_address like", value, "walletEthAddress");
            return (Criteria) this;
        }

        public Criteria andWalletEthAddressNotLike(String value) {
            addCriterion("wallet_eth_address not like", value, "walletEthAddress");
            return (Criteria) this;
        }

        public Criteria andWalletEthAddressIn(List<String> values) {
            addCriterion("wallet_eth_address in", values, "walletEthAddress");
            return (Criteria) this;
        }

        public Criteria andWalletEthAddressNotIn(List<String> values) {
            addCriterion("wallet_eth_address not in", values, "walletEthAddress");
            return (Criteria) this;
        }

        public Criteria andWalletEthAddressBetween(String value1, String value2) {
            addCriterion("wallet_eth_address between", value1, value2, "walletEthAddress");
            return (Criteria) this;
        }

        public Criteria andWalletEthAddressNotBetween(String value1, String value2) {
            addCriterion("wallet_eth_address not between", value1, value2, "walletEthAddress");
            return (Criteria) this;
        }

        public Criteria andWalletEthPrivatekeyIsNull() {
            addCriterion("wallet_eth_privatekey is null");
            return (Criteria) this;
        }

        public Criteria andWalletEthPrivatekeyIsNotNull() {
            addCriterion("wallet_eth_privatekey is not null");
            return (Criteria) this;
        }

        public Criteria andWalletEthPrivatekeyEqualTo(String value) {
            addCriterion("wallet_eth_privatekey =", value, "walletEthPrivatekey");
            return (Criteria) this;
        }

        public Criteria andWalletEthPrivatekeyNotEqualTo(String value) {
            addCriterion("wallet_eth_privatekey <>", value, "walletEthPrivatekey");
            return (Criteria) this;
        }

        public Criteria andWalletEthPrivatekeyGreaterThan(String value) {
            addCriterion("wallet_eth_privatekey >", value, "walletEthPrivatekey");
            return (Criteria) this;
        }

        public Criteria andWalletEthPrivatekeyGreaterThanOrEqualTo(String value) {
            addCriterion("wallet_eth_privatekey >=", value, "walletEthPrivatekey");
            return (Criteria) this;
        }

        public Criteria andWalletEthPrivatekeyLessThan(String value) {
            addCriterion("wallet_eth_privatekey <", value, "walletEthPrivatekey");
            return (Criteria) this;
        }

        public Criteria andWalletEthPrivatekeyLessThanOrEqualTo(String value) {
            addCriterion("wallet_eth_privatekey <=", value, "walletEthPrivatekey");
            return (Criteria) this;
        }

        public Criteria andWalletEthPrivatekeyLike(String value) {
            addCriterion("wallet_eth_privatekey like", value, "walletEthPrivatekey");
            return (Criteria) this;
        }

        public Criteria andWalletEthPrivatekeyNotLike(String value) {
            addCriterion("wallet_eth_privatekey not like", value, "walletEthPrivatekey");
            return (Criteria) this;
        }

        public Criteria andWalletEthPrivatekeyIn(List<String> values) {
            addCriterion("wallet_eth_privatekey in", values, "walletEthPrivatekey");
            return (Criteria) this;
        }

        public Criteria andWalletEthPrivatekeyNotIn(List<String> values) {
            addCriterion("wallet_eth_privatekey not in", values, "walletEthPrivatekey");
            return (Criteria) this;
        }

        public Criteria andWalletEthPrivatekeyBetween(String value1, String value2) {
            addCriterion("wallet_eth_privatekey between", value1, value2, "walletEthPrivatekey");
            return (Criteria) this;
        }

        public Criteria andWalletEthPrivatekeyNotBetween(String value1, String value2) {
            addCriterion("wallet_eth_privatekey not between", value1, value2, "walletEthPrivatekey");
            return (Criteria) this;
        }

        public Criteria andWalletBtcAddressIsNull() {
            addCriterion("wallet_btc_address is null");
            return (Criteria) this;
        }

        public Criteria andWalletBtcAddressIsNotNull() {
            addCriterion("wallet_btc_address is not null");
            return (Criteria) this;
        }

        public Criteria andWalletBtcAddressEqualTo(String value) {
            addCriterion("wallet_btc_address =", value, "walletBtcAddress");
            return (Criteria) this;
        }

        public Criteria andWalletBtcAddressNotEqualTo(String value) {
            addCriterion("wallet_btc_address <>", value, "walletBtcAddress");
            return (Criteria) this;
        }

        public Criteria andWalletBtcAddressGreaterThan(String value) {
            addCriterion("wallet_btc_address >", value, "walletBtcAddress");
            return (Criteria) this;
        }

        public Criteria andWalletBtcAddressGreaterThanOrEqualTo(String value) {
            addCriterion("wallet_btc_address >=", value, "walletBtcAddress");
            return (Criteria) this;
        }

        public Criteria andWalletBtcAddressLessThan(String value) {
            addCriterion("wallet_btc_address <", value, "walletBtcAddress");
            return (Criteria) this;
        }

        public Criteria andWalletBtcAddressLessThanOrEqualTo(String value) {
            addCriterion("wallet_btc_address <=", value, "walletBtcAddress");
            return (Criteria) this;
        }

        public Criteria andWalletBtcAddressLike(String value) {
            addCriterion("wallet_btc_address like", value, "walletBtcAddress");
            return (Criteria) this;
        }

        public Criteria andWalletBtcAddressNotLike(String value) {
            addCriterion("wallet_btc_address not like", value, "walletBtcAddress");
            return (Criteria) this;
        }

        public Criteria andWalletBtcAddressIn(List<String> values) {
            addCriterion("wallet_btc_address in", values, "walletBtcAddress");
            return (Criteria) this;
        }

        public Criteria andWalletBtcAddressNotIn(List<String> values) {
            addCriterion("wallet_btc_address not in", values, "walletBtcAddress");
            return (Criteria) this;
        }

        public Criteria andWalletBtcAddressBetween(String value1, String value2) {
            addCriterion("wallet_btc_address between", value1, value2, "walletBtcAddress");
            return (Criteria) this;
        }

        public Criteria andWalletBtcAddressNotBetween(String value1, String value2) {
            addCriterion("wallet_btc_address not between", value1, value2, "walletBtcAddress");
            return (Criteria) this;
        }

        public Criteria andWalletBtcPrivatekeyIsNull() {
            addCriterion("wallet_btc_privateKey is null");
            return (Criteria) this;
        }

        public Criteria andWalletBtcPrivatekeyIsNotNull() {
            addCriterion("wallet_btc_privateKey is not null");
            return (Criteria) this;
        }

        public Criteria andWalletBtcPrivatekeyEqualTo(String value) {
            addCriterion("wallet_btc_privateKey =", value, "walletBtcPrivatekey");
            return (Criteria) this;
        }

        public Criteria andWalletBtcPrivatekeyNotEqualTo(String value) {
            addCriterion("wallet_btc_privateKey <>", value, "walletBtcPrivatekey");
            return (Criteria) this;
        }

        public Criteria andWalletBtcPrivatekeyGreaterThan(String value) {
            addCriterion("wallet_btc_privateKey >", value, "walletBtcPrivatekey");
            return (Criteria) this;
        }

        public Criteria andWalletBtcPrivatekeyGreaterThanOrEqualTo(String value) {
            addCriterion("wallet_btc_privateKey >=", value, "walletBtcPrivatekey");
            return (Criteria) this;
        }

        public Criteria andWalletBtcPrivatekeyLessThan(String value) {
            addCriterion("wallet_btc_privateKey <", value, "walletBtcPrivatekey");
            return (Criteria) this;
        }

        public Criteria andWalletBtcPrivatekeyLessThanOrEqualTo(String value) {
            addCriterion("wallet_btc_privateKey <=", value, "walletBtcPrivatekey");
            return (Criteria) this;
        }

        public Criteria andWalletBtcPrivatekeyLike(String value) {
            addCriterion("wallet_btc_privateKey like", value, "walletBtcPrivatekey");
            return (Criteria) this;
        }

        public Criteria andWalletBtcPrivatekeyNotLike(String value) {
            addCriterion("wallet_btc_privateKey not like", value, "walletBtcPrivatekey");
            return (Criteria) this;
        }

        public Criteria andWalletBtcPrivatekeyIn(List<String> values) {
            addCriterion("wallet_btc_privateKey in", values, "walletBtcPrivatekey");
            return (Criteria) this;
        }

        public Criteria andWalletBtcPrivatekeyNotIn(List<String> values) {
            addCriterion("wallet_btc_privateKey not in", values, "walletBtcPrivatekey");
            return (Criteria) this;
        }

        public Criteria andWalletBtcPrivatekeyBetween(String value1, String value2) {
            addCriterion("wallet_btc_privateKey between", value1, value2, "walletBtcPrivatekey");
            return (Criteria) this;
        }

        public Criteria andWalletBtcPrivatekeyNotBetween(String value1, String value2) {
            addCriterion("wallet_btc_privateKey not between", value1, value2, "walletBtcPrivatekey");
            return (Criteria) this;
        }

        public Criteria andWalletEosAddressIsNull() {
            addCriterion("wallet_eos_address is null");
            return (Criteria) this;
        }

        public Criteria andWalletEosAddressIsNotNull() {
            addCriterion("wallet_eos_address is not null");
            return (Criteria) this;
        }

        public Criteria andWalletEosAddressEqualTo(String value) {
            addCriterion("wallet_eos_address =", value, "walletEosAddress");
            return (Criteria) this;
        }

        public Criteria andWalletEosAddressNotEqualTo(String value) {
            addCriterion("wallet_eos_address <>", value, "walletEosAddress");
            return (Criteria) this;
        }

        public Criteria andWalletEosAddressGreaterThan(String value) {
            addCriterion("wallet_eos_address >", value, "walletEosAddress");
            return (Criteria) this;
        }

        public Criteria andWalletEosAddressGreaterThanOrEqualTo(String value) {
            addCriterion("wallet_eos_address >=", value, "walletEosAddress");
            return (Criteria) this;
        }

        public Criteria andWalletEosAddressLessThan(String value) {
            addCriterion("wallet_eos_address <", value, "walletEosAddress");
            return (Criteria) this;
        }

        public Criteria andWalletEosAddressLessThanOrEqualTo(String value) {
            addCriterion("wallet_eos_address <=", value, "walletEosAddress");
            return (Criteria) this;
        }

        public Criteria andWalletEosAddressLike(String value) {
            addCriterion("wallet_eos_address like", value, "walletEosAddress");
            return (Criteria) this;
        }

        public Criteria andWalletEosAddressNotLike(String value) {
            addCriterion("wallet_eos_address not like", value, "walletEosAddress");
            return (Criteria) this;
        }

        public Criteria andWalletEosAddressIn(List<String> values) {
            addCriterion("wallet_eos_address in", values, "walletEosAddress");
            return (Criteria) this;
        }

        public Criteria andWalletEosAddressNotIn(List<String> values) {
            addCriterion("wallet_eos_address not in", values, "walletEosAddress");
            return (Criteria) this;
        }

        public Criteria andWalletEosAddressBetween(String value1, String value2) {
            addCriterion("wallet_eos_address between", value1, value2, "walletEosAddress");
            return (Criteria) this;
        }

        public Criteria andWalletEosAddressNotBetween(String value1, String value2) {
            addCriterion("wallet_eos_address not between", value1, value2, "walletEosAddress");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}