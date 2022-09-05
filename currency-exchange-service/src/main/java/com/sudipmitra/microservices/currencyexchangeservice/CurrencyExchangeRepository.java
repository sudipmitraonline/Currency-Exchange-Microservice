package com.sudipmitra.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange,Long> {

		CurrencyExchange findByFromAndTO(String from, String to);
}
