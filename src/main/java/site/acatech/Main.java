package site.acatech;

import site.acatech.entity.Invoice;
import site.acatech.service.InvoiceService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What's a customer name!");
        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();

        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);

        InvoiceService invoiceService = new InvoiceService();
        invoiceService.createInvoice(invoice);
    }
}