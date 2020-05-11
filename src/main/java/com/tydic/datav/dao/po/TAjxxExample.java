package com.tydic.datav.dao.po;

import java.util.ArrayList;
import java.util.List;

public class TAjxxExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TAjxxExample() {
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

		public Criteria andAjbhIsNull() {
			addCriterion("ajbh is null");
			return (Criteria) this;
		}

		public Criteria andAjbhIsNotNull() {
			addCriterion("ajbh is not null");
			return (Criteria) this;
		}

		public Criteria andAjbhEqualTo(String value) {
			addCriterion("ajbh =", value, "ajbh");
			return (Criteria) this;
		}

		public Criteria andAjbhNotEqualTo(String value) {
			addCriterion("ajbh <>", value, "ajbh");
			return (Criteria) this;
		}

		public Criteria andAjbhGreaterThan(String value) {
			addCriterion("ajbh >", value, "ajbh");
			return (Criteria) this;
		}

		public Criteria andAjbhGreaterThanOrEqualTo(String value) {
			addCriterion("ajbh >=", value, "ajbh");
			return (Criteria) this;
		}

		public Criteria andAjbhLessThan(String value) {
			addCriterion("ajbh <", value, "ajbh");
			return (Criteria) this;
		}

		public Criteria andAjbhLessThanOrEqualTo(String value) {
			addCriterion("ajbh <=", value, "ajbh");
			return (Criteria) this;
		}

		public Criteria andAjbhLike(String value) {
			addCriterion("ajbh like", value, "ajbh");
			return (Criteria) this;
		}

		public Criteria andAjbhNotLike(String value) {
			addCriterion("ajbh not like", value, "ajbh");
			return (Criteria) this;
		}

		public Criteria andAjbhIn(List<String> values) {
			addCriterion("ajbh in", values, "ajbh");
			return (Criteria) this;
		}

		public Criteria andAjbhNotIn(List<String> values) {
			addCriterion("ajbh not in", values, "ajbh");
			return (Criteria) this;
		}

		public Criteria andAjbhBetween(String value1, String value2) {
			addCriterion("ajbh between", value1, value2, "ajbh");
			return (Criteria) this;
		}

		public Criteria andAjbhNotBetween(String value1, String value2) {
			addCriterion("ajbh not between", value1, value2, "ajbh");
			return (Criteria) this;
		}

		public Criteria andAjmcIsNull() {
			addCriterion("ajmc is null");
			return (Criteria) this;
		}

		public Criteria andAjmcIsNotNull() {
			addCriterion("ajmc is not null");
			return (Criteria) this;
		}

		public Criteria andAjmcEqualTo(String value) {
			addCriterion("ajmc =", value, "ajmc");
			return (Criteria) this;
		}

		public Criteria andAjmcNotEqualTo(String value) {
			addCriterion("ajmc <>", value, "ajmc");
			return (Criteria) this;
		}

		public Criteria andAjmcGreaterThan(String value) {
			addCriterion("ajmc >", value, "ajmc");
			return (Criteria) this;
		}

		public Criteria andAjmcGreaterThanOrEqualTo(String value) {
			addCriterion("ajmc >=", value, "ajmc");
			return (Criteria) this;
		}

		public Criteria andAjmcLessThan(String value) {
			addCriterion("ajmc <", value, "ajmc");
			return (Criteria) this;
		}

		public Criteria andAjmcLessThanOrEqualTo(String value) {
			addCriterion("ajmc <=", value, "ajmc");
			return (Criteria) this;
		}

		public Criteria andAjmcLike(String value) {
			addCriterion("ajmc like", value, "ajmc");
			return (Criteria) this;
		}

		public Criteria andAjmcNotLike(String value) {
			addCriterion("ajmc not like", value, "ajmc");
			return (Criteria) this;
		}

		public Criteria andAjmcIn(List<String> values) {
			addCriterion("ajmc in", values, "ajmc");
			return (Criteria) this;
		}

		public Criteria andAjmcNotIn(List<String> values) {
			addCriterion("ajmc not in", values, "ajmc");
			return (Criteria) this;
		}

		public Criteria andAjmcBetween(String value1, String value2) {
			addCriterion("ajmc between", value1, value2, "ajmc");
			return (Criteria) this;
		}

		public Criteria andAjmcNotBetween(String value1, String value2) {
			addCriterion("ajmc not between", value1, value2, "ajmc");
			return (Criteria) this;
		}

		public Criteria andAjlbIsNull() {
			addCriterion("ajlb is null");
			return (Criteria) this;
		}

		public Criteria andAjlbIsNotNull() {
			addCriterion("ajlb is not null");
			return (Criteria) this;
		}

		public Criteria andAjlbEqualTo(String value) {
			addCriterion("ajlb =", value, "ajlb");
			return (Criteria) this;
		}

		public Criteria andAjlbNotEqualTo(String value) {
			addCriterion("ajlb <>", value, "ajlb");
			return (Criteria) this;
		}

		public Criteria andAjlbGreaterThan(String value) {
			addCriterion("ajlb >", value, "ajlb");
			return (Criteria) this;
		}

		public Criteria andAjlbGreaterThanOrEqualTo(String value) {
			addCriterion("ajlb >=", value, "ajlb");
			return (Criteria) this;
		}

		public Criteria andAjlbLessThan(String value) {
			addCriterion("ajlb <", value, "ajlb");
			return (Criteria) this;
		}

		public Criteria andAjlbLessThanOrEqualTo(String value) {
			addCriterion("ajlb <=", value, "ajlb");
			return (Criteria) this;
		}

		public Criteria andAjlbLike(String value) {
			addCriterion("ajlb like", value, "ajlb");
			return (Criteria) this;
		}

		public Criteria andAjlbNotLike(String value) {
			addCriterion("ajlb not like", value, "ajlb");
			return (Criteria) this;
		}

		public Criteria andAjlbIn(List<String> values) {
			addCriterion("ajlb in", values, "ajlb");
			return (Criteria) this;
		}

		public Criteria andAjlbNotIn(List<String> values) {
			addCriterion("ajlb not in", values, "ajlb");
			return (Criteria) this;
		}

		public Criteria andAjlbBetween(String value1, String value2) {
			addCriterion("ajlb between", value1, value2, "ajlb");
			return (Criteria) this;
		}

		public Criteria andAjlbNotBetween(String value1, String value2) {
			addCriterion("ajlb not between", value1, value2, "ajlb");
			return (Criteria) this;
		}

		public Criteria andLbmlIsNull() {
			addCriterion("lbml is null");
			return (Criteria) this;
		}

		public Criteria andLbmlIsNotNull() {
			addCriterion("lbml is not null");
			return (Criteria) this;
		}

		public Criteria andLbmlEqualTo(String value) {
			addCriterion("lbml =", value, "lbml");
			return (Criteria) this;
		}

		public Criteria andLbmlNotEqualTo(String value) {
			addCriterion("lbml <>", value, "lbml");
			return (Criteria) this;
		}

		public Criteria andLbmlGreaterThan(String value) {
			addCriterion("lbml >", value, "lbml");
			return (Criteria) this;
		}

		public Criteria andLbmlGreaterThanOrEqualTo(String value) {
			addCriterion("lbml >=", value, "lbml");
			return (Criteria) this;
		}

		public Criteria andLbmlLessThan(String value) {
			addCriterion("lbml <", value, "lbml");
			return (Criteria) this;
		}

		public Criteria andLbmlLessThanOrEqualTo(String value) {
			addCriterion("lbml <=", value, "lbml");
			return (Criteria) this;
		}

		public Criteria andLbmlLike(String value) {
			addCriterion("lbml like", value, "lbml");
			return (Criteria) this;
		}

		public Criteria andLbmlNotLike(String value) {
			addCriterion("lbml not like", value, "lbml");
			return (Criteria) this;
		}

		public Criteria andLbmlIn(List<String> values) {
			addCriterion("lbml in", values, "lbml");
			return (Criteria) this;
		}

		public Criteria andLbmlNotIn(List<String> values) {
			addCriterion("lbml not in", values, "lbml");
			return (Criteria) this;
		}

		public Criteria andLbmlBetween(String value1, String value2) {
			addCriterion("lbml between", value1, value2, "lbml");
			return (Criteria) this;
		}

		public Criteria andLbmlNotBetween(String value1, String value2) {
			addCriterion("lbml not between", value1, value2, "lbml");
			return (Criteria) this;
		}

		public Criteria andAjztIsNull() {
			addCriterion("ajzt is null");
			return (Criteria) this;
		}

		public Criteria andAjztIsNotNull() {
			addCriterion("ajzt is not null");
			return (Criteria) this;
		}

		public Criteria andAjztEqualTo(String value) {
			addCriterion("ajzt =", value, "ajzt");
			return (Criteria) this;
		}

		public Criteria andAjztNotEqualTo(String value) {
			addCriterion("ajzt <>", value, "ajzt");
			return (Criteria) this;
		}

		public Criteria andAjztGreaterThan(String value) {
			addCriterion("ajzt >", value, "ajzt");
			return (Criteria) this;
		}

		public Criteria andAjztGreaterThanOrEqualTo(String value) {
			addCriterion("ajzt >=", value, "ajzt");
			return (Criteria) this;
		}

		public Criteria andAjztLessThan(String value) {
			addCriterion("ajzt <", value, "ajzt");
			return (Criteria) this;
		}

		public Criteria andAjztLessThanOrEqualTo(String value) {
			addCriterion("ajzt <=", value, "ajzt");
			return (Criteria) this;
		}

		public Criteria andAjztLike(String value) {
			addCriterion("ajzt like", value, "ajzt");
			return (Criteria) this;
		}

		public Criteria andAjztNotLike(String value) {
			addCriterion("ajzt not like", value, "ajzt");
			return (Criteria) this;
		}

		public Criteria andAjztIn(List<String> values) {
			addCriterion("ajzt in", values, "ajzt");
			return (Criteria) this;
		}

		public Criteria andAjztNotIn(List<String> values) {
			addCriterion("ajzt not in", values, "ajzt");
			return (Criteria) this;
		}

		public Criteria andAjztBetween(String value1, String value2) {
			addCriterion("ajzt between", value1, value2, "ajzt");
			return (Criteria) this;
		}

		public Criteria andAjztNotBetween(String value1, String value2) {
			addCriterion("ajzt not between", value1, value2, "ajzt");
			return (Criteria) this;
		}

		public Criteria andAjztsjIsNull() {
			addCriterion("ajztsj is null");
			return (Criteria) this;
		}

		public Criteria andAjztsjIsNotNull() {
			addCriterion("ajztsj is not null");
			return (Criteria) this;
		}

		public Criteria andAjztsjEqualTo(String value) {
			addCriterion("ajztsj =", value, "ajztsj");
			return (Criteria) this;
		}

		public Criteria andAjztsjNotEqualTo(String value) {
			addCriterion("ajztsj <>", value, "ajztsj");
			return (Criteria) this;
		}

		public Criteria andAjztsjGreaterThan(String value) {
			addCriterion("ajztsj >", value, "ajztsj");
			return (Criteria) this;
		}

		public Criteria andAjztsjGreaterThanOrEqualTo(String value) {
			addCriterion("ajztsj >=", value, "ajztsj");
			return (Criteria) this;
		}

		public Criteria andAjztsjLessThan(String value) {
			addCriterion("ajztsj <", value, "ajztsj");
			return (Criteria) this;
		}

		public Criteria andAjztsjLessThanOrEqualTo(String value) {
			addCriterion("ajztsj <=", value, "ajztsj");
			return (Criteria) this;
		}

		public Criteria andAjztsjLike(String value) {
			addCriterion("ajztsj like", value, "ajztsj");
			return (Criteria) this;
		}

		public Criteria andAjztsjNotLike(String value) {
			addCriterion("ajztsj not like", value, "ajztsj");
			return (Criteria) this;
		}

		public Criteria andAjztsjIn(List<String> values) {
			addCriterion("ajztsj in", values, "ajztsj");
			return (Criteria) this;
		}

		public Criteria andAjztsjNotIn(List<String> values) {
			addCriterion("ajztsj not in", values, "ajztsj");
			return (Criteria) this;
		}

		public Criteria andAjztsjBetween(String value1, String value2) {
			addCriterion("ajztsj between", value1, value2, "ajztsj");
			return (Criteria) this;
		}

		public Criteria andAjztsjNotBetween(String value1, String value2) {
			addCriterion("ajztsj not between", value1, value2, "ajztsj");
			return (Criteria) this;
		}

		public Criteria andAjfxsjIsNull() {
			addCriterion("ajfxsj is null");
			return (Criteria) this;
		}

		public Criteria andAjfxsjIsNotNull() {
			addCriterion("ajfxsj is not null");
			return (Criteria) this;
		}

		public Criteria andAjfxsjEqualTo(String value) {
			addCriterion("ajfxsj =", value, "ajfxsj");
			return (Criteria) this;
		}

		public Criteria andAjfxsjNotEqualTo(String value) {
			addCriterion("ajfxsj <>", value, "ajfxsj");
			return (Criteria) this;
		}

		public Criteria andAjfxsjGreaterThan(String value) {
			addCriterion("ajfxsj >", value, "ajfxsj");
			return (Criteria) this;
		}

		public Criteria andAjfxsjGreaterThanOrEqualTo(String value) {
			addCriterion("ajfxsj >=", value, "ajfxsj");
			return (Criteria) this;
		}

		public Criteria andAjfxsjLessThan(String value) {
			addCriterion("ajfxsj <", value, "ajfxsj");
			return (Criteria) this;
		}

		public Criteria andAjfxsjLessThanOrEqualTo(String value) {
			addCriterion("ajfxsj <=", value, "ajfxsj");
			return (Criteria) this;
		}

		public Criteria andAjfxsjLike(String value) {
			addCriterion("ajfxsj like", value, "ajfxsj");
			return (Criteria) this;
		}

		public Criteria andAjfxsjNotLike(String value) {
			addCriterion("ajfxsj not like", value, "ajfxsj");
			return (Criteria) this;
		}

		public Criteria andAjfxsjIn(List<String> values) {
			addCriterion("ajfxsj in", values, "ajfxsj");
			return (Criteria) this;
		}

		public Criteria andAjfxsjNotIn(List<String> values) {
			addCriterion("ajfxsj not in", values, "ajfxsj");
			return (Criteria) this;
		}

		public Criteria andAjfxsjBetween(String value1, String value2) {
			addCriterion("ajfxsj between", value1, value2, "ajfxsj");
			return (Criteria) this;
		}

		public Criteria andAjfxsjNotBetween(String value1, String value2) {
			addCriterion("ajfxsj not between", value1, value2, "ajfxsj");
			return (Criteria) this;
		}

		public Criteria andAjlxIsNull() {
			addCriterion("ajlx is null");
			return (Criteria) this;
		}

		public Criteria andAjlxIsNotNull() {
			addCriterion("ajlx is not null");
			return (Criteria) this;
		}

		public Criteria andAjlxEqualTo(String value) {
			addCriterion("ajlx =", value, "ajlx");
			return (Criteria) this;
		}

		public Criteria andAjlxNotEqualTo(String value) {
			addCriterion("ajlx <>", value, "ajlx");
			return (Criteria) this;
		}

		public Criteria andAjlxGreaterThan(String value) {
			addCriterion("ajlx >", value, "ajlx");
			return (Criteria) this;
		}

		public Criteria andAjlxGreaterThanOrEqualTo(String value) {
			addCriterion("ajlx >=", value, "ajlx");
			return (Criteria) this;
		}

		public Criteria andAjlxLessThan(String value) {
			addCriterion("ajlx <", value, "ajlx");
			return (Criteria) this;
		}

		public Criteria andAjlxLessThanOrEqualTo(String value) {
			addCriterion("ajlx <=", value, "ajlx");
			return (Criteria) this;
		}

		public Criteria andAjlxLike(String value) {
			addCriterion("ajlx like", value, "ajlx");
			return (Criteria) this;
		}

		public Criteria andAjlxNotLike(String value) {
			addCriterion("ajlx not like", value, "ajlx");
			return (Criteria) this;
		}

		public Criteria andAjlxIn(List<String> values) {
			addCriterion("ajlx in", values, "ajlx");
			return (Criteria) this;
		}

		public Criteria andAjlxNotIn(List<String> values) {
			addCriterion("ajlx not in", values, "ajlx");
			return (Criteria) this;
		}

		public Criteria andAjlxBetween(String value1, String value2) {
			addCriterion("ajlx between", value1, value2, "ajlx");
			return (Criteria) this;
		}

		public Criteria andAjlxNotBetween(String value1, String value2) {
			addCriterion("ajlx not between", value1, value2, "ajlx");
			return (Criteria) this;
		}
		
		public Criteria andAjxzIsNull() {
			addCriterion("ajxz is null");
			return (Criteria) this;
		}

		public Criteria andAjxzIsNotNull() {
			addCriterion("ajxz is not null");
			return (Criteria) this;
		}

		public Criteria andAjxzEqualTo(String value) {
			addCriterion("ajxz =", value, "ajxz");
			return (Criteria) this;
		}

		public Criteria andAjxzNotEqualTo(String value) {
			addCriterion("ajxz <>", value, "ajxz");
			return (Criteria) this;
		}

		public Criteria andAjxzGreaterThan(String value) {
			addCriterion("ajxz >", value, "ajxz");
			return (Criteria) this;
		}

		public Criteria andAjxzGreaterThanOrEqualTo(String value) {
			addCriterion("ajxz >=", value, "ajxz");
			return (Criteria) this;
		}

		public Criteria andAjxzLessThan(String value) {
			addCriterion("ajxz <", value, "ajxz");
			return (Criteria) this;
		}

		public Criteria andAjxzLessThanOrEqualTo(String value) {
			addCriterion("ajxz <=", value, "ajxz");
			return (Criteria) this;
		}

		public Criteria andAjxzLike(String value) {
			addCriterion("ajxz like", value, "ajxz");
			return (Criteria) this;
		}

		public Criteria andAjxzNotLike(String value) {
			addCriterion("ajxz not like", value, "ajxz");
			return (Criteria) this;
		}

		public Criteria andAjxzIn(List<String> values) {
			addCriterion("ajxz in", values, "ajxz");
			return (Criteria) this;
		}

		public Criteria andAjxzNotIn(List<String> values) {
			addCriterion("ajxz not in", values, "ajxz");
			return (Criteria) this;
		}

		public Criteria andAjxzBetween(String value1, String value2) {
			addCriterion("ajxz between", value1, value2, "ajxz");
			return (Criteria) this;
		}

		public Criteria andAjxzNotBetween(String value1, String value2) {
			addCriterion("ajxz not between", value1, value2, "ajxz");
			return (Criteria) this;
		}

		public Criteria andFaddIsNull() {
			addCriterion("fadd is null");
			return (Criteria) this;
		}

		public Criteria andFaddIsNotNull() {
			addCriterion("fadd is not null");
			return (Criteria) this;
		}

		public Criteria andFaddEqualTo(String value) {
			addCriterion("fadd =", value, "fadd");
			return (Criteria) this;
		}

		public Criteria andFaddNotEqualTo(String value) {
			addCriterion("fadd <>", value, "fadd");
			return (Criteria) this;
		}

		public Criteria andFaddGreaterThan(String value) {
			addCriterion("fadd >", value, "fadd");
			return (Criteria) this;
		}

		public Criteria andFaddGreaterThanOrEqualTo(String value) {
			addCriterion("fadd >=", value, "fadd");
			return (Criteria) this;
		}

		public Criteria andFaddLessThan(String value) {
			addCriterion("fadd <", value, "fadd");
			return (Criteria) this;
		}

		public Criteria andFaddLessThanOrEqualTo(String value) {
			addCriterion("fadd <=", value, "fadd");
			return (Criteria) this;
		}

		public Criteria andFaddLike(String value) {
			addCriterion("fadd like", value, "fadd");
			return (Criteria) this;
		}

		public Criteria andFaddNotLike(String value) {
			addCriterion("fadd not like", value, "fadd");
			return (Criteria) this;
		}

		public Criteria andFaddIn(List<String> values) {
			addCriterion("fadd in", values, "fadd");
			return (Criteria) this;
		}

		public Criteria andFaddNotIn(List<String> values) {
			addCriterion("fadd not in", values, "fadd");
			return (Criteria) this;
		}

		public Criteria andFaddBetween(String value1, String value2) {
			addCriterion("fadd between", value1, value2, "fadd");
			return (Criteria) this;
		}

		public Criteria andFaddNotBetween(String value1, String value2) {
			addCriterion("fadd not between", value1, value2, "fadd");
			return (Criteria) this;
		}

		public Criteria andJyaqIsNull() {
			addCriterion("jyaq is null");
			return (Criteria) this;
		}

		public Criteria andJyaqIsNotNull() {
			addCriterion("jyaq is not null");
			return (Criteria) this;
		}

		public Criteria andJyaqEqualTo(String value) {
			addCriterion("jyaq =", value, "jyaq");
			return (Criteria) this;
		}

		public Criteria andJyaqNotEqualTo(String value) {
			addCriterion("jyaq <>", value, "jyaq");
			return (Criteria) this;
		}

		public Criteria andJyaqGreaterThan(String value) {
			addCriterion("jyaq >", value, "jyaq");
			return (Criteria) this;
		}

		public Criteria andJyaqGreaterThanOrEqualTo(String value) {
			addCriterion("jyaq >=", value, "jyaq");
			return (Criteria) this;
		}

		public Criteria andJyaqLessThan(String value) {
			addCriterion("jyaq <", value, "jyaq");
			return (Criteria) this;
		}

		public Criteria andJyaqLessThanOrEqualTo(String value) {
			addCriterion("jyaq <=", value, "jyaq");
			return (Criteria) this;
		}

		public Criteria andJyaqLike(String value) {
			addCriterion("jyaq like", value, "jyaq");
			return (Criteria) this;
		}

		public Criteria andJyaqNotLike(String value) {
			addCriterion("jyaq not like", value, "jyaq");
			return (Criteria) this;
		}

		public Criteria andJyaqIn(List<String> values) {
			addCriterion("jyaq in", values, "jyaq");
			return (Criteria) this;
		}

		public Criteria andJyaqNotIn(List<String> values) {
			addCriterion("jyaq not in", values, "jyaq");
			return (Criteria) this;
		}

		public Criteria andJyaqBetween(String value1, String value2) {
			addCriterion("jyaq between", value1, value2, "jyaq");
			return (Criteria) this;
		}

		public Criteria andJyaqNotBetween(String value1, String value2) {
			addCriterion("jyaq not between", value1, value2, "jyaq");
			return (Criteria) this;
		}

		public Criteria andFasjIsNull() {
			addCriterion("fasj is null");
			return (Criteria) this;
		}

		public Criteria andFasjIsNotNull() {
			addCriterion("fasj is not null");
			return (Criteria) this;
		}

		public Criteria andFasjEqualTo(String value) {
			addCriterion("fasj =", value, "fasj");
			return (Criteria) this;
		}

		public Criteria andFasjNotEqualTo(String value) {
			addCriterion("fasj <>", value, "fasj");
			return (Criteria) this;
		}

		public Criteria andFasjGreaterThan(String value) {
			addCriterion("fasj >", value, "fasj");
			return (Criteria) this;
		}

		public Criteria andFasjGreaterThanOrEqualTo(String value) {
			addCriterion("fasj >=", value, "fasj");
			return (Criteria) this;
		}

		public Criteria andFasjLessThan(String value) {
			addCriterion("fasj <", value, "fasj");
			return (Criteria) this;
		}

		public Criteria andFasjLessThanOrEqualTo(String value) {
			addCriterion("fasj <=", value, "fasj");
			return (Criteria) this;
		}

		public Criteria andFasjLike(String value) {
			addCriterion("fasj like", value, "fasj");
			return (Criteria) this;
		}

		public Criteria andFasjNotLike(String value) {
			addCriterion("fasj not like", value, "fasj");
			return (Criteria) this;
		}

		public Criteria andFasjIn(List<String> values) {
			addCriterion("fasj in", values, "fasj");
			return (Criteria) this;
		}

		public Criteria andFasjNotIn(List<String> values) {
			addCriterion("fasj not in", values, "fasj");
			return (Criteria) this;
		}

		public Criteria andFasjBetween(String value1, String value2) {
			addCriterion("fasj between", value1, value2, "fasj");
			return (Criteria) this;
		}

		public Criteria andFasjNotBetween(String value1, String value2) {
			addCriterion("fasj not between", value1, value2, "fasj");
			return (Criteria) this;
		}
		
		public Criteria andFajssjIsNull() {
			addCriterion("fajssj is null");
			return (Criteria) this;
		}

		public Criteria andFajssjIsNotNull() {
			addCriterion("fajssj is not null");
			return (Criteria) this;
		}

		public Criteria andFajssjEqualTo(String value) {
			addCriterion("fajssj =", value, "fajssj");
			return (Criteria) this;
		}

		public Criteria andFajssjNotEqualTo(String value) {
			addCriterion("fajssj <>", value, "fajssj");
			return (Criteria) this;
		}

		public Criteria andFajssjGreaterThan(String value) {
			addCriterion("fajssj >", value, "fajssj");
			return (Criteria) this;
		}

		public Criteria andFajssjGreaterThanOrEqualTo(String value) {
			addCriterion("fajssj >=", value, "fajssj");
			return (Criteria) this;
		}

		public Criteria andFajssjLessThan(String value) {
			addCriterion("fajssj <", value, "fajssj");
			return (Criteria) this;
		}

		public Criteria andFajssjLessThanOrEqualTo(String value) {
			addCriterion("fajssj <=", value, "fajssj");
			return (Criteria) this;
		}

		public Criteria andFajssjLike(String value) {
			addCriterion("fajssj like", value, "fajssj");
			return (Criteria) this;
		}

		public Criteria andFajssjNotLike(String value) {
			addCriterion("fajssj not like", value, "fajssj");
			return (Criteria) this;
		}

		public Criteria andFajssjIn(List<String> values) {
			addCriterion("fajssj in", values, "fajssj");
			return (Criteria) this;
		}

		public Criteria andFajssjNotIn(List<String> values) {
			addCriterion("fajssj not in", values, "fajssj");
			return (Criteria) this;
		}

		public Criteria andFajssjBetween(String value1, String value2) {
			addCriterion("fajssj between", value1, value2, "fajssj");
			return (Criteria) this;
		}

		public Criteria andFajssjNotBetween(String value1, String value2) {
			addCriterion("fajssj not between", value1, value2, "fajssj");
			return (Criteria) this;
		}

		public Criteria andFasdIsNull() {
			addCriterion("fasd is null");
			return (Criteria) this;
		}

		public Criteria andFasdIsNotNull() {
			addCriterion("fasd is not null");
			return (Criteria) this;
		}

		public Criteria andFasdEqualTo(String value) {
			addCriterion("fasd =", value, "fasd");
			return (Criteria) this;
		}

		public Criteria andFasdNotEqualTo(String value) {
			addCriterion("fasd <>", value, "fasd");
			return (Criteria) this;
		}

		public Criteria andFasdGreaterThan(String value) {
			addCriterion("fasd >", value, "fasd");
			return (Criteria) this;
		}

		public Criteria andFasdGreaterThanOrEqualTo(String value) {
			addCriterion("fasd >=", value, "fasd");
			return (Criteria) this;
		}

		public Criteria andFasdLessThan(String value) {
			addCriterion("fasd <", value, "fasd");
			return (Criteria) this;
		}

		public Criteria andFasdLessThanOrEqualTo(String value) {
			addCriterion("fasd <=", value, "fasd");
			return (Criteria) this;
		}

		public Criteria andFasdLike(String value) {
			addCriterion("fasd like", value, "fasd");
			return (Criteria) this;
		}

		public Criteria andFasdNotLike(String value) {
			addCriterion("fasd not like", value, "fasd");
			return (Criteria) this;
		}

		public Criteria andFasdIn(List<String> values) {
			addCriterion("fasd in", values, "fasd");
			return (Criteria) this;
		}

		public Criteria andFasdNotIn(List<String> values) {
			addCriterion("fasd not in", values, "fasd");
			return (Criteria) this;
		}

		public Criteria andFasdBetween(String value1, String value2) {
			addCriterion("fasd between", value1, value2, "fasd");
			return (Criteria) this;
		}

		public Criteria andFasdNotBetween(String value1, String value2) {
			addCriterion("fasd not between", value1, value2, "fasd");
			return (Criteria) this;
		}

		public Criteria andFadyIsNull() {
			addCriterion("fady is null");
			return (Criteria) this;
		}

		public Criteria andFadyIsNotNull() {
			addCriterion("fady is not null");
			return (Criteria) this;
		}

		public Criteria andFadyEqualTo(String value) {
			addCriterion("fady =", value, "fady");
			return (Criteria) this;
		}

		public Criteria andFadyNotEqualTo(String value) {
			addCriterion("fady <>", value, "fady");
			return (Criteria) this;
		}

		public Criteria andFadyGreaterThan(String value) {
			addCriterion("fady >", value, "fady");
			return (Criteria) this;
		}

		public Criteria andFadyGreaterThanOrEqualTo(String value) {
			addCriterion("fady >=", value, "fady");
			return (Criteria) this;
		}

		public Criteria andFadyLessThan(String value) {
			addCriterion("fady <", value, "fady");
			return (Criteria) this;
		}

		public Criteria andFadyLessThanOrEqualTo(String value) {
			addCriterion("fady <=", value, "fady");
			return (Criteria) this;
		}

		public Criteria andFadyLike(String value) {
			addCriterion("fady like", value, "fady");
			return (Criteria) this;
		}

		public Criteria andFadyNotLike(String value) {
			addCriterion("fady not like", value, "fady");
			return (Criteria) this;
		}

		public Criteria andFadyIn(List<String> values) {
			addCriterion("fady in", values, "fady");
			return (Criteria) this;
		}

		public Criteria andFadyNotIn(List<String> values) {
			addCriterion("fady not in", values, "fady");
			return (Criteria) this;
		}

		public Criteria andFadyBetween(String value1, String value2) {
			addCriterion("fady between", value1, value2, "fady");
			return (Criteria) this;
		}

		public Criteria andFadyNotBetween(String value1, String value2) {
			addCriterion("fady not between", value1, value2, "fady");
			return (Criteria) this;
		}

		public Criteria andFaxxdzIsNull() {
			addCriterion("faxxdz is null");
			return (Criteria) this;
		}

		public Criteria andFaxxdzIsNotNull() {
			addCriterion("faxxdz is not null");
			return (Criteria) this;
		}

		public Criteria andFaxxdzEqualTo(String value) {
			addCriterion("faxxdz =", value, "faxxdz");
			return (Criteria) this;
		}

		public Criteria andFaxxdzNotEqualTo(String value) {
			addCriterion("faxxdz <>", value, "faxxdz");
			return (Criteria) this;
		}

		public Criteria andFaxxdzGreaterThan(String value) {
			addCriterion("faxxdz >", value, "faxxdz");
			return (Criteria) this;
		}

		public Criteria andFaxxdzGreaterThanOrEqualTo(String value) {
			addCriterion("faxxdz >=", value, "faxxdz");
			return (Criteria) this;
		}

		public Criteria andFaxxdzLessThan(String value) {
			addCriterion("faxxdz <", value, "faxxdz");
			return (Criteria) this;
		}

		public Criteria andFaxxdzLessThanOrEqualTo(String value) {
			addCriterion("faxxdz <=", value, "faxxdz");
			return (Criteria) this;
		}

		public Criteria andFaxxdzLike(String value) {
			addCriterion("faxxdz like", value, "faxxdz");
			return (Criteria) this;
		}

		public Criteria andFaxxdzNotLike(String value) {
			addCriterion("faxxdz not like", value, "faxxdz");
			return (Criteria) this;
		}

		public Criteria andFaxxdzIn(List<String> values) {
			addCriterion("faxxdz in", values, "faxxdz");
			return (Criteria) this;
		}

		public Criteria andFaxxdzNotIn(List<String> values) {
			addCriterion("faxxdz not in", values, "faxxdz");
			return (Criteria) this;
		}

		public Criteria andFaxxdzBetween(String value1, String value2) {
			addCriterion("faxxdz between", value1, value2, "faxxdz");
			return (Criteria) this;
		}

		public Criteria andFaxxdzNotBetween(String value1, String value2) {
			addCriterion("faxxdz not between", value1, value2, "faxxdz");
			return (Criteria) this;
		}
		
		public Criteria andGjzarsIsNull() {
            addCriterion("gjzars is null");
            return (Criteria) this;
        }

        public Criteria andGjzarsIsNotNull() {
            addCriterion("gjzars is not null");
            return (Criteria) this;
        }

        public Criteria andGjzarsEqualTo(String value) {
            addCriterion("gjzars =", value, "gjzars");
            return (Criteria) this;
        }

        public Criteria andGjzarsNotEqualTo(String value) {
            addCriterion("gjzars <>", value, "gjzars");
            return (Criteria) this;
        }

        public Criteria andGjzarsGreaterThan(String value) {
            addCriterion("gjzars >", value, "gjzars");
            return (Criteria) this;
        }

        public Criteria andGjzarsGreaterThanOrEqualTo(String value) {
            addCriterion("gjzars >=", value, "gjzars");
            return (Criteria) this;
        }

        public Criteria andGjzarsLessThan(String value) {
            addCriterion("gjzars <", value, "gjzars");
            return (Criteria) this;
        }

        public Criteria andGjzarsLessThanOrEqualTo(String value) {
            addCriterion("gjzars <=", value, "gjzars");
            return (Criteria) this;
        }

        public Criteria andGjzarsLike(String value) {
            addCriterion("gjzars like", value, "gjzars");
            return (Criteria) this;
        }

        public Criteria andGjzarsNotLike(String value) {
            addCriterion("gjzars not like", value, "gjzars");
            return (Criteria) this;
        }

        public Criteria andGjzarsIn(List<String> values) {
            addCriterion("gjzars in", values, "gjzars");
            return (Criteria) this;
        }

        public Criteria andGjzarsNotIn(List<String> values) {
            addCriterion("gjzars not in", values, "gjzars");
            return (Criteria) this;
        }

        public Criteria andGjzarsBetween(String value1, String value2) {
            addCriterion("gjzars between", value1, value2, "gjzars");
            return (Criteria) this;
        }

        public Criteria andGjzarsNotBetween(String value1, String value2) {
            addCriterion("gjzars not between", value1, value2, "gjzars");
            return (Criteria) this;
        }

        public Criteria andLasjIsNull() {
            addCriterion("lasj is null");
            return (Criteria) this;
        }

        public Criteria andLasjIsNotNull() {
            addCriterion("lasj is not null");
            return (Criteria) this;
        }

        public Criteria andLasjEqualTo(String value) {
            addCriterion("lasj =", value, "lasj");
            return (Criteria) this;
        }

        public Criteria andLasjNotEqualTo(String value) {
            addCriterion("lasj <>", value, "lasj");
            return (Criteria) this;
        }

        public Criteria andLasjGreaterThan(String value) {
            addCriterion("lasj >", value, "lasj");
            return (Criteria) this;
        }

        public Criteria andLasjGreaterThanOrEqualTo(String value) {
            addCriterion("lasj >=", value, "lasj");
            return (Criteria) this;
        }

        public Criteria andLasjLessThan(String value) {
            addCriterion("lasj <", value, "lasj");
            return (Criteria) this;
        }

        public Criteria andLasjLessThanOrEqualTo(String value) {
            addCriterion("lasj <=", value, "lasj");
            return (Criteria) this;
        }

        public Criteria andLasjLike(String value) {
            addCriterion("lasj like", value, "lasj");
            return (Criteria) this;
        }

        public Criteria andLasjNotLike(String value) {
            addCriterion("lasj not like", value, "lasj");
            return (Criteria) this;
        }

        public Criteria andLasjIn(List<String> values) {
            addCriterion("lasj in", values, "lasj");
            return (Criteria) this;
        }

        public Criteria andLasjNotIn(List<String> values) {
            addCriterion("lasj not in", values, "lasj");
            return (Criteria) this;
        }

        public Criteria andLasjBetween(String value1, String value2) {
            addCriterion("lasj between", value1, value2, "lasj");
            return (Criteria) this;
        }

        public Criteria andLasjNotBetween(String value1, String value2) {
            addCriterion("lasj not between", value1, value2, "lasj");
            return (Criteria) this;
        }

        public Criteria andBarxmIsNull() {
            addCriterion("barxm is null");
            return (Criteria) this;
        }

        public Criteria andBarxmIsNotNull() {
            addCriterion("barxm is not null");
            return (Criteria) this;
        }

        public Criteria andBarxmEqualTo(String value) {
            addCriterion("barxm =", value, "barxm");
            return (Criteria) this;
        }

        public Criteria andBarxmNotEqualTo(String value) {
            addCriterion("barxm <>", value, "barxm");
            return (Criteria) this;
        }

        public Criteria andBarxmGreaterThan(String value) {
            addCriterion("barxm >", value, "barxm");
            return (Criteria) this;
        }

        public Criteria andBarxmGreaterThanOrEqualTo(String value) {
            addCriterion("barxm >=", value, "barxm");
            return (Criteria) this;
        }

        public Criteria andBarxmLessThan(String value) {
            addCriterion("barxm <", value, "barxm");
            return (Criteria) this;
        }

        public Criteria andBarxmLessThanOrEqualTo(String value) {
            addCriterion("barxm <=", value, "barxm");
            return (Criteria) this;
        }

        public Criteria andBarxmLike(String value) {
            addCriterion("barxm like", value, "barxm");
            return (Criteria) this;
        }

        public Criteria andBarxmNotLike(String value) {
            addCriterion("barxm not like", value, "barxm");
            return (Criteria) this;
        }

        public Criteria andBarxmIn(List<String> values) {
            addCriterion("barxm in", values, "barxm");
            return (Criteria) this;
        }

        public Criteria andBarxmNotIn(List<String> values) {
            addCriterion("barxm not in", values, "barxm");
            return (Criteria) this;
        }

        public Criteria andBarxmBetween(String value1, String value2) {
            addCriterion("barxm between", value1, value2, "barxm");
            return (Criteria) this;
        }

        public Criteria andBarxmNotBetween(String value1, String value2) {
            addCriterion("barxm not between", value1, value2, "barxm");
            return (Criteria) this;
        }
        
        //分界线
        
        public Criteria andBarxbIsNull() {
            addCriterion("barxb is null");
            return (Criteria) this;
        }

        public Criteria andBarxbIsNotNull() {
            addCriterion("barxb is not null");
            return (Criteria) this;
        }

        public Criteria andBarxbEqualTo(String value) {
            addCriterion("barxb =", value, "barxb");
            return (Criteria) this;
        }

        public Criteria andBarxbNotEqualTo(String value) {
            addCriterion("barxb <>", value, "barxb");
            return (Criteria) this;
        }

        public Criteria andBarxbGreaterThan(String value) {
            addCriterion("barxb >", value, "barxb");
            return (Criteria) this;
        }

        public Criteria andBarxbGreaterThanOrEqualTo(String value) {
            addCriterion("barxb >=", value, "barxb");
            return (Criteria) this;
        }

        public Criteria andBarxbLessThan(String value) {
            addCriterion("barxb <", value, "barxb");
            return (Criteria) this;
        }

        public Criteria andBarxbLessThanOrEqualTo(String value) {
            addCriterion("barxb <=", value, "barxb");
            return (Criteria) this;
        }

        public Criteria andBarxbLike(String value) {
            addCriterion("barxb like", value, "barxb");
            return (Criteria) this;
        }

        public Criteria andBarxbNotLike(String value) {
            addCriterion("barxb not like", value, "barxb");
            return (Criteria) this;
        }

        public Criteria andBarxbIn(List<String> values) {
            addCriterion("barxb in", values, "barxb");
            return (Criteria) this;
        }

        public Criteria andBarxbNotIn(List<String> values) {
            addCriterion("barxb not in", values, "barxb");
            return (Criteria) this;
        }

        public Criteria andBarxbBetween(String value1, String value2) {
            addCriterion("barxb between", value1, value2, "barxb");
            return (Criteria) this;
        }

        public Criteria andBarxbNotBetween(String value1, String value2) {
            addCriterion("barxb not between", value1, value2, "barxb");
            return (Criteria) this;
        }
        
        
        //分界线
        
        public Criteria andBarnlIsNull() {
            addCriterion("barnl is null");
            return (Criteria) this;
        }

        public Criteria andBarnlIsNotNull() {
            addCriterion("barnl is not null");
            return (Criteria) this;
        }

        public Criteria andBarnlEqualTo(String value) {
            addCriterion("barnl =", value, "barnl");
            return (Criteria) this;
        }

        public Criteria andBarnlNotEqualTo(String value) {
            addCriterion("barnl <>", value, "barnl");
            return (Criteria) this;
        }

        public Criteria andBarnlGreaterThan(String value) {
            addCriterion("barnl >", value, "barnl");
            return (Criteria) this;
        }

        public Criteria andBarnlGreaterThanOrEqualTo(String value) {
            addCriterion("barnl >=", value, "barnl");
            return (Criteria) this;
        }

        public Criteria andBarnlLessThan(String value) {
            addCriterion("barnl <", value, "barnl");
            return (Criteria) this;
        }

        public Criteria andBarnlLessThanOrEqualTo(String value) {
            addCriterion("barnl <=", value, "barnl");
            return (Criteria) this;
        }

        public Criteria andBarnlLike(String value) {
            addCriterion("barnl like", value, "barnl");
            return (Criteria) this;
        }

        public Criteria andBarnlNotLike(String value) {
            addCriterion("barnl not like", value, "barnl");
            return (Criteria) this;
        }

        public Criteria andBarnlIn(List<String> values) {
            addCriterion("barnl in", values, "barnl");
            return (Criteria) this;
        }

        public Criteria andBarnlNotIn(List<String> values) {
            addCriterion("barnl not in", values, "barnl");
            return (Criteria) this;
        }

        public Criteria andBarnlBetween(String value1, String value2) {
            addCriterion("barnl between", value1, value2, "barnl");
            return (Criteria) this;
        }

        public Criteria andBarnlNotBetween(String value1, String value2) {
            addCriterion("barnl not between", value1, value2, "barnl");
            return (Criteria) this;
        }
        
        
        //分界线
        public Criteria andBarjzdqhIsNull() {
            addCriterion("barjzdqh is null");
            return (Criteria) this;
        }

        public Criteria andBarjzdqhIsNotNull() {
            addCriterion("barjzdqh is not null");
            return (Criteria) this;
        }

        public Criteria andBarjzdqhEqualTo(String value) {
            addCriterion("barjzdqh =", value, "barjzdqh");
            return (Criteria) this;
        }

        public Criteria andBarjzdqhNotEqualTo(String value) {
            addCriterion("barjzdqh <>", value, "barjzdqh");
            return (Criteria) this;
        }

        public Criteria andBarjzdqhGreaterThan(String value) {
            addCriterion("barjzdqh >", value, "barjzdqh");
            return (Criteria) this;
        }

        public Criteria andBarjzdqhGreaterThanOrEqualTo(String value) {
            addCriterion("barjzdqh >=", value, "barjzdqh");
            return (Criteria) this;
        }

        public Criteria andBarjzdqhLessThan(String value) {
            addCriterion("barjzdqh <", value, "barjzdqh");
            return (Criteria) this;
        }

        public Criteria andBarjzdqhLessThanOrEqualTo(String value) {
            addCriterion("barjzdqh <=", value, "barjzdqh");
            return (Criteria) this;
        }

        public Criteria andBarjzdqhLike(String value) {
            addCriterion("barjzdqh like", value, "barjzdqh");
            return (Criteria) this;
        }

        public Criteria andBarjzdqhNotLike(String value) {
            addCriterion("barjzdqh not like", value, "barjzdqh");
            return (Criteria) this;
        }

        public Criteria andBarjzdqhIn(List<String> values) {
            addCriterion("barjzdqh in", values, "barjzdqh");
            return (Criteria) this;
        }

        public Criteria andBarjzdqhNotIn(List<String> values) {
            addCriterion("barjzdqh not in", values, "barjzdqh");
            return (Criteria) this;
        }

        public Criteria andBarjzdqhBetween(String value1, String value2) {
            addCriterion("barjzdqh between", value1, value2, "barjzdqh");
            return (Criteria) this;
        }

        public Criteria andBarjzdqhNotBetween(String value1, String value2) {
            addCriterion("barjzdqh not between", value1, value2, "barjzdqh");
            return (Criteria) this;
        }
        
        public Criteria andBardhIsNull() {
            addCriterion("bardh is null");
            return (Criteria) this;
        }

        public Criteria andBardhIsNotNull() {
            addCriterion("bardh is not null");
            return (Criteria) this;
        }

        public Criteria andBardhEqualTo(String value) {
            addCriterion("bardh =", value, "bardh");
            return (Criteria) this;
        }

        public Criteria andBardhNotEqualTo(String value) {
            addCriterion("bardh <>", value, "bardh");
            return (Criteria) this;
        }

        public Criteria andBardhGreaterThan(String value) {
            addCriterion("bardh >", value, "bardh");
            return (Criteria) this;
        }

        public Criteria andBardhGreaterThanOrEqualTo(String value) {
            addCriterion("bardh >=", value, "bardh");
            return (Criteria) this;
        }

        public Criteria andBardhLessThan(String value) {
            addCriterion("bardh <", value, "bardh");
            return (Criteria) this;
        }

        public Criteria andBardhLessThanOrEqualTo(String value) {
            addCriterion("bardh <=", value, "bardh");
            return (Criteria) this;
        }

        public Criteria andBardhLike(String value) {
            addCriterion("bardh like", value, "bardh");
            return (Criteria) this;
        }

        public Criteria andBardhNotLike(String value) {
            addCriterion("bardh not like", value, "bardh");
            return (Criteria) this;
        }

        public Criteria andBardhIn(List<String> values) {
            addCriterion("bardh in", values, "bardh");
            return (Criteria) this;
        }

        public Criteria andBardhNotIn(List<String> values) {
            addCriterion("bardh not in", values, "bardh");
            return (Criteria) this;
        }

        public Criteria andBardhBetween(String value1, String value2) {
            addCriterion("bardh between", value1, value2, "bardh");
            return (Criteria) this;
        }

        public Criteria andBardhNotBetween(String value1, String value2) {
            addCriterion("bardh not between", value1, value2, "bardh");
            return (Criteria) this;
        }

        public Criteria andBarsjjzdIsNull() {
            addCriterion("barsjjzd is null");
            return (Criteria) this;
        }

        public Criteria andBarsjjzdIsNotNull() {
            addCriterion("barsjjzd is not null");
            return (Criteria) this;
        }

        public Criteria andBarsjjzdEqualTo(String value) {
            addCriterion("barsjjzd =", value, "barsjjzd");
            return (Criteria) this;
        }

        public Criteria andBarsjjzdNotEqualTo(String value) {
            addCriterion("barsjjzd <>", value, "barsjjzd");
            return (Criteria) this;
        }

        public Criteria andBarsjjzdGreaterThan(String value) {
            addCriterion("barsjjzd >", value, "barsjjzd");
            return (Criteria) this;
        }

        public Criteria andBarsjjzdGreaterThanOrEqualTo(String value) {
            addCriterion("barsjjzd >=", value, "barsjjzd");
            return (Criteria) this;
        }

        public Criteria andBarsjjzdLessThan(String value) {
            addCriterion("barsjjzd <", value, "barsjjzd");
            return (Criteria) this;
        }

        public Criteria andBarsjjzdLessThanOrEqualTo(String value) {
            addCriterion("barsjjzd <=", value, "barsjjzd");
            return (Criteria) this;
        }

        public Criteria andBarsjjzdLike(String value) {
            addCriterion("barsjjzd like", value, "barsjjzd");
            return (Criteria) this;
        }

        public Criteria andBarsjjzdNotLike(String value) {
            addCriterion("barsjjzd not like", value, "barsjjzd");
            return (Criteria) this;
        }

        public Criteria andBarsjjzdIn(List<String> values) {
            addCriterion("barsjjzd in", values, "barsjjzd");
            return (Criteria) this;
        }

        public Criteria andBarsjjzdNotIn(List<String> values) {
            addCriterion("barsjjzd not in", values, "barsjjzd");
            return (Criteria) this;
        }

        public Criteria andBarsjjzdBetween(String value1, String value2) {
            addCriterion("barsjjzd between", value1, value2, "barsjjzd");
            return (Criteria) this;
        }

        public Criteria andBarsjjzdNotBetween(String value1, String value2) {
            addCriterion("barsjjzd not between", value1, value2, "barsjjzd");
            return (Criteria) this;
        }

        public Criteria andJjbhIsNull() {
            addCriterion("jjbh is null");
            return (Criteria) this;
        }

        public Criteria andJjbhIsNotNull() {
            addCriterion("jjbh is not null");
            return (Criteria) this;
        }

        public Criteria andJjbhEqualTo(String value) {
            addCriterion("jjbh =", value, "jjbh");
            return (Criteria) this;
        }

        public Criteria andJjbhNotEqualTo(String value) {
            addCriterion("jjbh <>", value, "jjbh");
            return (Criteria) this;
        }

        public Criteria andJjbhGreaterThan(String value) {
            addCriterion("jjbh >", value, "jjbh");
            return (Criteria) this;
        }

        public Criteria andJjbhGreaterThanOrEqualTo(String value) {
            addCriterion("jjbh >=", value, "jjbh");
            return (Criteria) this;
        }

        public Criteria andJjbhLessThan(String value) {
            addCriterion("jjbh <", value, "jjbh");
            return (Criteria) this;
        }

        public Criteria andJjbhLessThanOrEqualTo(String value) {
            addCriterion("jjbh <=", value, "jjbh");
            return (Criteria) this;
        }

        public Criteria andJjbhLike(String value) {
            addCriterion("jjbh like", value, "jjbh");
            return (Criteria) this;
        }

        public Criteria andJjbhNotLike(String value) {
            addCriterion("jjbh not like", value, "jjbh");
            return (Criteria) this;
        }

        public Criteria andJjbhIn(List<String> values) {
            addCriterion("jjbh in", values, "jjbh");
            return (Criteria) this;
        }

        public Criteria andJjbhNotIn(List<String> values) {
            addCriterion("jjbh not in", values, "jjbh");
            return (Criteria) this;
        }

        public Criteria andJjbhBetween(String value1, String value2) {
            addCriterion("jjbh between", value1, value2, "jjbh");
            return (Criteria) this;
        }

        public Criteria andJjbhNotBetween(String value1, String value2) {
            addCriterion("jjbh not between", value1, value2, "jjbh");
            return (Criteria) this;
        }
        
        //分界线
        
        public Criteria andJbdwIsNull() {
            addCriterion("jbdw is null");
            return (Criteria) this;
        }

        public Criteria andJbdwIsNotNull() {
            addCriterion("jbdw is not null");
            return (Criteria) this;
        }

        public Criteria andJbdwEqualTo(String value) {
            addCriterion("jbdw =", value, "jbdw");
            return (Criteria) this;
        }

        public Criteria andJbdwNotEqualTo(String value) {
            addCriterion("jbdw <>", value, "jbdw");
            return (Criteria) this;
        }

        public Criteria andJbdwGreaterThan(String value) {
            addCriterion("jbdw >", value, "jbdw");
            return (Criteria) this;
        }

        public Criteria andJbdwGreaterThanOrEqualTo(String value) {
            addCriterion("jbdw >=", value, "jbdw");
            return (Criteria) this;
        }

        public Criteria andJbdwLessThan(String value) {
            addCriterion("jbdw <", value, "jbdw");
            return (Criteria) this;
        }

        public Criteria andJbdwLessThanOrEqualTo(String value) {
            addCriterion("jbdw <=", value, "jbdw");
            return (Criteria) this;
        }

        public Criteria andJbdwLike(String value) {
            addCriterion("jbdw like", value, "jbdw");
            return (Criteria) this;
        }

        public Criteria andJbdwNotLike(String value) {
            addCriterion("jbdw not like", value, "jbdw");
            return (Criteria) this;
        }

        public Criteria andJbdwIn(List<String> values) {
            addCriterion("jbdw in", values, "jbdw");
            return (Criteria) this;
        }

        public Criteria andJbdwNotIn(List<String> values) {
            addCriterion("jbdw not in", values, "jbdw");
            return (Criteria) this;
        }

        public Criteria andJbdwBetween(String value1, String value2) {
            addCriterion("jbdw between", value1, value2, "jbdw");
            return (Criteria) this;
        }

        public Criteria andJbdwNotBetween(String value1, String value2) {
            addCriterion("jbdw not between", value1, value2, "jbdw");
            return (Criteria) this;
        }
        
        
        //分界线
        
        public Criteria andBcabIsNull() {
            addCriterion("bcab is null");
            return (Criteria) this;
        }

        public Criteria andBcabIsNotNull() {
            addCriterion("bcab is not null");
            return (Criteria) this;
        }

        public Criteria andBcabEqualTo(String value) {
            addCriterion("bcab =", value, "bcab");
            return (Criteria) this;
        }

        public Criteria andBcabNotEqualTo(String value) {
            addCriterion("bcab <>", value, "bcab");
            return (Criteria) this;
        }

        public Criteria andBcabGreaterThan(String value) {
            addCriterion("bcab >", value, "bcab");
            return (Criteria) this;
        }

        public Criteria andBcabGreaterThanOrEqualTo(String value) {
            addCriterion("bcab >=", value, "bcab");
            return (Criteria) this;
        }

        public Criteria andBcabLessThan(String value) {
            addCriterion("bcab <", value, "bcab");
            return (Criteria) this;
        }

        public Criteria andBcabLessThanOrEqualTo(String value) {
            addCriterion("bcab <=", value, "bcab");
            return (Criteria) this;
        }

        public Criteria andBcabLike(String value) {
            addCriterion("bcab like", value, "bcab");
            return (Criteria) this;
        }

        public Criteria andBcabNotLike(String value) {
            addCriterion("bcab not like", value, "bcab");
            return (Criteria) this;
        }

        public Criteria andBcabIn(List<String> values) {
            addCriterion("bcab in", values, "bcab");
            return (Criteria) this;
        }

        public Criteria andBcabNotIn(List<String> values) {
            addCriterion("bcab not in", values, "bcab");
            return (Criteria) this;
        }

        public Criteria andBcabBetween(String value1, String value2) {
            addCriterion("bcab between", value1, value2, "bcab");
            return (Criteria) this;
        }

        public Criteria andBcabNotBetween(String value1, String value2) {
            addCriterion("bcab not between", value1, value2, "bcab");
            return (Criteria) this;
        }
        
        
        //分界线
        public Criteria andCbrIsNull() {
            addCriterion("cbr is null");
            return (Criteria) this;
        }

        public Criteria andCbrIsNotNull() {
            addCriterion("cbr is not null");
            return (Criteria) this;
        }

        public Criteria andCbrEqualTo(String value) {
            addCriterion("cbr =", value, "cbr");
            return (Criteria) this;
        }

        public Criteria andCbrNotEqualTo(String value) {
            addCriterion("cbr <>", value, "cbr");
            return (Criteria) this;
        }

        public Criteria andCbrGreaterThan(String value) {
            addCriterion("cbr >", value, "cbr");
            return (Criteria) this;
        }

        public Criteria andCbrGreaterThanOrEqualTo(String value) {
            addCriterion("cbr >=", value, "cbr");
            return (Criteria) this;
        }

        public Criteria andCbrLessThan(String value) {
            addCriterion("cbr <", value, "cbr");
            return (Criteria) this;
        }

        public Criteria andCbrLessThanOrEqualTo(String value) {
            addCriterion("cbr <=", value, "cbr");
            return (Criteria) this;
        }

        public Criteria andCbrLike(String value) {
            addCriterion("cbr like", value, "cbr");
            return (Criteria) this;
        }

        public Criteria andCbrNotLike(String value) {
            addCriterion("cbr not like", value, "cbr");
            return (Criteria) this;
        }

        public Criteria andCbrIn(List<String> values) {
            addCriterion("cbr in", values, "cbr");
            return (Criteria) this;
        }

        public Criteria andCbrNotIn(List<String> values) {
            addCriterion("cbr not in", values, "cbr");
            return (Criteria) this;
        }

        public Criteria andCbrBetween(String value1, String value2) {
            addCriterion("cbr between", value1, value2, "cbr");
            return (Criteria) this;
        }

        public Criteria andCbrNotBetween(String value1, String value2) {
            addCriterion("cbr not between", value1, value2, "cbr");
            return (Criteria) this;
        }
        
        //2019/07/16  终止于承办人字段
        public Criteria andSjcIsNull() {
			addCriterion("sjc is null");
			return (Criteria) this;
		}

		public Criteria andSjcIsNotNull() {
			addCriterion("sjc is not null");
			return (Criteria) this;
		}

		public Criteria andSjcEqualTo(String value) {
			addCriterion("sjc =", value, "sjc");
			return (Criteria) this;
		}

		public Criteria andSjcNotEqualTo(String value) {
			addCriterion("sjc <>", value, "sjc");
			return (Criteria) this;
		}

		public Criteria andSjcGreaterThan(String value) {
			addCriterion("sjc >", value, "sjc");
			return (Criteria) this;
		}

		public Criteria andSjcGreaterThanOrEqualTo(String value) {
			addCriterion("sjc >=", value, "sjc");
			return (Criteria) this;
		}

		public Criteria andSjcLessThan(String value) {
			addCriterion("sjc <", value, "sjc");
			return (Criteria) this;
		}

		public Criteria andSjcLessThanOrEqualTo(String value) {
			addCriterion("sjc <=", value, "sjc");
			return (Criteria) this;
		}

		public Criteria andSjcLike(String value) {
			addCriterion("sjc like", value, "sjc");
			return (Criteria) this;
		}

		public Criteria andSjcNotLike(String value) {
			addCriterion("sjc not like", value, "sjc");
			return (Criteria) this;
		}

		public Criteria andSjcIn(List<String> values) {
			addCriterion("sjc in", values, "sjc");
			return (Criteria) this;
		}

		public Criteria andSjcNotIn(List<String> values) {
			addCriterion("sjc not in", values, "sjc");
			return (Criteria) this;
		}

		public Criteria andSjcBetween(String value1, String value2) {
			addCriterion("sjc between", value1, value2, "sjc");
			return (Criteria) this;
		}

		public Criteria andSjcNotBetween(String value1, String value2) {
			addCriterion("sjc not between", value1, value2, "sjc");
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
