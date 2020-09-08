package com.cresco.assesment.service;

import java.util.List;

import com.cresco.assesment.model.QuestionProperties;

public interface QuestionPropertiesService {
public List<QuestionProperties> getAllQuestionProp();
public List<QuestionProperties> getQuestionByNumber(Long AsssessmentId,Long SectionId);
public QuestionProperties createOrUpdateQuestionProp(QuestionProperties properties);
public void deleteByQuestionNo(Long Questionid);
}
