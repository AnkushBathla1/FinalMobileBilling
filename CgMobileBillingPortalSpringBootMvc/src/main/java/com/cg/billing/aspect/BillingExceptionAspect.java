package com.cg.billing.aspect;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.cg.billing.exceptions.BillDetailsNotFoundException;
import com.cg.billing.exceptions.CustomerDetailsNotFoundException;
import com.cg.billing.exceptions.InvalidBillMonthException;
import com.cg.billing.exceptions.PlanDetailsNotFoundException;
import com.cg.billing.exceptions.PostpaidAccountNotFoundException;

@ControllerAdvice
public class BillingExceptionAspect {
	@ExceptionHandler(CustomerDetailsNotFoundException.class)
	public ModelAndView handelCustomerDetailsNotFoundException(Exception e) {
		System.out.println(e.getMessage());
		return new ModelAndView("showError", "errorMessage", e.getMessage());
	}
	@ExceptionHandler(PostpaidAccountNotFoundException.class)
	public ModelAndView handelPostpaidAccountDetailsNotFoundException(Exception e) {
		System.out.println(e.getMessage());
		return new ModelAndView("showError", "errorMessage", e.getMessage());
	}
	@ExceptionHandler(BillDetailsNotFoundException.class)
	public ModelAndView handleBillDetailsNotFoundException(Exception e) {
		System.out.println(e.getMessage());
		return new ModelAndView("showError", "errorMessage", e.getMessage());
	}
	@ExceptionHandler(PlanDetailsNotFoundException.class)
	public ModelAndView handelPlanDetailsNotFoundException(Exception e) {
		System.out.println(e.getMessage());
		return new ModelAndView("showError", "errorMessage", e.getMessage());
	}
	@ExceptionHandler(InvalidBillMonthException.class)
	public ModelAndView handelInvalidBillMonthException(Exception e) {
		System.out.println(e.getMessage());
		return new ModelAndView("showError", "errorMessage", e.getMessage());
	}
	}
