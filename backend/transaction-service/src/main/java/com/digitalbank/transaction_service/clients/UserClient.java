package com.digitalbank.transaction_service.clients;

import com.digitalbank.transaction_service.responses.UserResponse;
import java.util.Optional;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "accounts-service")
public interface UserClient {
    @GetMapping("/api/accounts/{id}")
    Optional<UserResponse> findById(@PathVariable("id") Long id);
}
