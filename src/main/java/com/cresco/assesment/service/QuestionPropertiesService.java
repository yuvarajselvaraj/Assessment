package com.cresco.assesment.service;

import java.util.List;

import com.cresco.assesment.model.QuestionProperties;
import com.cresco.assesment.vo.Question;

public interface QuestionPropertiesService {
public List<QuestionProperties> getAllQuestionProp();
public List<QuestionProperties> getQuestionByNumber(Long AsssessmentId,Long SectionId);
public void UpdateQuestionProp(Question properties);
public void deleteByQuestionNo(Long Questionid);
}
