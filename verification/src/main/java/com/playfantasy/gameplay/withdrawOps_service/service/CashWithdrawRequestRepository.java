package com.playfantasy.gameplay.withdrawOps_service.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.playfantasy.gameplay.withdrawOps_service.model.cash_withdraw_request;

public interface CashWithdrawRequestRepository extends JpaRepository<cash_withdraw_request, Integer> {

}
