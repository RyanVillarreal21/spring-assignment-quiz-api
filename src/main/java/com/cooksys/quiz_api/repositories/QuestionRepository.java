package com.cooksys.quiz_api.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cooksys.quiz_api.entities.Question;

// You may think you don't need this Repository, but remember each Repository interface
// only allows you to interact with the 1 table it maps to, so in order to save or retrieve
// questions directly you need to use this interface. You can still access Questions stored on a Quiz
// without using this interface.
@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

  // TODO: Do you need any derived queries? If so add them here.
	Optional<Question> findById(Long id);

	Question getQuestionById(Question questionToFind);
	
	Optional<Question> findByIdAndDeletedFalse(Long id);
	
	List<Question> findAllByDeletedFalse();

}