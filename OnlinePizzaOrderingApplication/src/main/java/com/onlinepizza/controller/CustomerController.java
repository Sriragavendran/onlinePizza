package com.onlinepizza.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinepizza.model.Customer;
import com.onlinepizza.service.CustomerServiceImpl;

@RestController
@RequestMapping("/customer") // http://localhost:1206/customer
public class CustomerController {
	@Autowired
	private CustomerServiceImpl service;

	@GetMapping("/view/{customerId}") // http://localhost:1206/customer/view/customerId
	public Optional<Customer> viewCustomer(@PathVariable Integer customerId) {
		return service.viewCustomer(customerId);

	}

	@PostMapping("/create") // http://localhost:1206/create
	public ResponseEntity<Boolean> addCustomer(@RequestBody Customer customer) {
		customer = service.addCustomer(customer);

		ResponseEntity<Boolean> responseEntity = new ResponseEntity<Boolean>(true, HttpStatus.OK);
		return responseEntity;
	}

	@PutMapping("/update") // http://localhost:1206/customer/update
	public ResponseEntity<String> updateCustomer(@RequestBody Customer customer) {
		customer = service.updateCustomer(customer);

		ResponseEntity<String> responseEntity = new ResponseEntity<String>("Details Updated SuccesFully",
				HttpStatus.OK);
		return responseEntity;
	}

	@DeleteMapping("/delete/{customerId}") // http://localhost:1206/customer/delete
	public String deleteCustomer(@PathVariable Integer customerId) {

		return service.deleteCustomer(customerId);

	}

	@GetMapping("/all") // http://localhost:1206/customer/all
	public ResponseEntity<Iterable<Customer>> listAll() {
		Iterable<Customer> list = service.viewCustomersList();
		return new ResponseEntity<>(list, new HttpHeaders(), HttpStatus.OK);
	}

}
