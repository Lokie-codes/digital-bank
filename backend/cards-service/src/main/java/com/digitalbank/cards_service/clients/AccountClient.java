package com.digitalbank.cards_service.clients;

import com.digitalbank.cards_service.responses.AccountResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@FeignClient(name = "AccountService", url = "http://localhost:8082/api")
public interface AccountClient {
    @GetMapping("/accounts/{id}")
    Optional<AccountResponse> findById(@PathVariable("id") Long id);

    @GetMapping("/accounts/search")
    Optional<AccountResponse> findByAccountNumber(@RequestParam("accountNumber") int accountNumber);


}
