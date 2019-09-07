package com.infyniteloop.rrms.repository;

import org.springframework.data.repository.CrudRepository;

import com.infyniteloop.rrms.model.Feedback;

public interface FeedbackRepository extends CrudRepository<Feedback, String> {

}
