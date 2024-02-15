package site.acatech.service;

import org.jetbrains.annotations.NotNull;
import site.acatech.entity.Invoice;
import site.acatech.repository.InvoiceRepository;

public class InvoiceService {
    private static long lastNumber = 0L;

    private InvoiceRepository invoiceRepository = new InvoiceRepository();
    public void createInvoice(@NotNull Invoice invoice) {
        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }
}
