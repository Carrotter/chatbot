package com.example.chatbot.dao;

import com.example.chatbot.domain.Question;
import com.example.chatbot.domain.QuestionExample;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionMapper {
    int countByExample(QuestionExample example);

    int deleteByExample(QuestionExample example);

    int deleteByPrimaryKey(Integer quesId);

    int insert(Question record);

    int insertSelective(Question record);

    List<Question> selectByExample(QuestionExample example);

    Question selectByPrimaryKey(Integer quesId);

    int updateByExampleSelective(@Param("record") Question record, @Param("example") QuestionExample example);

    int updateByExample(@Param("record") Question record, @Param("example") QuestionExample example);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKey(Question record);

    @Select("SELECT * FROM question WHERE question LIKE '%${key}%'")
    List<Question> selectLike(@Param("key") String key);

    @Insert("INSERT INTO question(question,answer) VALUES(#{q},#{a})")
    int insertQuestion(@Param("q") String question, @Param("a") String answer);
}