package services;

import java.util.Calendar;
import java.util.Date;

import entidades.Contract;
import entidades.Installment;

public class ContratoService {
	
	private OnlineService onlineService;
	
	public ContratoService(OnlineService onlineService) {
		this.onlineService = onlineService;
	}

	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            Date date = addMonths(contract.getDate(), i);
            double updatedQuota = basicQuota + onlineService.interest(basicQuota, i);
            double fullQuota =  updatedQuota + onlineService.paymentFee(updatedQuota);
            contract.addInstallment(new Installment(date, fullQuota));
        }
	}
	
	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
