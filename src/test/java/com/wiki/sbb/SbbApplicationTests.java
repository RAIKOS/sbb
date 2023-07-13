package com.wiki.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.wiki.sbb.question.Question;
import com.wiki.sbb.question.QuestionRepository;

@SpringBootTest
class SbbApplicationTests {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Transactional	
	@Test
	void testJpa() {
		
		 Question q = this.questionRepository.findBySubject("질문 1");
		 assertEquals(1, q.getId());
	}
}
