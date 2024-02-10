package com.jobApplication.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobApplication.model.Review;
@Repository
public interface ReviewRepo extends JpaRepository<Review, Long> {

	List<Review> findByCompanyId(long companyId);

}
