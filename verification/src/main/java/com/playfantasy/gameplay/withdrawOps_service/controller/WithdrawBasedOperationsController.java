package com.playfantasy.gameplay.withdrawOps_service.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.playfantasy.gameplay.withdrawOps_service.model.RestResponse;
import com.playfantasy.gameplay.withdrawOps_service.service.DifferentWithdrawOperationsService;

@RestController
public class WithdrawBasedOperationsController {

	@PutMapping("/update/withdrawReq/Approved/{withdrawId}")
	public RestResponse approvingAWithdrawRequest(@PathVariable long withdrawId) {
		RestResponse rest = DifferentWithdrawOperationsService.approvingAWithdrawRequest(withdrawId);
		return rest;
	}

	@PutMapping("/update/withdrawReq/Credited-Online/{withdrawId}")
	public RestResponse markWithdrawReqCreditedOnline(@PathVariable long withdrawId) {
		RestResponse rest = DifferentWithdrawOperationsService.markingWithdrawReqCreditedOnline(withdrawId);
		return rest;
	}

	@PutMapping("/update/withdrawReq/to/Failed-Online/{withdrawId}")
	public RestResponse markWithdrawReqFailedOnline(@PathVariable long withdrawId) {
		RestResponse rest = DifferentWithdrawOperationsService.markingWithdrawReqFailedOnline(withdrawId);
		return rest;
	}

	@PutMapping("/update/withdrawReq-OnHold/{withdrawId}")
	public RestResponse markWithdrawReqON_Hold(@PathVariable  long withdrawId) {
		RestResponse rest = DifferentWithdrawOperationsService.markingWithdrawReqON_Hold(withdrawId);
		return rest;
	}

}
