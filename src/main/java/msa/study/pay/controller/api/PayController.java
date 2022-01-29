package msa.study.pay.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@Api(value="pay", tags="결제 api")
public class PayController {
	
	@Operation(summary = "결제내역 리스트 조회", description = "결제내역 리스트 조회")
	@GetMapping("pay")
	private String payList() {
		return "pay list...";
	}
	
	@Operation(summary = "결제", description = "결제")
	@PostMapping("pay")
	private String pay() {
		return "pay...";
	}
	
	@Operation(summary = "결제내역 상세조회", description = "결제내역 상세조회")
	@GetMapping("pay/{id}")
	private String payDetail(@PathVariable("id") int id) {
		return "pay detail..." + id;
	}
	
	@Operation(summary = "결제 취소", description = "결제 취소")
	@PostMapping("pay/cancle/{id}")
	private String payCancle(@PathVariable("id") int id) {
		return "pay cancle...";
	}
}


