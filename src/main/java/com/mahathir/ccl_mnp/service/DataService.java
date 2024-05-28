package com.mahathir.ccl_mnp.service;

import com.mahathir.ccl_mnp.dto.PhoneNumberDetails;
import com.mahathir.ccl_mnp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DataService {

    private UserRepository userRepository;

    @Autowired
    public DataService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public int findRecepientRC(String number) {
        Optional<PhoneNumberDetails> optionalPhoneNumberDetails = userRepository.findById(number);
        return optionalPhoneNumberDetails.map(PhoneNumberDetails::getRecipientRC)
                .orElse(0); // Default value if no entity is found
    }
}

