package com.OCP_Practice_Exam.DAO;

import com.OCP_Practice_Exam.Entity.OCP;
import com.OCP_Practice_Exam.Entity.Score;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface OCPMapper {
    ArrayList<OCP> OCP_Exam();

    Integer submitScore(@Param(value = "Score") Score score);

    ArrayList<Score> check_score();
}
