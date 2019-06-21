package com.example.chatbot.dao;

import com.example.chatbot.domain.Question;
import com.example.chatbot.domain.QuestionExample;
import com.example.chatbot.domain.hotQuestion;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.*;

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

    @Select("SELECT * FROM question")
    Page<Question> selectAll();

    @Delete("DELETE FROM question where ques_id = #{id}")
    int deleteQuestion(@Param("id") String id);

    @Update("UPDATE question set o1 = ifnull(o1,0) + 1 where ques_id = #{id}")
    int updateNum(@Param("id") String id);

    @Select("SELECT * from question order by o1 desc limit 10")
    List<Question> selectHotQuestion();

    //未录入热点问题处理
    @Select("SELECT * from hotQuestion where question LIKE '%${key}%'")
    List<hotQuestion> selectOutHotQuestion(@Param("key") String key);

    @Insert("INSERT into hotQuestion (question,num) values(#{question},1)")
    int insertOutHotQuestion(@Param("question") String question);

    @Update("UPDATE hotQuestion set num = num + 1 where id = #{id}")
    int updateOutHotQuestion(@Param("id") String id);

    @Select("SELECT * from hotQuestion order by num desc limit 20")
    List<hotQuestion> selectOutHotQuestions();

}