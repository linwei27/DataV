package com.tydic.datav.dao.po;

import java.util.ArrayList;
import java.util.List;


public class TZxjzyxqkExample {
	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TZxjzyxqkExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDwIsNull() {
            addCriterion("dw is null");
            return (Criteria) this;
        }

        public Criteria andDwIsNotNull() {
            addCriterion("dw is not null");
            return (Criteria) this;
        }

        public Criteria andDwEqualTo(String value) {
            addCriterion("dw =", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwNotEqualTo(String value) {
            addCriterion("dw <>", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwGreaterThan(String value) {
            addCriterion("dw >", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwGreaterThanOrEqualTo(String value) {
            addCriterion("dw >=", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwLessThan(String value) {
            addCriterion("dw <", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwLessThanOrEqualTo(String value) {
            addCriterion("dw <=", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwLike(String value) {
            addCriterion("dw like", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwNotLike(String value) {
            addCriterion("dw not like", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwIn(List<String> values) {
            addCriterion("dw in", values, "dw");
            return (Criteria) this;
        }

        public Criteria andDwNotIn(List<String> values) {
            addCriterion("dw not in", values, "dw");
            return (Criteria) this;
        }

        public Criteria andDwBetween(String value1, String value2) {
            addCriterion("dw between", value1, value2, "dw");
            return (Criteria) this;
        }

        public Criteria andDwNotBetween(String value1, String value2) {
            addCriterion("dw not between", value1, value2, "dw");
            return (Criteria) this;
        }

        public Criteria andYpsIsNull() {
            addCriterion("yps is null");
            return (Criteria) this;
        }

        public Criteria andYpsIsNotNull() {
            addCriterion("yps is not null");
            return (Criteria) this;
        }

        public Criteria andYpsEqualTo(String value) {
            addCriterion("yps =", value, "yps");
            return (Criteria) this;
        }

        public Criteria andYpsNotEqualTo(String value) {
            addCriterion("yps <>", value, "yps");
            return (Criteria) this;
        }

        public Criteria andYpsGreaterThan(String value) {
            addCriterion("yps >", value, "yps");
            return (Criteria) this;
        }

        public Criteria andYpsGreaterThanOrEqualTo(String value) {
            addCriterion("yps >=", value, "yps");
            return (Criteria) this;
        }

        public Criteria andYpsLessThan(String value) {
            addCriterion("yps <", value, "yps");
            return (Criteria) this;
        }

        public Criteria andYpsLessThanOrEqualTo(String value) {
            addCriterion("yps <=", value, "yps");
            return (Criteria) this;
        }

        public Criteria andYpsLike(String value) {
            addCriterion("yps like", value, "yps");
            return (Criteria) this;
        }

        public Criteria andYpsNotLike(String value) {
            addCriterion("yps not like", value, "yps");
            return (Criteria) this;
        }

        public Criteria andYpsIn(List<String> values) {
            addCriterion("yps in", values, "yps");
            return (Criteria) this;
        }

        public Criteria andYpsNotIn(List<String> values) {
            addCriterion("yps not in", values, "yps");
            return (Criteria) this;
        }

        public Criteria andYpsBetween(String value1, String value2) {
            addCriterion("yps between", value1, value2, "yps");
            return (Criteria) this;
        }

        public Criteria andYpsNotBetween(String value1, String value2) {
            addCriterion("yps not between", value1, value2, "yps");
            return (Criteria) this;
        }

        public Criteria andXsajsIsNull() {
            addCriterion("xsajs is null");
            return (Criteria) this;
        }

        public Criteria andXsajsIsNotNull() {
            addCriterion("xsajs is not null");
            return (Criteria) this;
        }

        public Criteria andXsajsEqualTo(String value) {
            addCriterion("xsajs =", value, "xsajs");
            return (Criteria) this;
        }

        public Criteria andXsajsNotEqualTo(String value) {
            addCriterion("xsajs <>", value, "xsajs");
            return (Criteria) this;
        }

        public Criteria andXsajsGreaterThan(String value) {
            addCriterion("xsajs >", value, "xsajs");
            return (Criteria) this;
        }

        public Criteria andXsajsGreaterThanOrEqualTo(String value) {
            addCriterion("xsajs >=", value, "xsajs");
            return (Criteria) this;
        }

        public Criteria andXsajsLessThan(String value) {
            addCriterion("xsajs <", value, "xsajs");
            return (Criteria) this;
        }

        public Criteria andXsajsLessThanOrEqualTo(String value) {
            addCriterion("xsajs <=", value, "xsajs");
            return (Criteria) this;
        }

        public Criteria andXsajsLike(String value) {
            addCriterion("xsajs like", value, "xsajs");
            return (Criteria) this;
        }

        public Criteria andXsajsNotLike(String value) {
            addCriterion("xsajs not like", value, "xsajs");
            return (Criteria) this;
        }

        public Criteria andXsajsIn(List<String> values) {
            addCriterion("xsajs in", values, "xsajs");
            return (Criteria) this;
        }

        public Criteria andXsajsNotIn(List<String> values) {
            addCriterion("xsajs not in", values, "xsajs");
            return (Criteria) this;
        }

        public Criteria andXsajsBetween(String value1, String value2) {
            addCriterion("xsajs between", value1, value2, "xsajs");
            return (Criteria) this;
        }

        public Criteria andXsajsNotBetween(String value1, String value2) {
            addCriterion("xsajs not between", value1, value2, "xsajs");
            return (Criteria) this;
        }
        
        //分界线
        
        public Criteria andZaajsIsNull() {
            addCriterion("zaajs is null");
            return (Criteria) this;
        }

        public Criteria andZaajsIsNotNull() {
            addCriterion("zaajs is not null");
            return (Criteria) this;
        }

        public Criteria andZaajsEqualTo(String value) {
            addCriterion("zaajs =", value, "zaajs");
            return (Criteria) this;
        }

        public Criteria andZaajsNotEqualTo(String value) {
            addCriterion("zaajs <>", value, "zaajs");
            return (Criteria) this;
        }

        public Criteria andZaajsGreaterThan(String value) {
            addCriterion("zaajs >", value, "zaajs");
            return (Criteria) this;
        }

        public Criteria andZaajsGreaterThanOrEqualTo(String value) {
            addCriterion("zaajs >=", value, "zaajs");
            return (Criteria) this;
        }

        public Criteria andZaajsLessThan(String value) {
            addCriterion("zaajs <", value, "zaajs");
            return (Criteria) this;
        }

        public Criteria andZaajsLessThanOrEqualTo(String value) {
            addCriterion("zaajs <=", value, "zaajs");
            return (Criteria) this;
        }

        public Criteria andZaajsLike(String value) {
            addCriterion("zaajs like", value, "zaajs");
            return (Criteria) this;
        }

        public Criteria andZaajsNotLike(String value) {
            addCriterion("zaajs not like", value, "zaajs");
            return (Criteria) this;
        }

        public Criteria andZaajsIn(List<String> values) {
            addCriterion("zaajs in", values, "zaajs");
            return (Criteria) this;
        }

        public Criteria andZaajsNotIn(List<String> values) {
            addCriterion("zaajs not in", values, "zaajs");
            return (Criteria) this;
        }

        public Criteria andZaajsBetween(String value1, String value2) {
            addCriterion("zaajs between", value1, value2, "zaajs");
            return (Criteria) this;
        }

        public Criteria andZaajsNotBetween(String value1, String value2) {
            addCriterion("zaajs not between", value1, value2, "zaajs");
            return (Criteria) this;
        }
        
        
        public Criteria andXssIsNull() {
            addCriterion("xss is null");
            return (Criteria) this;
        }

        public Criteria andXssIsNotNull() {
            addCriterion("xss is not null");
            return (Criteria) this;
        }

        public Criteria andXssEqualTo(String value) {
            addCriterion("xss =", value, "xss");
            return (Criteria) this;
        }

        public Criteria andXssNotEqualTo(String value) {
            addCriterion("xss <>", value, "xss");
            return (Criteria) this;
        }

        public Criteria andXssGreaterThan(String value) {
            addCriterion("xss >", value, "xss");
            return (Criteria) this;
        }

        public Criteria andXssGreaterThanOrEqualTo(String value) {
            addCriterion("xss >=", value, "xss");
            return (Criteria) this;
        }

        public Criteria andXssLessThan(String value) {
            addCriterion("xss <", value, "xss");
            return (Criteria) this;
        }

        public Criteria andXssLessThanOrEqualTo(String value) {
            addCriterion("xss <=", value, "xss");
            return (Criteria) this;
        }

        public Criteria andXssLike(String value) {
            addCriterion("xss like", value, "xss");
            return (Criteria) this;
        }

        public Criteria andXssNotLike(String value) {
            addCriterion("xss not like", value, "xss");
            return (Criteria) this;
        }

        public Criteria andXssIn(List<String> values) {
            addCriterion("xss in", values, "xss");
            return (Criteria) this;
        }

        public Criteria andXssNotIn(List<String> values) {
            addCriterion("xss not in", values, "xss");
            return (Criteria) this;
        }

        public Criteria andXssBetween(String value1, String value2) {
            addCriterion("xss between", value1, value2, "xss");
            return (Criteria) this;
        }

        public Criteria andXssNotBetween(String value1, String value2) {
            addCriterion("xss not between", value1, value2, "xss");
            return (Criteria) this;
        }
        
        //分界线
        
        public Criteria andZbsIsNull() {
            addCriterion("zbs is null");
            return (Criteria) this;
        }

        public Criteria andZbsIsNotNull() {
            addCriterion("zbs is not null");
            return (Criteria) this;
        }

        public Criteria andZbsEqualTo(String value) {
            addCriterion("zbs =", value, "zbs");
            return (Criteria) this;
        }

        public Criteria andZbsNotEqualTo(String value) {
            addCriterion("zbs <>", value, "zbs");
            return (Criteria) this;
        }

        public Criteria andZbsGreaterThan(String value) {
            addCriterion("zbs >", value, "zbs");
            return (Criteria) this;
        }

        public Criteria andZbsGreaterThanOrEqualTo(String value) {
            addCriterion("zbs >=", value, "zbs");
            return (Criteria) this;
        }

        public Criteria andZbsLessThan(String value) {
            addCriterion("zbs <", value, "zbs");
            return (Criteria) this;
        }

        public Criteria andZbsLessThanOrEqualTo(String value) {
            addCriterion("zbs <=", value, "zbs");
            return (Criteria) this;
        }

        public Criteria andZbsLike(String value) {
            addCriterion("zbs like", value, "zbs");
            return (Criteria) this;
        }

        public Criteria andZbsNotLike(String value) {
            addCriterion("zbs not like", value, "zbs");
            return (Criteria) this;
        }

        public Criteria andZbsIn(List<String> values) {
            addCriterion("zbs in", values, "zbs");
            return (Criteria) this;
        }

        public Criteria andZbsNotIn(List<String> values) {
            addCriterion("zbs not in", values, "zbs");
            return (Criteria) this;
        }

        public Criteria andZbsBetween(String value1, String value2) {
            addCriterion("zbs between", value1, value2, "zbs");
            return (Criteria) this;
        }

        public Criteria andZbsNotBetween(String value1, String value2) {
            addCriterion("zbs not between", value1, value2, "zbs");
            return (Criteria) this;
        }
        
        
        //分界线
        public Criteria andPasIsNull() {
            addCriterion("pas is null");
            return (Criteria) this;
        }

        public Criteria andPasIsNotNull() {
            addCriterion("pas is not null");
            return (Criteria) this;
        }

        public Criteria andPasEqualTo(String value) {
            addCriterion("pas =", value, "pas");
            return (Criteria) this;
        }

        public Criteria andPasNotEqualTo(String value) {
            addCriterion("pas <>", value, "pas");
            return (Criteria) this;
        }

        public Criteria andPasGreaterThan(String value) {
            addCriterion("pas >", value, "pas");
            return (Criteria) this;
        }

        public Criteria andPasGreaterThanOrEqualTo(String value) {
            addCriterion("pas >=", value, "pas");
            return (Criteria) this;
        }

        public Criteria andPasLessThan(String value) {
            addCriterion("pas <", value, "pas");
            return (Criteria) this;
        }

        public Criteria andPasLessThanOrEqualTo(String value) {
            addCriterion("pas <=", value, "pas");
            return (Criteria) this;
        }

        public Criteria andPasLike(String value) {
            addCriterion("pas like", value, "pas");
            return (Criteria) this;
        }

        public Criteria andPasNotLike(String value) {
            addCriterion("pas not like", value, "pas");
            return (Criteria) this;
        }

        public Criteria andPasIn(List<String> values) {
            addCriterion("pas in", values, "pas");
            return (Criteria) this;
        }

        public Criteria andPasNotIn(List<String> values) {
            addCriterion("pas not in", values, "pas");
            return (Criteria) this;
        }

        public Criteria andPasBetween(String value1, String value2) {
            addCriterion("pas between", value1, value2, "pas");
            return (Criteria) this;
        }

        public Criteria andPasNotBetween(String value1, String value2) {
            addCriterion("pas not between", value1, value2, "pas");
            return (Criteria) this;
        }
        
    }

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
