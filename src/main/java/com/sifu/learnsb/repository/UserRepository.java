package com.sifu.learnsb.repository;

import com.sifu.learnsb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// ket noi db
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    boolean existsByUsername(String username);

}
