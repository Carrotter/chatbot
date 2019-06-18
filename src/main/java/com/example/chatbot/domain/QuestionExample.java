package com.example.chatbot.domain;

import java.util.ArrayList;
import java.util.List;

public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionExample() {
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

        public Criteria andQuesIdIsNull() {
            addCriterion("ques_id is null");
            return (Criteria) this;
        }

        public Criteria andQuesIdIsNotNull() {
            addCriterion("ques_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuesIdEqualTo(Integer value) {
            addCriterion("ques_id =", value, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdNotEqualTo(Integer value) {
            addCriterion("ques_id <>", value, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdGreaterThan(Integer value) {
            addCriterion("ques_id >", value, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ques_id >=", value, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdLessThan(Integer value) {
            addCriterion("ques_id <", value, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdLessThanOrEqualTo(Integer value) {
            addCriterion("ques_id <=", value, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdIn(List<Integer> values) {
            addCriterion("ques_id in", values, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdNotIn(List<Integer> values) {
            addCriterion("ques_id not in", values, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdBetween(Integer value1, Integer value2) {
            addCriterion("ques_id between", value1, value2, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ques_id not between", value1, value2, "quesId");
            return (Criteria) this;
        }

        public Criteria andQuestionIsNull() {
            addCriterion("question is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIsNotNull() {
            addCriterion("question is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionEqualTo(String value) {
            addCriterion("question =", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotEqualTo(String value) {
            addCriterion("question <>", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThan(String value) {
            addCriterion("question >", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("question >=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThan(String value) {
            addCriterion("question <", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThanOrEqualTo(String value) {
            addCriterion("question <=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLike(String value) {
            addCriterion("question like", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotLike(String value) {
            addCriterion("question not like", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionIn(List<String> values) {
            addCriterion("question in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotIn(List<String> values) {
            addCriterion("question not in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionBetween(String value1, String value2) {
            addCriterion("question between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotBetween(String value1, String value2) {
            addCriterion("question not between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andKeysIsNull() {
            addCriterion("keys is null");
            return (Criteria) this;
        }

        public Criteria andKeysIsNotNull() {
            addCriterion("keys is not null");
            return (Criteria) this;
        }

        public Criteria andKeysEqualTo(String value) {
            addCriterion("keys =", value, "keys");
            return (Criteria) this;
        }

        public Criteria andKeysNotEqualTo(String value) {
            addCriterion("keys <>", value, "keys");
            return (Criteria) this;
        }

        public Criteria andKeysGreaterThan(String value) {
            addCriterion("keys >", value, "keys");
            return (Criteria) this;
        }

        public Criteria andKeysGreaterThanOrEqualTo(String value) {
            addCriterion("keys >=", value, "keys");
            return (Criteria) this;
        }

        public Criteria andKeysLessThan(String value) {
            addCriterion("keys <", value, "keys");
            return (Criteria) this;
        }

        public Criteria andKeysLessThanOrEqualTo(String value) {
            addCriterion("keys <=", value, "keys");
            return (Criteria) this;
        }

        public Criteria andKeysLike(String value) {
            addCriterion("keys like", value, "keys");
            return (Criteria) this;
        }

        public Criteria andKeysNotLike(String value) {
            addCriterion("keys not like", value, "keys");
            return (Criteria) this;
        }

        public Criteria andKeysIn(List<String> values) {
            addCriterion("keys in", values, "keys");
            return (Criteria) this;
        }

        public Criteria andKeysNotIn(List<String> values) {
            addCriterion("keys not in", values, "keys");
            return (Criteria) this;
        }

        public Criteria andKeysBetween(String value1, String value2) {
            addCriterion("keys between", value1, value2, "keys");
            return (Criteria) this;
        }

        public Criteria andKeysNotBetween(String value1, String value2) {
            addCriterion("keys not between", value1, value2, "keys");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andO1IsNull() {
            addCriterion("o1 is null");
            return (Criteria) this;
        }

        public Criteria andO1IsNotNull() {
            addCriterion("o1 is not null");
            return (Criteria) this;
        }

        public Criteria andO1EqualTo(String value) {
            addCriterion("o1 =", value, "o1");
            return (Criteria) this;
        }

        public Criteria andO1NotEqualTo(String value) {
            addCriterion("o1 <>", value, "o1");
            return (Criteria) this;
        }

        public Criteria andO1GreaterThan(String value) {
            addCriterion("o1 >", value, "o1");
            return (Criteria) this;
        }

        public Criteria andO1GreaterThanOrEqualTo(String value) {
            addCriterion("o1 >=", value, "o1");
            return (Criteria) this;
        }

        public Criteria andO1LessThan(String value) {
            addCriterion("o1 <", value, "o1");
            return (Criteria) this;
        }

        public Criteria andO1LessThanOrEqualTo(String value) {
            addCriterion("o1 <=", value, "o1");
            return (Criteria) this;
        }

        public Criteria andO1Like(String value) {
            addCriterion("o1 like", value, "o1");
            return (Criteria) this;
        }

        public Criteria andO1NotLike(String value) {
            addCriterion("o1 not like", value, "o1");
            return (Criteria) this;
        }

        public Criteria andO1In(List<String> values) {
            addCriterion("o1 in", values, "o1");
            return (Criteria) this;
        }

        public Criteria andO1NotIn(List<String> values) {
            addCriterion("o1 not in", values, "o1");
            return (Criteria) this;
        }

        public Criteria andO1Between(String value1, String value2) {
            addCriterion("o1 between", value1, value2, "o1");
            return (Criteria) this;
        }

        public Criteria andO1NotBetween(String value1, String value2) {
            addCriterion("o1 not between", value1, value2, "o1");
            return (Criteria) this;
        }

        public Criteria andO2IsNull() {
            addCriterion("o2 is null");
            return (Criteria) this;
        }

        public Criteria andO2IsNotNull() {
            addCriterion("o2 is not null");
            return (Criteria) this;
        }

        public Criteria andO2EqualTo(String value) {
            addCriterion("o2 =", value, "o2");
            return (Criteria) this;
        }

        public Criteria andO2NotEqualTo(String value) {
            addCriterion("o2 <>", value, "o2");
            return (Criteria) this;
        }

        public Criteria andO2GreaterThan(String value) {
            addCriterion("o2 >", value, "o2");
            return (Criteria) this;
        }

        public Criteria andO2GreaterThanOrEqualTo(String value) {
            addCriterion("o2 >=", value, "o2");
            return (Criteria) this;
        }

        public Criteria andO2LessThan(String value) {
            addCriterion("o2 <", value, "o2");
            return (Criteria) this;
        }

        public Criteria andO2LessThanOrEqualTo(String value) {
            addCriterion("o2 <=", value, "o2");
            return (Criteria) this;
        }

        public Criteria andO2Like(String value) {
            addCriterion("o2 like", value, "o2");
            return (Criteria) this;
        }

        public Criteria andO2NotLike(String value) {
            addCriterion("o2 not like", value, "o2");
            return (Criteria) this;
        }

        public Criteria andO2In(List<String> values) {
            addCriterion("o2 in", values, "o2");
            return (Criteria) this;
        }

        public Criteria andO2NotIn(List<String> values) {
            addCriterion("o2 not in", values, "o2");
            return (Criteria) this;
        }

        public Criteria andO2Between(String value1, String value2) {
            addCriterion("o2 between", value1, value2, "o2");
            return (Criteria) this;
        }

        public Criteria andO2NotBetween(String value1, String value2) {
            addCriterion("o2 not between", value1, value2, "o2");
            return (Criteria) this;
        }

        public Criteria andO3IsNull() {
            addCriterion("o3 is null");
            return (Criteria) this;
        }

        public Criteria andO3IsNotNull() {
            addCriterion("o3 is not null");
            return (Criteria) this;
        }

        public Criteria andO3EqualTo(String value) {
            addCriterion("o3 =", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3NotEqualTo(String value) {
            addCriterion("o3 <>", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3GreaterThan(String value) {
            addCriterion("o3 >", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3GreaterThanOrEqualTo(String value) {
            addCriterion("o3 >=", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3LessThan(String value) {
            addCriterion("o3 <", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3LessThanOrEqualTo(String value) {
            addCriterion("o3 <=", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3Like(String value) {
            addCriterion("o3 like", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3NotLike(String value) {
            addCriterion("o3 not like", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3In(List<String> values) {
            addCriterion("o3 in", values, "o3");
            return (Criteria) this;
        }

        public Criteria andO3NotIn(List<String> values) {
            addCriterion("o3 not in", values, "o3");
            return (Criteria) this;
        }

        public Criteria andO3Between(String value1, String value2) {
            addCriterion("o3 between", value1, value2, "o3");
            return (Criteria) this;
        }

        public Criteria andO3NotBetween(String value1, String value2) {
            addCriterion("o3 not between", value1, value2, "o3");
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