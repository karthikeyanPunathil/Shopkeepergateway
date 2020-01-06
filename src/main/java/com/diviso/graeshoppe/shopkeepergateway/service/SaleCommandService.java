package com.diviso.graeshoppe.shopkeepergateway.service;

import org.springframework.http.ResponseEntity;



public interface SaleCommandService {

	public ResponseEntity<SaleDTO> createSale(SaleDTO saleDTO);
	
	public ResponseEntity<SaleDTO> updateSale(SaleDTO saleDTO);
	
	public void deleteSale(Long id);
	
	public ResponseEntity<TicketLineDTO> createTickerLine(TicketLineDTO ticketLineDTO);
	
	public ResponseEntity<TicketLineDTO> updateTicketLine(TicketLineDTO ticketLineDTO);
	
	public void deleteTicketline(Long id);
}
