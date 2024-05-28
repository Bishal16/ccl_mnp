package com.mahathir.ccl_mnp.repository;

import com.mahathir.ccl_mnp.dto.PhoneNumberDetails;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<PhoneNumberDetails, String>{
    Optional<PhoneNumberDetails> findById(String number);

}
